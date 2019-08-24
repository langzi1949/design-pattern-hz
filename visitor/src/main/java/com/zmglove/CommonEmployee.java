package com.zmglove;

import lombok.*;

/**
 * 普通员工类
 */
@Data
public class CommonEmployee extends Employee {
    /**
     * 工作内容
     */
    @Setter @Getter
    private String job;

    public CommonEmployee(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
