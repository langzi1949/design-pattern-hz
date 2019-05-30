package com.zmglove.other;

/**
 * 职位枚举
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/30 11:35
 **/
public enum Profession {
    /**
     *
     */
    WARRIOR,THIEF,MAGE,PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
