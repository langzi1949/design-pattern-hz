package com.zmg;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HighScoreDecorator extends Decorator{

    public HighScoreDecorator(Report report) {
        super(report);
    }

    private void reportHighScore(){
        log.info(">>>>这次考试最高分89");
    }

    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }
}
