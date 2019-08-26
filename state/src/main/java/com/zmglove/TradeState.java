package com.zmglove;

/**
 * 抽象交易状态
 */
public  abstract  class TradeState {
    // 定义一个环境角色，也就是封装状态的变化引起的功能变化
    protected Context context;

    public void setContext(Context context){
        this.context = context;
    }

    /**
     * 付款
     */
    public abstract void pay();

    /**
     * 发货
     */
    public abstract void ship();

    /**
     * 取消交易(退货)
     */
    public abstract void  cancel();
}
