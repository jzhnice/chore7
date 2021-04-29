package edu.xcdq.Demo02.Demo01;

public class Main  extends Door {
    @Override
    public Door open(){
        System.out.println("按遥控开门");
        return null;
    }
    @Override
    public  void  close(){
        System.out.println("按遥控管么");
    }


}
