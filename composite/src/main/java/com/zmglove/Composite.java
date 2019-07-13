package com.zmglove;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构建
 */
public class Composite extends Component {
    // 构建容器
    private List<Component> componentList = new ArrayList<>();

    /**
     * 增加一个叶子构件
     *
     * @param component
     */
    public void add(Component component) {
        componentList.add(component);
    }

    /**
     * 删除一个叶子构建
     *
     * @param component
     */
    public void remove(Component component) {
        componentList.remove(component);
    }

    /**
     * 获得分支下所有的构件
     *
     * @return
     */
    public List<Component> getChildren() {
        return this.componentList;
    }


}
