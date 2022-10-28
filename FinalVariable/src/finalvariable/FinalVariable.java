
package finalvariable;


public class FinalVariable {

   final String UV_NAME="University of Sout Asia";
   final int fees;//blank final variable
   static final int fees2;
   
   static{
       fees2=1000;
   }
   
   
   FinalVariable(){
       fees = 2000;
   }
   void display(){
       
       System.out.println("Name : "+UV_NAME);
       System.out.println("Fees : "+fees);
       System.out.println("Fees2 : "+fees2);
   }
    
}
