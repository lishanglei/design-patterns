package com.design.sigleton;

/**
 * 完美方式:
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类,这样可以实现懒加载
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/14
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/14              lishanglei      v1.0.0           Created
 */
public class Test7 {

    //私有的构造方法,拒绝外界通过new的方式实例化Test1
    private Test7() {
    }

    //静态内部类,外部无法访问
    private static class Test7Holder{

        private static Test7 INSTANCE =new Test7();
    }
    public static Test7 getInstance() {
        return Test7Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Test7.getInstance().hashCode());
            }).start();
        }
    }
}
