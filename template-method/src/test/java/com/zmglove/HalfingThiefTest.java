package com.zmglove;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * 测试类
 */
@Slf4j
public class HalfingThiefTest {

    @Test
    public void testSteal() {
        final StealingMethod stealingMethod = mock(StealingMethod.class);
        final HalfingThief thief = new HalfingThief(stealingMethod);

        thief.steal();
        verify(stealingMethod).steal();

        verifyNoMoreInteractions(stealingMethod);

    }

    @Test
    public void testChangeMethod() {
        final StealingMethod method = mock(StealingMethod.class);
        final HalfingThief thief = new HalfingThief(method);

        thief.steal();
        verify(method).steal();

        final StealingMethod newMethod = mock(StealingMethod.class);
        thief.changeMethod(newMethod);

        thief.steal();
        verify(newMethod).steal();

        verifyNoMoreInteractions(method,newMethod);
    }
}
