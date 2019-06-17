package com.zmglove;

/**
 * 抽象同事类
 */
public class AbstractConlleague {
    protected  AbstractMediator mediator;


    public AbstractConlleague(AbstractMediator mediator){
        this.mediator = mediator;
    }
}
