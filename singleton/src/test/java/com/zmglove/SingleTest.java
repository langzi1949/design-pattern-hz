package com.zmglove;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * langzi
 *
 * @author CZH
 * @version 1.0
 * @date 2019/4/24 18:26
 **/
@Slf4j
public class SingleTest {

    @Test
    public void test(){
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        log.info(simpleSingleton.toString());
        //System.out.println(connection.toString());
    }
}
