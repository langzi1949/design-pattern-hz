package com.zmglove;


/**
 * 其实就是相当于发布命令的/和客户端进行交互的
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void action() {
        command.execute();
    }
}
