package com.zmglove;

import org.junit.Test;

/**
 * 测试类
 */
public class StateTest {

    @Test
    public void test(){
        Context context = new Context();
        context.setTradeState(new PayState());
        context.pay();
        context.ship();
        context.cancel();
    }
}
