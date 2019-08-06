package com.zmglove;

/**
 * 备忘录角色
 */
public class Memento {
    // 发起人的内部状态
    private String state = "";

    // 构造函数参数参数
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
