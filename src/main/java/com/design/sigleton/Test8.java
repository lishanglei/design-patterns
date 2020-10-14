package com.design.sigleton;

/**
 * 不仅可以解决线程同步,还可以防止反序列化
 *
 * 之前几种方式可以根据class文件通过反射,newInstance根据构造方法得到一个实例,而枚举没有构造方法,所以无法反序列化
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/14
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/14              lishanglei      v1.0.0           Created
 */
public enum Test8 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Test8.INSTANCE.hashCode());
            }).start();
        }
    }
}
