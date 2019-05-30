package com.zmglove.other;

/**
 * 发型的类型
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/30 11:31
 **/
public enum HairType {
    /**
     *
     */
    BALD("bald"), SHORT("short"), CURLY("curly"), LONG_STRAIGHT("long straight"), LONG_CURLY("long curly");

    private String title;

    HairType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
