package com.zmglove;

import lombok.Getter;
import lombok.Setter;

/**
 * 管理者类
 */
public class Manager extends Employee{

    public Manager(String name, Integer salary) {
        super(name, salary);
    }

    /**
     * 业绩
     */
    @Setter @Getter
    private String performance;


    /**
     *
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
