package com.zmglove;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTimeout;

/**
 * 基本测试类
 * @param <S>
 */
@Slf4j
public abstract  class SingletonTest<S>{

    private final Supplier<S> singletonInstanceMethod;

    public SingletonTest(final Supplier<S> singletonInstanceMethod){
        this.singletonInstanceMethod = singletonInstanceMethod;
    }

    @Test
    public void testMultiCallReturnSameObjectInSameThread(){
        S instance1 = this.singletonInstanceMethod.get();
        S instance2 = this.singletonInstanceMethod.get();
        S instance3 = this.singletonInstanceMethod.get();
        assertSame(instance1,instance2);
        assertSame(instance1,instance3);
        assertSame(instance2,instance3);
    }

    @Test
    public void testMultiCallReturnSameObjectInDiffThread(){
        Set<String> instanceSet  = Sets.newHashSet();
        assertTimeout(Duration.ofMillis(10000),() -> {
            // 创建 10000个tasks
            final List<Callable<S>> tasks = Lists.newArrayList();
            for(int i = 0;i < 1000000;i++){
                tasks.add(this.singletonInstanceMethod::get);
            }
            //使用8个线程进行测试
            final ExecutorService executorService = Executors.newFixedThreadPool(8);
            final List<Future<S>> results = executorService.invokeAll(tasks);

            //等待所有的线程结束
            final S expectedInstance = this.singletonInstanceMethod.get();
            for(Future<S> res : results){
                final S instance = res.get();
                instanceSet.add(instance.toString());
                assertNotNull(instance,"xxxx");
                assertSame(expectedInstance,instance);
            }

            log.info(">>>>{}",instanceSet);
            // 关闭
            executorService.shutdown();
        });
    }

}
