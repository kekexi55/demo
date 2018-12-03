package com.example.test;

public class SingleTon2 {
    private SingleTon2() {
        System.out.println("initialized");
    }
    private static volatile  SingleTon2 instance = null;
    public static SingleTon2 getInstance(){
        if(instance==null){
            synchronized (SingleTon2.class){
                if(instance==null){
                    instance = new SingleTon2();
                }
            }
        }
        return instance;
    }
}
