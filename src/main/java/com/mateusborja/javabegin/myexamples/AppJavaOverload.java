
package com.mateusborja.javabegin.myexamples;

/**
 *
 * @author mateus.borja
 */
public class AppJavaOverload {
    
    public static void main(String[] args) {
        
        JavaOverload s1 = new JavaOverload();
        
        int sumApp = s1.sum(55, 45);
        System.out.println(sumApp);
        
        int sumApp1 = s1.sum(30, 10, 60);
        System.out.println(sumApp1);
        
        
        
    }
    
}
