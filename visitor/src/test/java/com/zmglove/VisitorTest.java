package com.zmglove;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.List;
import java.util.Random;

/**
 * 访问者测试类
 */
@Slf4j
public class VisitorTest {

    @Test
    public  void visitorTest(){
        List<Employee> employees = buildEmployees();
        for(Employee employee :employees){
            //log.info("e:{}",employee.getName());
            employee.accept(new Visitor());
        }
    }


    private List<Employee> buildEmployees(){
        List<Employee> employees = Lists.newArrayList();
        //随机产生10个员工信息
        Random random = new Random();

        for(int i = 0;i<10;i++){
            if(random.nextInt(4) %2 == 0){
                CommonEmployee commonEmloyee = new CommonEmployee("普通员工-"+i,random.nextInt(2000));
                commonEmloyee.setJob("苦逼的程序员，经常加班");
                employees.add(commonEmloyee);
            } else{
                Manager manager = new Manager("经理-"+i,random.nextInt(300000));
                manager.setPerformance("基本上就是扯皮。。。。。");
                employees.add(manager);
            }
        }
        return employees;
    }

}
