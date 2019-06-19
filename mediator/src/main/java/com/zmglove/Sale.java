package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 销售管理
 */
@Slf4j
public class Sale extends AbstractConlleague{
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellIBMComputer(int number){
        super.mediator.execute("sale.sell",number);
        log.info(">>>>销售卖了{}台电脑",number);
    }
}
