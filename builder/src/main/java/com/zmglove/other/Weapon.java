package com.zmglove.other;

/**
 * 武器枚举
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/30 11:38
 **/
public enum Weapon {
    /**
     *
     */
    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
