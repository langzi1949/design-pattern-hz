package com.zmglove;

/**
 * 枚举 单例
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/17 13:59
 **/
public enum EnumSingleton {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName()+"@"+hashCode();
    }
}
