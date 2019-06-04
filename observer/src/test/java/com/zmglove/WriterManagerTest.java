package com.zmglove;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 作者-读者(观察者模式) 测试类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/6/4 16:08
 **/
@Slf4j
public class WriterManagerTest {

    @Test
    public void testObserver(){
        log.info("-----创建4个读者-------");
        Reader reader1 = new Reader("陈钊");
        Reader reader2 = new Reader("罗梅罗");
        Reader reader3 = new Reader("朱辰杰");
        Reader reader4 = new Reader("曹赟定");

        log.info("-----创建2个作者-------");
        Writer writer1 = new Writer("保利尼奥");
        Writer writer2 = new Writer("奥古斯托");

        reader1.subscribe(writer1.getName());
        reader2.subscribe(writer1.getName());
        reader3.subscribe(writer1.getName());
        reader4.subscribe(writer1.getName());

        reader1.subscribe(writer2.getName());
        reader2.subscribe(writer2.getName());

        // 发布书
        writer1.addNovel("广州恒大的大腿");
        writer2.addNovel("国安永远争第一");

        log.info("---------读者[{}]取消订阅【{}】",reader1.getName(),writer1.getName());

        reader1.unSubscribe(writer1.getName());

        // 保利尼奥再次发布书籍
        writer1.addNovel("天下足球");
    }
}
