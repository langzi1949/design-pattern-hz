package com.zmglove;

import com.zmglove.other.*;
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

    @Test
    public void testMissingName(){
        assertThrows(IllegalArgumentException.class,() -> new Hero.Builder(Profession.THIEF,null));
    }

    @Test
    public void testBuildHero(){
        final String heroName = "Wade Anthoney";

        final Hero hero = new Hero.Builder(Profession.PRIEST,heroName)
                .armor(Armor.PLATE_MAIL)
                .hairColor(HairColor.BLOND)
                .hairType(HairType.CURLY)
                .weapon(Weapon.DAGGER)
                .build();

        assertNotNull(hero);
        assertNotNull(hero.toString());
        assertEquals(Profession.PRIEST,hero.getProfession());
        assertEquals(Weapon.DAGGER,hero.getWeapon());
    }
}
