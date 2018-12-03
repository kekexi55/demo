package com.example.test;

public class SingleTon1 {
    private SingleTon1(){
        System.out.println("initialized");
    }
    private static class Holder{
        static SingleTon1 instance = new SingleTon1();
        static SingleTon2 heeh =null;
    }
    public static SingleTon1 getInstance(){
        return Holder.instance;
    }

}
