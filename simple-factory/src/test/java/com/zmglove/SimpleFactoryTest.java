package com.zmglove;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * TODO
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/17 17:13
 **/
@Slf4j
public class SimpleFactoryTest {

    @Test
    public void testCreateBall(){
      Ball basketball = Factory.createBall(BallType.BASKETBALL);

      log.info("实例 = {}",basketball);
    }
}
