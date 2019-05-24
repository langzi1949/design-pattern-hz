package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 抽象类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/24 19:14
 **/
@Slf4j
public abstract class StealingMethod {
    /**
     * 挑选目标
     * @return
     */
    protected  abstract  String pickTarget();

    /**
     * 迷惑目标
     * @param target
     */
    protected abstract void confuseTarget(String target);

    /**
     * 偷东西
     * @param target
     */
    protected abstract void stealTheItem(String target);

    /**
     * 以下方法就是模板方法
     */
    public void steal(){
        String target = pickTarget();
        log.info(">>>>目标被选择:{}",target);

        confuseTarget(target);
        stealTheItem(target);
    }
}
