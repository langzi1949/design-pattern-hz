package com.zmglove.builder;

/**
 * 指挥类/导演类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/30 18:53
 **/
public class Director {

    /**
     * 创建一个最好的足球
     * @param builder
     * @param name
     * @return
     */
    public Football createBestBall(Builder builder,String name){
        builder.setFootballName(name);
        builder.buildColor();
        builder.buildDiameter();
        builder.buildOriginPlace();
        return builder.getFootball();
    }
}
