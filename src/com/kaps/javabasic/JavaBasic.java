package com.kaps.javabasic;

import java.util.Scanner;

/**
 *
 * @author kapthura
 */
public class JavaBasic {

    public static void main(String[] args) {

        /*   //Ex 01
         //calling to other class,cmd input,Getters and Setters
         String name;

         Scanner sc = new Scanner(System.in);

         System.out.println("Hi what is your name : ");
        
         ClassOne co = new ClassOne();

         co.setName(sc.nextLine());
         name = co.getName();

         co.display(name);*/
        /* //Ex 02
         //Constructors
         //Calling to default Constructor
         ConstructorClass cc = new ConstructorClass();
         cc.display();
        
         //Calling to parameterized Constructor 01
         ConstructorClass cc1= new ConstructorClass(123);
         cc1.display();

         //Calling to parameterized Constructor 02
         ConstructorClass cc2 = new ConstructorClass(456, "Kaps");
         cc2.display();*/
       /* //Ex 03
        //Control Flow Statement
        //Switch Statement 
        //Send month no display month name
        ControlFlowStatementClass cfs = new ControlFlowStatementClass();
        //cfs.switchM(14);
        // cfs.dowhile();
        //cfs.forM1();
         //cfs.forM2();*/
        
        //Ex04
        //Array
        //ArrayClass ac=new ArrayClass();
        //ac.arrayDemo1();
        //ac.arrayDemo2();
        //ac.arrayDemo03();
        
        //Ex05
        //Special Stuff
        SpecialClass sp=new SpecialClass();
        
        //Any no of inputs
        sp.anyNoOfInputs(2,5,7,14,40);
        
    }

}
