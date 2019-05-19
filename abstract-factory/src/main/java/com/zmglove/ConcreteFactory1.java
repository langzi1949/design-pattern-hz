package com.zmglove;

/**
 * 这个工厂专门生产1号产品
 */
public class ConcreteFactory1 implements  Factory{
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
