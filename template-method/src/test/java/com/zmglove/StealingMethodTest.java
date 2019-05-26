package com.zmglove;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 测试类
 */
public abstract class StealingMethodTest<M extends StealingMethod> {
    private InMemoryAppender appender;

    public StealingMethodTest(M method, String expectedTarget, String expectedTargetResult, String expectedConfuseMethod, String expectedStealMethod) {
        this.method = method;
        this.expectedTarget = expectedTarget;
        this.expectedTargetResult = expectedTargetResult;
        this.expectedConfuseMethod = expectedConfuseMethod;
        this.expectedStealMethod = expectedStealMethod;
    }


    @BeforeEach
    public void setUp() {
        appender = new InMemoryAppender();
    }

    @AfterEach
    public void tearDown() {
        appender.stop();
    }

    private final M method;

    private final String expectedTarget;

    private final String expectedTargetResult;

    private final String expectedConfuseMethod;

    private final String expectedStealMethod;


    @Test
    public void testPickTarget(){
        assertEquals(expectedTarget,this.method.pickTarget());
    }

    @Test
    public void testConfuseTarget(){
        assertEquals(0,appender.getLogSize());

        this.method.stealTheItem(this.expectedTarget);
        assertEquals(this.expectedConfuseMethod,appender.getLastMessage());
        assertEquals(1,appender.getLogSize());
    }

    @Test
    public void testStealItem(){
        assertEquals(0,appender.getLogSize());

        this.method.stealTheItem(this.expectedTarget);
        assertEquals(this.expectedStealMethod,appender.getLastMessage());
        assertEquals(1,appender.getLogSize());
    }

    @Test
    public void testSteal(){
        this.method.steal();

        assertTrue(appender.logContains(this.expectedTargetResult));
        assertTrue(appender.logContains(this.expectedConfuseMethod));
        assertTrue(appender.logContains(this.expectedStealMethod));
        assertEquals(3,appender.getLogSize());
    }

    private class InMemoryAppender extends AppenderBase<ILoggingEvent> {
        private List<ILoggingEvent> loggingEvents = new LinkedList<>();

        public InMemoryAppender() {
            ((Logger)LoggerFactory.getLogger("root")).addAppender(this);
            start();
        }

        @Override
        protected void append(ILoggingEvent iLoggingEvent) {
            loggingEvents.add(iLoggingEvent);
        }

        public int getLogSize() {
            return loggingEvents.size();
        }

        public String getLastMessage() {
            return loggingEvents.get(loggingEvents.size() - 1).getFormattedMessage();
        }

        public boolean logContains(String message) {
            return loggingEvents.stream().anyMatch(event -> event.getFormattedMessage().equals(message));
        }

    }
}
