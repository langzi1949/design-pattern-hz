package com.zmglove.other;

import lombok.extern.slf4j.Slf4j;

/**
 * 类似于client
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/30 15:10
 **/
@Slf4j
public class App {


    public static void main(String[] args) {
        Hero mage = new Hero.Builder(Profession.MAGE, "Riobard").hairColor(HairColor.BLACK)
                .weapon(Weapon.AXE).build();
        log.info(".....Mage : {}", mage.toString());

        Hero warrior = new Hero.Builder(Profession.WARRIOR, "kobe").hairColor(HairColor.BROWN)
                .hairType(HairType.LONG_STRAIGHT).armor(Armor.CLOTHES).weapon(Weapon.SWORD).build();
        log.info(".....Warrior : {}", warrior.toString());

        Hero thief = new Hero.Builder(Profession.THIEF, "James").hairType(HairType.CURLY)
                .weapon(Weapon.WARHAMMER).build();
        log.info(".....Thief : {}", thief.toString());

    }
}
