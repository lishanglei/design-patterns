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
public class Sorter<T> {

    public void sort(T[] arr,Comparator<T> comparator){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int x = 0; x < arr.length - 1 - i; x++) {
                //每次循环,取出最大的一个放到最后边
                if (comparator.compare(arr[x],arr[x+1])>= 0) {
                    T temp = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = temp;
                }
            }
        }

    }
}
