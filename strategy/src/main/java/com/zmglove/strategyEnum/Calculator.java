package com.zmglove.strategyEnum;

/**
 *
 */
public enum Calculator {
    /**
     * 加法
     */
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    /**
     * 减法
     */
    SUB("-"){
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    }
    ;

    String value;

    private Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public abstract int exec(int a, int b);
}
