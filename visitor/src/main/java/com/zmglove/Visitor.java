package com.zmglove;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Visitor implements IVisitor {
    /**
     * 访问普通员工
     *
     * @param commonEmployee
     */
    @Override
    public void visit(CommonEmployee commonEmployee) {
        log.info(this.getCommonEmployee(commonEmployee));
    }

    /**
     * 访问管理者
     *
     * @param manager
     */
    @Override
    public void visit(Manager manager) {
        log.info(this.getManagerInfo(manager));
    }

    /**
     * 获取员工的基本信息
     *
     * @param employee
     * @return
     */
    private String getBasicInfo(Employee employee) {
        return "姓名:" + employee.getName() + "\t" + "，工资:" + employee.getSalary();
    }

    /**
     * 获取管理者信息
     * @param manager
     * @return
     */
    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        return basicInfo.concat("\t 业绩:").concat(manager.getPerformance());
    }

    private String getCommonEmployee(CommonEmployee commonEmployee){
        String basicInfo = this.getBasicInfo(commonEmployee);
        return basicInfo.concat("\t 工作内容:").concat(commonEmployee.getJob());
    }


}
