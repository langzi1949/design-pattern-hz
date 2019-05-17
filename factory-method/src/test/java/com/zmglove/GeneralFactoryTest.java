package com.zmglove;

import com.zmglove.general.CarFactory;
import com.zmglove.general.Conveyance;
import com.zmglove.general.Factory;
import com.zmglove.general.TruckFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class GeneralFactoryTest {

    @Test
    public void test(){
        // 制造一辆汽车
        Factory factory = new CarFactory();
        Conveyance car = factory.create();
        car.move();

        // 制造一辆卡车
        Factory factory1 = new TruckFactory();
        Conveyance truck = factory1.create();
        truck.move();

    }
}
