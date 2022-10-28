
package oop;

/**
 *
 * @author MD Fahad
 */
public class Recursion1 {
    
    int fact( int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    
}
}
