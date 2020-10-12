
package com.mateusborja.javabegin.myexamples;

/**
 *
 * @author mateus.borja
 */
public class AppJavaOverload {
    
    public static void main(String[] args) {
        
        JavaOverload s1 = new JavaOverload();
        
        int sumApp1 = s1.sum(55, 45);
        System.out.println(sumApp1);
        
        int sumApp2 = s1.sum(30, 10, 60);
        System.out.println(sumApp2);
        
        double sumApp3 = s1.sum(12.3, 13.2);
        System.out.println(sumApp3);
        
        
        
        
        
    }
    
}
