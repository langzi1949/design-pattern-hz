package com.zmglove;

/**
 * 专门处理BA的命令
 */
public class BaCommand implements Command {
    private BaGroup baGroup = new BaGroup();


    @Override
    public void execute() {
        baGroup.find();
        baGroup.doSomething();
    }
}
