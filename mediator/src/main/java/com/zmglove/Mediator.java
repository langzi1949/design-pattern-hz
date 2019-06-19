package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体的中介者
 */
@Slf4j
public class Mediator extends AbstractMediator{

    /**
     * 中介者最重要的方法叫做事件方法，处理多个对象之间的关系
     *
     * @param str
     * @param objects
     */
    @Override
    public void execute(String str, Object... objects) {
        if("purchase.buy".equals(str)){

        }else if("sale.sell".equals(str)){

        }else if("sale.offsell".equals(str)){

        }else if("stock.clear".equals(str)){

        }
    }

    /**
     * 采购电脑
     * @param number
     */
    private void buyComputer(int number){
        int saleStatus = super.sale.getSaleStatus();

        if(saleStatus > 80){
            log.info(">>>>采购IBM电脑:{}台",number);
            super.stock.increase(number);
        }else{
            // 折半采购
            int buyNumber = number/2;
            log.info(">>>>采购IBM电脑:{}台",buyNumber);
        }
    }

    /**
     * 销售电脑
     * @param number
     */
    private void sellComputer(int number){
        // 库存不够了
        if(super.stock.getStock() < number){
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }

    /**
     * 折价销售电脑
     */
    private void offsell(){
        log.info("折价销售电脑{}台",stock.getStock());
    }

    /**
     * 清仓处理
     */
    private void clearStock(){
        // 要求清仓
        super.sale.offSale();
        // 要求采购人员不要采购
        super.purchase.refuseByIBM();
    }
}
