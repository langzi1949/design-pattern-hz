package com.zmglove.builder;

import lombok.*;

/**
 * 具体的产品类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/30 17:33
 **/
@Setter
@Getter
public class Football {
    /**
     * 足球的名称
     */
    private String name;
    /**
     * 颜色
     */
    private String color;

    /**
     * 直径
     */
    private int diameter;

    /**
     * 生产地
     */
    private String originPlace;

    public Football(){}

    public Football(String name) {
        this.name = name;
    }


}
