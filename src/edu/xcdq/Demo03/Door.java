package edu.xcdq.Demo03;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-29 17:32
 */
//接口 ，定义门的规范
public interface Door {
    //接口的静态常量
     String   desc = "是个门，注意安全";
    public void open();
    public  void close();

    public  default  void test01(){
        System.out.println("接口中的静态方法");
    }
    public  static  void test02(){
        System.out.println("接口中的静态方法");
    }
}
