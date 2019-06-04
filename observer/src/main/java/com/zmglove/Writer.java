package com.zmglove;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;

/**
 * 作者类(被观察的类)
 *
 * @author CZH
 * @version 1.0
 * @date 2019/6/4 15:45
 **/
@Slf4j
public class Writer extends Observable {
    /**
     * 作者的名称
     */
    private String name;

    /**
     * 最新版的小说
     */
    private String lastNovel;

    public Writer(String name){
        super();
        this.name =  name;
        WriterManager.getInstance().addWriter(this);
    }

    public String getName() {
        return name;
    }

    public String getLastNovel() {
        return lastNovel;
    }


    /**
     * 作者发表小说
     * @param novelName
     */
    public void addNovel(String novelName){
        log.info(">>>>作家[{}]发表了最新小说:{}",name,novelName);
        lastNovel = novelName;
        setChanged();
        notifyObservers();
    }
}
