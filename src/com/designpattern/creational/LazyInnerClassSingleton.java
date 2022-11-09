package com.designpattern.creational;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {

    }

    //object not created till the time getInstance is calculated
    private static class SingletonPatternHelper {
        private static LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }

    public static LazyInnerClassSingleton getInstance() {
        return SingletonPatternHelper.INSTANCE;
    }

    public static void main(String[] args) {
        LazyInnerClassSingleton licsOne = LazyInnerClassSingleton.getInstance();
        System.out.println("licsOne hashCode is " + licsOne.hashCode());
        LazyInnerClassSingleton licsTwo = LazyInnerClassSingleton.getInstance();
        System.out.println("licsTwo hashCode is " + licsTwo.hashCode());
        System.out.println("licsOne and licsTwo are equal or not : " + licsOne.equals(licsTwo));
    }
}
