package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 树叶构件  没有下级
 * 所以只是继承了Component
 */
@Slf4j
public class Leaf extends  Component{

    @Override
    public void doSomething(){
        log.info(">>>>我大叶子干活啦....");
    }
}
