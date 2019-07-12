package com.zmglove;

/**
 * 自定义的迭代器
 * 一般情况来说，迭代器中有三个方法：
 * 1. 遍历下一个元素
 * 2. 是否遍历到尾部
 * 3. 删除当前指向的元素
 */
public interface Iterator {
    /**
     * 遍历下一个元素
     *
     * @return
     */
    Object next();

    /**
     * 是否遍历到尾部（判断是否有下一个值）
     *
     * @return
     */
    boolean hasNext();

    /**
     * 删除当前指向的元素
     *
     * @return
     */
    boolean remove();
}
