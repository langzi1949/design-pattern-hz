package com.zmglove.builder;

/**
 * 足球生成器
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/30 18:46
 **/
public class FootballBuilder implements Builder{

    private Football football;
    @Override
    public void setFootballName(String name) {
        football.setName(name);
    }

    @Override
    public void buildColor() {
        football.setColor("black");
    }

    @Override
    public void buildDiameter() {
        football.setDiameter(10);
    }

    @Override
    public void buildOriginPlace() {
        football.setOriginPlace("Shanghai");
    }

    public Football getFootball(){
        return this.football;
    }
}
