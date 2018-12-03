package com.example.test;

import java.util.List;

public class FinallyTest {
    private static int test(){
        int x =1;
        try{
            throw  new NullPointerException();
        }catch (Exception e){
            x = x+1;
            return x;
        }finally {
            x = x+1;
            return x;
        }
    }
    public static void main(String[]args){
        System.out.println(test());
    }
}
