package edu.xcdq.Demo01;

import edu.xcdq.Demo01.Door;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-29 16:39
 */
public class    keypadDoor  extends Door {
    @Override
    public void open(){
        System.out.println("输入密码开门");
    }
    @Override
    public void close(){
        System.out.println("轻轻关上");
    }
}
