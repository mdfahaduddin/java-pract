
package oop;


public class OverLoadingConstTeacher {
    public static void main(String[] args) {
        Teacher ob = new Teacher();
        ob.add();
        ob.add(10,20);
        ob.add(10,20,30);
        Teacher teacher2 = new Teacher("MD Fahad Uddin","male");
        teacher2.displayInfo();
        Teacher teacher3 = new Teacher("MD Shuvo","male",1832);
        teacher3.displayInfo();
    }
    
}
