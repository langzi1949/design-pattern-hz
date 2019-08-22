package com.zmg;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SortDecorator extends Decorator{
    public SortDecorator(Report report) {
        super(report);
    }

    private void reportSort(){
      log.info(">>>>>排名30");
    }

    @Override
    public void report(){
        super.report();
        this.reportSort();
    }
}
