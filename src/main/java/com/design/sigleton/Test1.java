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
public class Test1 {

    //静态变量,在初始化时只实例化一次
    private static final Test1 INSTANCE =new Test1();

    //私有的构造方法,拒绝外界通过new的方式实例化Test1
    private Test1(){ }

    public static Test1 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {

        Test1 t1 =Test1.getInstance();
        Test1 t2 =Test1.getInstance();
        System.out.println(t1==t2);
    }
}
