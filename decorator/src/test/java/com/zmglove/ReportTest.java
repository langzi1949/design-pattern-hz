package com.zmglove;

import com.zmg.FourGradeReport;
import com.zmg.HighScoreDecorator;
import com.zmg.Report;
import com.zmg.SortDecorator;
import org.junit.Test;

/**
 *
 */
public class ReportTest {


    @Test
    public void test(){
        Report sReport ;

        sReport = new FourGradeReport();

        sReport = new HighScoreDecorator(sReport);

        sReport = new SortDecorator(sReport);

        sReport.report();

        sReport.sign();

    }
}
