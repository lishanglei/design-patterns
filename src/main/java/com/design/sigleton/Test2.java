package com.design.sigleton;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/14
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/14              lishanglei      v1.0.0           Created
 */
public class Test2 {

    //静态变量,在初始化时只实例化一次
    private static final Test2 INSTANCE ;
    static {
        INSTANCE=new Test2();
    }

    //私有的构造方法,拒绝外界通过new的方式实例化Test1
    private Test2(){ }

    public static Test2 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {

        Test2 t1 = Test2.getInstance();
        Test2 t2 = Test2.getInstance();
        System.out.println(t1==t2);
    }
}
