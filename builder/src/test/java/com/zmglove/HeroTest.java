package com.zmglove;

import com.zmglove.other.Hero;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * 测试类
 */
public class HeroTest {

    @Test
    public void testMissingProfession() {
        assertThrows(IllegalArgumentException.class, () -> new Hero.Builder(null, "Sir without a job"));
    }
}
