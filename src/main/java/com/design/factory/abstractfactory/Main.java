package com.design.factory.abstractfactory;

import com.design.factory.Car;
import com.design.factory.CarFactory;
import com.design.factory.Moveable;
import com.design.factory.Plane;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/14
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/14              lishanglei      v1.0.0           Created
 */
public class Main {

    public static void main(String[] args) {

        Car car =new Car();
        car.go();
        AK47 ak47 =new AK47();
        ak47.shoot();
        Bread bread =new Bread();
        bread.printName();
    }
}
