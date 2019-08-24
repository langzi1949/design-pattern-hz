package com.zmglove;

/**
 * 访问者接口
 */
public  interface IVisitor {
    /**
     * 访问普通员工
     * @param commonEmployee
     */
    void visit(CommonEmployee commonEmployee);

    /**
     * 访问管理者
     * @param manager
     */
    void visit(Manager manager);
}
