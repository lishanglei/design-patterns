package com.design.factory;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/15
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/15              lishanglei      v1.0.0           Created
 */
public class CarFactory {

    public Moveable createCar() {

        System.out.println("car created");
        return new Car();
    }
}
