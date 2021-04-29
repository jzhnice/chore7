package edu.xcdq.Demo01;

import edu.xcdq.Demo01.Door;

public class Main  extends Door {
    @Override
    public  void open(){
        System.out.println("按遥控开门");
    }
    @Override
    public  void  close(){
        System.out.println("按遥控管么");
    }


}
