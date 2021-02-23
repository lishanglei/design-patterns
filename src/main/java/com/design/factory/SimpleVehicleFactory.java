package com.design.factory;

/**
 * 简单工厂的可扩展性不好
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/15
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/15              lishanglei      v1.0.0           Created
 */
public class SimpleVehicleFactory {

    public Car createCar() {  return new Car(); }

    public Plane createPlane(){return new Plane();}
}
