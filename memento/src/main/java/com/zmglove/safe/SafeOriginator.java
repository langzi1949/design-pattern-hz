package com.zmglove.safe;

/**
 * 安全的备忘录实现方式-发起人角色
 */
public class SafeOriginator {
    // 内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建一个备忘录
     * @return
     */
    public SafeIMemento createMemento(){
        return new Memento(this.state);
    }

    /**
     * 恢复一个备忘录
     * @param iMemento
     */
    public void restoreMemento(SafeIMemento iMemento){
        this.setState(((Memento)iMemento).getState());
    }


    private class Memento implements SafeIMemento{
        // 发起人的内部状态
        private String state;

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
}
