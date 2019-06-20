package com.zmglove;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * 销售管理
 */
@Slf4j
public class Sale extends AbstractConlleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell", number);
        log.info(">>>>销售卖了{}台电脑", number);
    }

    /**
     * 获取销售状态，随机
     *
     * @return
     */
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        log.info(">>>>>销售情况如下:{}", saleStatus);
        return saleStatus;
    }

    /**
     * 打折处理
     */
    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}
