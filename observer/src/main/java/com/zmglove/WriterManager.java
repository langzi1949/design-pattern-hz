package com.zmglove;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 管理器，用于管理一份独有
 *
 * @author CZH
 * @version 1.0
 * @date 2019/6/4 15:36
 **/
public class WriterManager {

    private Map<String, Writer> writeMap = Maps.newHashMap();

    /**
     * 添加作者
     *
     * @param writer
     */
    public void addWriter(Writer writer) {
        writeMap.put(writer.getName(), writer);
    }

    /**
     * 根据姓名查询作者信息
     *
     * @param name
     * @return
     */
    public Writer getWriter(String name) {
        return writeMap.get(name);
    }

    /**
     * 单例
     */
    private WriterManager() {
    }

    public static WriterManager getInstance() {
        return WriterManagerInstance.instance;
    }

    private static class WriterManagerInstance {
        private static WriterManager instance = new WriterManager();
    }
}
