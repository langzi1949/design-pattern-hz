package com.zmglove;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Random;

/**
 * 责任链测试类
 */
public class ChainTest {

    @Test
    public void test() {
        // 随机挑选女性
        Random rand = new Random();
        List<IWomen> womenList = Lists.newArrayList();

        for (int i = 0; i < 5; i++) {
            womenList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }

        // 定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        // 设置请示顺序
        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : womenList) {
            father.HandlerMessage(women);
        }

    }
}
