package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 库存管理
 */
@Slf4j
public class Stock extends AbstractConlleague {
    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    // 初始化100个
    private static int COMPUTER_NUMBER = 100;

    /**
     * 增加库存
     *
     * @param number
     */
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
    }

    /**
     * 减少库存
     *
     * @param number
     */
    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        log.info(">>>>>库存数量为:{}", COMPUTER_NUMBER);
    }

    /**
     * 获取库存
     *
     * @return
     */
    public int getStock() {
        return COMPUTER_NUMBER;
    }

    /**
     * 清理库存
     */
    public void clearStock() {
        log.info(">>>>>清理库存数量为:{}", COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
