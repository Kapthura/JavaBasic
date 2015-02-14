package com.kaps.javabasic;

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
    
    void arrayDemo03(){
    
        int[][] c= new int[3][3];
        
        c[0][0]=1;
        c[0][1]=2;
        c[0][2]=3;
        c[1][0]=4;
        c[1][1]=5;
        c[1][2]=6;
        c[2][0]=7;
        c[2][1]=8;
        c[2][2]=9;
        
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println("");
        }
    
    }
}
