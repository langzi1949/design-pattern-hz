package com.zmglove;

/**
 * 封装对象
 */
public class Context {
     private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 封装以后的策略方法
     */
    public void doAnyThing(){
         this.strategy.doSomething();
    }
}
