package com.zmglove;


/**
 * 抽象中介者
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    /**
     * 构造函数
     */
    public AbstractMediator(){
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    /**
     * 中介者最重要的方法叫做事件方法，处理多个对象之间的关系
     *
     * @param str
     * @param objects
     */
    public abstract void execute(String str, Object... objects);

}
