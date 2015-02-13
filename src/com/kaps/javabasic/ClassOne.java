package com.kaps.javabasic;

/**
 *
 * @author kapthura
 */
class ClassOne {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void display(String name) {
        System.out.println("Hello "+name+" how are you ?");
    }
}
