package com.design.sigleton;

/**
 * lazy loading  懒汉式
 * 虽然达到了按需初始化的目的,但是却带来了线程不安全的问题
 * 可以通过synchronized加锁,但是会带来性能的下降
 *
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/14
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/14              lishanglei      v1.0.0           Created
 */
public class Test6 {

    //静态变量,在初始化时只实例化一次
    private static Test6 INSTANCE;

    //私有的构造方法,拒绝外界通过new的方式实例化Test1
    private Test6() {
    }

    public static Test6 getInstance() {
        if (INSTANCE == null) {
            //妄图通过减小同步代码块来提高性能,但依然不可行
            synchronized (Test6.class) {
                //双重判断
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Test6();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Test6.getInstance().hashCode());
            }).start();
        }
    }
}
