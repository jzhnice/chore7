package edu.xcdq.Demo02.Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-29 16:39
 */
public class keypadDoor  extends Door {
    @Override
    public Door open(){
        System.out.println("输入密码开门");
        return null;
    }
    @Override
    public void close(){
        System.out.println("轻轻关上");
    }
}
