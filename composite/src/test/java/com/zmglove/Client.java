package com.zmglove;

import org.junit.Test;

/**
 * 测试类
 */
public class Client {

    @Test
    public void test() {
        // 创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        // 创建一个树枝构件
        Composite branch = new Composite();
        root.add(branch);
        // 构建一个叶子
        Leaf leaf = new Leaf();
        branch.add(leaf);

        display(root);
    }


    private void display(Composite root){
        for(Component c :root.getChildren()){
            if(c instanceof Leaf){
                c.doSomething();
            }else{
                display((Composite)c);
            }
        }
    }
}
