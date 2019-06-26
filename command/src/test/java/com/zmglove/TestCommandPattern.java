package com.zmglove;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TestCommandPattern {

    @Test
    public void devTest(){
        //dev
        Command dev = new DevCommand();
        // 创建接头人
        Invoker kobe = new Invoker(dev);

        // 执行命令
        kobe.action();

        Command test = new TestCommand();
        kobe = new Invoker(test);

        kobe.action();

    }
}
