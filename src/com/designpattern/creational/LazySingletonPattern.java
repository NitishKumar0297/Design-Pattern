package com.designpattern.creational;

import java.util.Objects;

public class LazySingletonPattern {
    private LazySingletonPattern() {

    }

    private static LazySingletonPattern INSTANCE = null;

    //but this will give performance issue as well when two threads simultanously access below method
    public static synchronized LazySingletonPattern getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new LazySingletonPattern();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        LazySingletonPattern lspOne = LazySingletonPattern.getInstance();
        System.out.println("lspOne hashCode is " + lspOne.hashCode());
        LazySingletonPattern lspTwo = LazySingletonPattern.getInstance();
        System.out.println("lspTwo hashCode is " + lspTwo.hashCode());
        System.out.println("lspOne and lspTwo are equal or not : " + lspOne.equals(lspTwo));
    }
}
