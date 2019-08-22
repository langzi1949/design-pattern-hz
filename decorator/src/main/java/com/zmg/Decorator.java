package com.zmg;


public abstract class Decorator extends Report{

    private Report report ;

    public Decorator(Report report){
        this.report = report;
    }

    @Override
    public void report(){
        this.report.report();
    }

    @Override
    public void sign(){
        this.report.sign();
    }
}
