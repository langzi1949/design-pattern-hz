package com.zmglove.staticproxy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 球类代理测试类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/31 14:17
 **/
@Slf4j
public class BallProxyTest {

    @Test
    public void unuseProxy() {
        Football ball = new Football();
        ball.setColor("black");

        assertEquals("black", ball.getColor());

        ball.play();
    }

    @Test
    public void useProxy() {
        Football football = new Football();
        BallProxy proxy = new BallProxy(football);
        proxy.setColor("red");
        assertEquals("red", football.getColor());
        football.play();
        proxy.play();
    }
}
