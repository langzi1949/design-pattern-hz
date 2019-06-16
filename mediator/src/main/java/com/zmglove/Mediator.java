package com.zmglove;

/**
 * 具体的中介者
 */
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

    private void buyComputer(int number){
        int saleStatus = super.sale
    }
}
