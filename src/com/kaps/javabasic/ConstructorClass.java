package com.kaps.javabasic;

/**
 *
 * @author kapthura
 */
public class ConstructorClass {

    private int id;
    private String name;

    //default Constructor
    public ConstructorClass() {

    }

    //Parameterized Constructor 01
    public ConstructorClass(int i) {
        id = i;
    }

    //Parameterized Constructor 02
    public ConstructorClass(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID :" + id + " \t name :" + name);
    }
}
