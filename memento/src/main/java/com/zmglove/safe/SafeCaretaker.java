package com.zmglove.safe;

/**
 * 安全的备忘录实现方式-备忘录管家
 */
public class SafeCaretaker {
    private SafeIMemento iMemento;

    public SafeIMemento getiMemento() {
        return iMemento;
    }

    public void setiMemento(SafeIMemento iMemento) {
        this.iMemento = iMemento;
    }
}
