package com.zmglove;

/**
 * 女性类
 */
public class Women implements IWomen {
    /**
     * 类型
     * 1 --- 未出嫁
     * 2 --- 出嫁
     * 3 --- 夫死
     */
    private int type = 0;

    /**
     * 请示内容
     */
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是:" + request;
                break;
            case 2:
                this.request = "妻子的请求是:" + request;
                break;
            case 3:
                this.request = "母亲的请求是:" + request;
                break;
            default:
                break;
        }
    }


    /**
     * 获取类型
     *
     * @return
     */
    @Override
    public int getType() {
        return this.type;
    }

    /**
     * 获得个人请示
     *
     * @return
     */
    @Override
    public String getRequest() {
        return this.request;
    }
}
