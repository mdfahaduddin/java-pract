
package encapsulation1;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Md Fahad Uddin.");
        System.out.println(p1.getName());
        
        p1.setId("211-0317-006");
        System.out.println(p1.getId());
        
        p1.setAge(22);
        System.out.println(p1.getAge());
        
    }
}
