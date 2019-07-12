package com.zmglove;

/**
 * 这个接口就认为是一个容器
 */
public interface IProject {
    /**
     * 添加元素
     * @param object
     */
    void add(Object object);

    /**
     * 删除元素
     * @param object
     */
    void delete(Object object);

    /**
     * 获得迭代器
     * @return
     */
    Iterator iterator();
}
