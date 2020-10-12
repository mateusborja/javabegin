
package com.mateusborja.javabegin.myexamples;

/**
 *
 * @author mateus.borja
 */
public class JavaOverload {
    
    int sum (int x, int y) {
        System.out.println("int sum (int x, int y)");
        return x + y;
        
    }
    
    int sum (int x, int y, int z) {
        System.out.println("int sum (int x, int y, int z) ");
        return x + y + z;
    }
    
    double sum (double x, double y) {
        System.out.println("double sum (double x, double y)");
        return x + y;
    }
    
    double sum (double x, double y, double z) {
        System.out.println("double sum (double x, double y, double z)");
        return x + y + z;
    }
    
    
    
    
}
