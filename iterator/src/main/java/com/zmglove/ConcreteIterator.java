package com.zmglove;

import java.util.Vector;

/**
 * 具体的迭代器的实现方式
 */
public class ConcreteIterator implements Iterator {
    // 容器
    private Vector vector = new Vector();
    // 定义当前的游标
    public int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    /**
     * 遍历下一个元素
     *
     * @return
     */
    @Override
    public Object next() {
        Object object = null;
        if (this.hasNext()) {
            // 取完值以后，需要将游标往下移动一位
            object = this.vector.get(this.cursor++);
        } else {
            object = null;
        }
        return object;
    }

    /**
     * 是否遍历到尾部（判断是否有下一个值）
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        return this.vector.size() != this.cursor;
    }

    /**
     * 删除当前指向的元素
     *
     * @return
     */
    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
