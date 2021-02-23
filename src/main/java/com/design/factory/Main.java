package com.design.factory;

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
        Moveable moveable =new Car();
        moveable.go();
        Moveable moveable1 =new Plane();
        moveable1.go();

        Moveable m =new CarFactory().createCar();
    }
}
