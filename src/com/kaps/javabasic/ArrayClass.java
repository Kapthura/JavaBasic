package com.kaps.javabasic;

import java.util.ArrayList;

/**
 *
 * @author kapthura
 */
public class ArrayClass {

    //Single Dimentio Array
    void arrayDemo1() {
        int a[] = new int[5];//declaration and instantiation  
        a[0] = 10;//initialization  
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

        //printing array  
        for (int i = 0; i < a.length; i++)//length is the property of array  
        {
            System.out.println(a[i]);
        }
    }

    void arrayDemo2() {

        int b[] = {5, 10, 15, 20, 25};//declaration, instantiation and initialization  

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

    //Multidimention Array
    void arrayDemo03() {

        int[][] c = new int[3][3];

        c[0][0] = 1;
        c[0][1] = 2;
        c[0][2] = 3;
        c[1][0] = 4;
        c[1][1] = 5;
        c[1][2] = 6;
        c[2][0] = 7;
        c[2][1] = 8;
        c[2][2] = 9;

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println("");
        }

    }

    //Array List
    void arrayListDemo() {

        //declaration and instantiation  
        ArrayList<String> arraylist = new ArrayList<String>();

        //initialization  
        arraylist.add("Cat");
        arraylist.add("Dog");
        arraylist.add("Bird");

        //Checking size of ArrayList
        int size = arraylist.size();
        System.out.println("Size of the arraylist is : " + size);

        //Checking Index of an Item in Java ArrayList
        int index = arraylist.indexOf("Dog");
        System.out.println("Index of value \'Dog\' :" + index);

        //Retrieving Item from ArrayList in a loop
        for (int i = 0; i < arraylist.size(); i++) {
            String get = arraylist.get(i);
            System.out.println(" Animal is " + get);
        }

        //Checking if ArrayList is Empty
        boolean check = arraylist.isEmpty();
        System.out.println("Is arraylist is empty :" + check);

        //Removing an Item from ArrayList
        arraylist.remove(0);//remove by index
        arraylist.remove("Bird");
        System.out.println("After removeing items from ArrayList");
        //Use for-each loop to Retrieving Item
        for (String arraylist1 : arraylist) {
            System.out.println(" Animal is " + arraylist1);
        }
    }

}
