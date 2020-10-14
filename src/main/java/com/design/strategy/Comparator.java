package com.design.strategy;

/**
 * 比较器
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/14
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/14              lishanglei      v1.0.0           Created
 */
public interface Comparator<T> {

    int compare(T o1,T o2);
}
