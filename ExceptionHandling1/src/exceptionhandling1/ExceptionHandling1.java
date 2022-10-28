/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling1;

/**
 *
 * @author MD Fahad
 */
public class ExceptionHandling1 {

    
    public static void main(String[] args) {
        
        try{
             int x = 10;
   int y = 0;
   int res = x/y;
   
        System.out.println(res);
        }catch(ArithmeticException e){
            System.out.println("Exception : "+e);
        }catch(Exception e2){
            System.out.println("Exception : "+e2);
        }
        
        finally{
            System.out.println("Last line code");
        }
        
        
         
    }
    
}
