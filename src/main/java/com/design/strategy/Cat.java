package com.design.strategy;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/14
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/14              lishanglei      v1.0.0           Created
 */
public class Cat{
    int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
