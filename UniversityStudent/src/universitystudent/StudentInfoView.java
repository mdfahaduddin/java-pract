/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitystudent;

/**
 *
 * @author MD Fahad
 */
public class StudentInfoView {
    public static void main(String[] args) {
        Student s1 = new Student("MD Fahad Uddin","211-0317-006");
        Student s2 = new Student();
        s2.totalStudent();
        Student s3 = new Student();
        s3.totalStudent();
        Student s4 = new Student();
        s4.totalStudent();
        s1.studentInfoDisplay();
       
        
        
        
        System.out.println("UN : "+Student.universityName);
    }
}
