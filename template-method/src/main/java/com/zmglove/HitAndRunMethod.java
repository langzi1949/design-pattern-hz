package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 一个小偷的实现类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/24 19:23
 **/
@Slf4j
public class HitAndRunMethod extends StealingMethod{
    @Override
    protected String pickTarget() {
        return "一个洗剪吹的小伙子";
    }

    @Override
    protected void confuseTarget(String target) {
      log.info(">>>>从背后进行出其不意的袭击:{}",target);
    }

    @Override
    protected void stealTheItem(String target) {
        log.info(">>>>最终偷走了一个口香糖，并快速撤离现场！！！");
    }
}
