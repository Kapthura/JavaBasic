package com.kaps.javabasic;

/**
 *
 * @author kapthura
 */
public class SpecialClass {
    
    //This method can handle any number of inputs
    
    void anyNoOfInputs(int...num){
    int tot=0;
        for (int o : num) {
            tot+=o;
        }
        System.out.println("Total is : "+tot);
    }
}
