package com.zmglove;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

/**
 * TODO
 *
 * @author CZH
 * @version 1.0
 * @date 2019/4/24 18:25
 **/
public class DbConnection {
    private static DbConnection instance = new DbConnection();
    private DbConnection(){

    }

    public static DbConnection getInstance(){
        return instance;
    }

    public String getStr(){
        String template = "{} - {}";
        return StrUtil.format(template,"I","YOU");
    }
}
