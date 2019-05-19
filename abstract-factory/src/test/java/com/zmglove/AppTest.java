package com.zmglove;

import org.junit.Test;

/**
 * 测试类
 */
public class AppTest {

    @Test
    public void test(){
        // 第一个工厂，专门生产1级产品
        Factory factory1 =  new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        productA1.getColor();
        productA1.getColor();
        // 第二个工厂，专门生产2级产品
        Factory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();

        productA2.getColor();
        productB2.getColor();
    }
}
