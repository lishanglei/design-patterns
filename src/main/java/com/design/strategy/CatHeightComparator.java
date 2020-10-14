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
public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {

        if (o1.height > o2.height) {
            return 1;
        } else if (o1.height < o2.height) {
            return -1;
        } else {
            return 0;
        }
    }
}
