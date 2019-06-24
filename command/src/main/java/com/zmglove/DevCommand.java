package com.zmglove;

/**
 * 开发组命令
 */
public class DevCommand implements Command {
    private DevGroup devGroup = new DevGroup();

    @Override
    public void execute() {
        devGroup.find();
        devGroup.doSomething();
    }
}
