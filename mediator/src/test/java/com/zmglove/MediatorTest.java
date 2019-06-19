package com.zmglove;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * 中介者测试类
 */
@Slf4j
public class MediatorTest {

    @Test
    public void test(){
        AbstractMediator mediator = new Mediator();

        // 采购

        log.info("-----------采购电脑--------------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);

        // 销售电脑
        log.info("##########销售电脑#################");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);

        // 管理库存
        log.info("-----------库存管理人员清库处理-----------------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
