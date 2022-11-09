package com.designpattern.creational;

public class EagerSingletonPattern {

    //step 1 create private constructor
    private EagerSingletonPattern() {

    }

    /*step 2 create object during class loading*/
    private static final EagerSingletonPattern INSTANCE = new EagerSingletonPattern();

    /*step 3 get instance during class loading*/
    public static EagerSingletonPattern getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        EagerSingletonPattern objectOne = EagerSingletonPattern.getInstance();
        System.out.println("hashcode of objectOne is " + objectOne.hashCode());

        EagerSingletonPattern objectTwo = EagerSingletonPattern.getInstance();
        System.out.println("hashcode of objectTwo is " + objectTwo.hashCode());

        System.out.println("ObjectOne and objectTwo are equal " + objectOne.equals(objectTwo));
    }
}
