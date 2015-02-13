package com.kaps.javabasic;

import java.util.Scanner;

/**
 *
 * @author kapthura
 */
public class JavaBasic {

    public static void main(String[] args) {

        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Hi what is your name : ");
        
        ClassOne co = new ClassOne();

        co.setName(sc.nextLine());
        name = co.getName();

        co.display(name);
    }

}
