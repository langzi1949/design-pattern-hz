package com.zmglove;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 测试类
 */
@Slf4j
public class IteratorTest {

    @Test
    public void test(){
        // 首先创建一个容器
        IProject project = new ConcreteProject();
        // 第一个元素
        project.add("abc");
        project.add("123");
        project.add("first");

        // 遍历
        Iterator iterator = project.iterator();
        while(iterator.hasNext()){
            log.info((String)iterator.next());
        }

    }
}
