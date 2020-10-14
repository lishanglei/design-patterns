package com.design.strategy;

import java.util.Arrays;

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

        Cat[] cats =new Cat[]{new Cat(10,20),new Cat(5,15),new Cat(15, 3)};

        Sorter sorter =new Sorter();
        sorter.sort(cats,new CatWeightComparator());
        System.out.println("冒泡排序结果: " + Arrays.toString(cats));
        sorter.sort(cats,new CatHeightComparator());
        System.out.println("冒泡排序结果: " + Arrays.toString(cats));

    }
}
