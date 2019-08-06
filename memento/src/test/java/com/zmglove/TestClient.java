package com.zmglove;

import com.zmglove.safe.SafeCaretaker;
import com.zmglove.safe.SafeOriginator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 测试类
 */
@Slf4j
public class TestClient {

    @Test
    public void test(){
        // 定义一个发起人
        Originator originator = new Originator();
        // 定义备忘录管理员
        Caretaker caretaker = new Caretaker();
        // 创建备忘录
        caretaker.setMemento(originator.createMemento());

        //恢复备忘录
        originator.restoreMemento(caretaker.getMemento());
    }

    @Test
    public void safeTest(){
        // 定义发起人
        SafeOriginator originator = new SafeOriginator();
        // 备忘录管家
        SafeCaretaker caretaker = new SafeCaretaker();
        // 创建备忘录
        caretaker.setiMemento(originator.createMemento());
        // 恢复
        originator.restoreMemento(caretaker.getiMemento());
    }
}
