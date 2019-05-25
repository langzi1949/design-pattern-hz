package com.zmglove;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * 测试类
 */
public class HitAndRunMethodTest {

    @Test
    public void testSteal(){
        final StealingMethod stealingMethod = mock(StealingMethod.class);
        final HalfingThief thief =  new HalfingThief(stealingMethod);

        thief.steal();
        verify(stealingMethod).steal();

        verifyNoMoreInteractions(stealingMethod);

    }
}
