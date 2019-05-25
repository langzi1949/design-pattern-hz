package com.zmglove;

/**
 *
 */
public class HalfingThief {

    private StealingMethod method;

    public HalfingThief(StealingMethod method) {
        this.method = method;
    }

    public void steal() {
        method.steal();
    }

    public void changeMethod(StealingMethod method) {
        this.method = method;
    }
}
