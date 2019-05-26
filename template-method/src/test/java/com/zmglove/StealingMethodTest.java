package com.zmglove;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

/**
 * 测试类
 */
public class StealingMethodTest<M extends StealingMethod> {
    private InMe


    private class InMemoryAppender extends AppenderBase<ILoggingEvent> {
        private List<ILoggingEvent> loggingEvents = new LinkedList<>();

        public InMemoryAppender() {
            ((Logger) LoggerFactory.getLogger("root")).addAppender(this);
        }

        @Override
        protected void append(ILoggingEvent iLoggingEvent) {
            loggingEvents.add(iLoggingEvent)
        }

    }
}
