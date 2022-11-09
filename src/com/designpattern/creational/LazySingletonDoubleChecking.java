package com.designpattern.creational;

import java.util.Objects;

public class LazySingletonDoubleChecking {

    private LazySingletonDoubleChecking() {

    }

    private static LazySingletonDoubleChecking INSTANCE = null;

    public static synchronized LazySingletonDoubleChecking getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (LazySingletonDoubleChecking.class) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new LazySingletonDoubleChecking();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        LazySingletonDoubleChecking lsdcpOne = LazySingletonDoubleChecking.getInstance();
        System.out.println("lsdcpOne hashCode is " + lsdcpOne.hashCode());
        LazySingletonDoubleChecking lsdcpTwo = LazySingletonDoubleChecking.getInstance();
        System.out.println("lsdcpTwo hashCode is " + lsdcpTwo.hashCode());
        System.out.println("lsdcpOne and lsdcpTwo are equal or not : " + lsdcpOne.equals(lsdcpTwo));
    }
}
