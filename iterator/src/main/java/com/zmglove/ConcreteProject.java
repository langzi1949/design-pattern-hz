package com.zmglove;

import java.util.Vector;

/**
 * 其实就是具体的容器类
 */
public class ConcreteProject implements IProject{
    // 容器对象
    private Vector vector = new Vector();


    /**
     * 添加元素
     *
     * @param object
     */
    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    /**
     * 删除元素
     *
     * @param object
     */
    @Override
    public void delete(Object object) {
        this.vector.remove(object);
    }

    /**
     * 获得迭代器
     *
     * @return
     */
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
