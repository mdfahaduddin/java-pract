
package this_keyword;


public class Person {
    String name,hcolor;
    int age;
    
    Person(String name,int a){
        this.name = name;
        age = a;
    }
    
    Person(String name,String h ,int a){
        this(name,a);
        hcolor = h;
    }
    
    void display(){
        System.out.println();
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Hair Color : "+hcolor);
    }
}
