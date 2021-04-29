package edu.xcdq.Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-29 16:44
 */
public class Demo01 {
    public static void main(String[] args) {
       keypadDoor keypadDoor = new keypadDoor();
        keypadDoor.open();

        keypadDoor.close();
        Main main = new Main();
        main.close();
        main.open();

    }
}
