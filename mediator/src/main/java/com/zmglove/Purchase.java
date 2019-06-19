package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 采购管理
 */
@Slf4j
public class Purchase extends AbstractConlleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 采购IBM电脑
     *
     * @param number
     */
    public void buyIBMComputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    /**
     * 不再采购电脑
     */
    public void refuseByIBM() {
        log.info(">>>>>>不再采购电脑");
    }
}
