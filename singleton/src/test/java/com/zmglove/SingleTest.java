package com.zmglove;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * TODO
 *
 * @author CZH
 * @version 1.0
 * @date 2019/4/24 18:26
 **/
@Slf4j
public class SingleTest {

    @Test
    public void test(){
        DbConnection connection = DbConnection.getInstance();
        log.info(connection.toString());
        //System.out.println(connection.toString());
        log.info(">>>> {}",connection.getStr());
    }
}
