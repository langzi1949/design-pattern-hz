package com.zmglove;

/**
 * 测试组命令
 */
public class TestCommand implements Command {

    private TestGroup testGroup = new TestGroup();

    @Override
    public void execute() {
        testGroup.find();
        testGroup.doSomething();
    }
}
