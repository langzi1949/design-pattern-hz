package com.zmglove.other;


/**
 * 英雄类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/30 11:39
 **/
public final class Hero {
    /**
     * 职位
     */
    private final Profession profession;
    /**
     * 名称
     */
    private final String name;

    /**
     * 头发颜色
     */
    private final HairColor hairColor;

    /**
     * 头发类型
     */
    private final HairType hairType;

    /**
     * 盔甲
     */
    private final Armor armor;

    /**
     * 武器
     */
    private final Weapon weapon;


    /**
     * 构造器
     *
     * @param builder
     */
    private Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.armor = builder.armor;
        this.weapon = builder.weapon;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public HairType getHairType() {
        return hairType;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("This is a ").append(profession)
                .append(" named ")
                .append(name);
        if (hairColor != null || hairType != null) {
            sb.append(" with ");
            if (hairColor != null) {
                sb.append(hairColor).append("  ");
            }
            if (hairType != null) {
                sb.append(hairType).append("  ");
            }
            sb.append(hairType != HairType.BALD ? "hair" : "head");
        }
        if (armor != null) {
            sb.append(" wearing ").append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a ").append(weapon);
        }
        sb.append(".");

        return sb.toString();
    }

    public static class Builder {
        private final Profession profession;

        private final String name;

        private HairType hairType;

        private HairColor hairColor;

        private Armor armor;

        private Weapon weapon;

        public Builder(Profession profession, String name) {
            if (profession == null || name == null || "".equals(name)) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.profession = profession;
            this.name = name;
        }

        public Builder hairType(HairType hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder hairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder armor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder weapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }

    }


}
