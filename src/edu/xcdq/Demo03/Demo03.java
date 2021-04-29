package edu.xcdq.Demo03;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-29 17:43
 */
public class Demo03 {
    public static void main(String[] args) {
        KeypadDoor keypadDoor =new KeypadDoor();
        keypadDoor.close();
        keypadDoor.open();

        keypadDoor.test01();
//        Door.test01();
//        keypadDoor.test02();
        Door.test02();
        // 可以用接口的类型 接受实现创建的对象
        Door powerDoor = new PowerDoor();
        powerDoor.open();
        powerDoor.close();
    }
}
