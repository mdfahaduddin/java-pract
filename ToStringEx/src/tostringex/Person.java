
package tostringex;


public class Person {
    String name;
    int age;
    
    Person(String n, int a){
        name = n;
        age = a;
    }
    
    @Override
    public String toString(){
        return "Name : "+name +"\nAge : "+age;
    }
    
}
