package com.zmglove;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * 读者类（作为观察者角色）
 *
 * @author CZH
 * @version 1.0
 * @date 2019/6/4 14:37
 **/
@Slf4j
public class Reader implements Observer {
    /**
     * 名称
     */
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 读者关注作者
     *
     * @param writerName
     */
    public void subscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).addObserver(this);
    }

    /**
     * 读者取消关注作者
     *
     * @param writerName
     */
    public void unSubscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).deleteObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Writer) {
            Writer writer = (Writer) o;
            log.info(">>>>读者:[{}]知道了作家[{}]发表了新书:{},打算近期跟进阅读", name, writer.getName(), writer.getLastNovel());
        }
    }
}
