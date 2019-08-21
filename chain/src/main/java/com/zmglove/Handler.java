package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * Hadler类
 */
@Slf4j
public abstract  class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    /**
     * 能处理的级别
     */
    private int level = 0;

    /**
     * 责任传递，下一个责任人
     */
    private Handler nextHandler;

    /**
     * 每个类都要说明一下自己能处理哪些请求
     * @param level
     */
    public Handler(int level){
        this.level = level;
    }

    public final void HandlerMessage(IWomen women){
        if(women.getType() == this.level){
            this.response(women);
        }else{
            // 有后续环节，才把请求进行传递
            if (this.nextHandler != null) {
                // 用到了递归的方式
                this.nextHandler.HandlerMessage(women);
            } else{
                log.warn("-----没有下一个环节了，直接调出------");
            }
        }
    }

    /**
     * 设置下一个环节的处理人
     * @param handler
     */
    public void setNext(Handler handler){
        this.nextHandler = handler;
    }

    protected abstract void response(IWomen women);

}
