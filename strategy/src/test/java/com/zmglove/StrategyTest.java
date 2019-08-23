package com.zmglove;

import com.zmglove.strategyEnum.Calculator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class StrategyTest {

    @Test
    public void test(){
        // 声明一个策略
        Strategy strategy = new ConcreteStrategy1();
        // 声明上下文对象
        Context context = new Context(strategy);

        // 策略具体的方法
        context.doAnyThing();
    }

    @Test
    public void strategyEnumTest(){
        int a = 9;
        int b = 8;
        log.info(">>>>>{}", Calculator.ADD.exec(a,b));
    }
}
