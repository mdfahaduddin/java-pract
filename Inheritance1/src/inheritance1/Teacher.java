
package inheritance1;


public class Teacher extends Person {
    String qualification;
    
    
    void displayInfo2(){
        displayInfo();
        System.out.println("Qualification : "+qualification);
    }
}
