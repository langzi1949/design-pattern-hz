package com.zmglove;

/**
 * 工厂类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/17 17:05
 **/
public class Factory {


    /**
     * 这个一定要是静态方法，这样才会简单工厂类，要不然说不去丢人
     * @param type
     * @return
     */
    public static Ball createBall(BallType type) {
        switch (type) {
            case BASKETBALL:
                return new Basketball();
            case FOOTBALL:
                return new Football();
            default:
                break;
        }

        return null;

    }
}
