package com.zmglove.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 */
@Slf4j
public class Client {

    public static void main(String[] args){
        Director director = new Director();
        Football football = director.createBestBall(new FootballBuilder(),"Kobe");

        log.info(">>>>>{}",football.getColor());
    }
}
