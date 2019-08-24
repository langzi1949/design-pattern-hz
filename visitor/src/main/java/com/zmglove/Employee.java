package com.zmglove;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 抽象员工类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Employee {
    /**
     * 姓名
     */
    private String name;
    /**
     * 薪水
     */
    private Integer salary;

    /**
     * 允许一个访问者进行访问
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);


}
