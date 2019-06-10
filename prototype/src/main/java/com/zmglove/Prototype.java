package com.zmglove;

/**
 * 原型类
 */
public class Prototype implements Cloneable{
    private int x;
    private int y;

    public Prototype(){
        this.x = 2;
        this.y = 3;
    }

    public void change(){
        this.x = 9;
        this.y = 6;
    }

    @Override
    public Prototype clone(){
        Object object =  null;
        try{
            object = super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }

        return (Prototype)object;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
