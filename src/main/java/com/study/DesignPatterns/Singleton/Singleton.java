package com.study.DesignPatterns.Singleton;

// inner static helper class방식의 싱글톤패턴
public class Singleton {

    private Singleton(){}

    private static class SingletonHelper{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
