package edu.xcdq.Demo02.Demo01;

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
      Door door =   new Door() {
            @Override
            public Door open() {
                System.out.println("临时实现的开门");
                return null;
            }

            @Override
            public void close() {
                System.out.println("临时实现的关门");

            }


        }.open();
      door.open();
      door.close();
    }
}