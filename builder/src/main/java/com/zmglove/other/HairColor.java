package com.zmglove.other;

/**
 * 发型的颜色
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/30 11:30
 **/
public enum HairColor {

    /**
     *
     */
    WHITE,BLOND,RED,BROWN,BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
