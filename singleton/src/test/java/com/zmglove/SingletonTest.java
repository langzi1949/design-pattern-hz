package com.zmglove;

import org.junit.Test;

import java.util.function.Supplier;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * 基本测试类
 * @param <S>
 */
public abstract  class SingletonTest<S>{

    private final Supplier<S> singletonInstanceMethod;

    public SingletonTest(final Supplier<S> singletonInstanceMethod){
        this.singletonInstanceMethod = singletonInstanceMethod;
    }

    @Test
    public void multiCallReturnSameObjectInSameThreadTest(){
        S instance1 = this.singletonInstanceMethod.get();
        S instance2 = this.singletonInstanceMethod.get();
        S instance3 = this.singletonInstanceMethod.get();
        assertSame(instance1,instance2);
        assertSame(instance1,instance3);
        assertSame(instance2,instance3);

    }

}
