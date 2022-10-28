
package inheritance1;

public class TestforAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        PersonforAnimal p = new PersonforAnimal();
        TeacherforPerson t = new TeacherforPerson();
        
        
        System.out.println(a instanceof Animal);
        System.out.println(p instanceof PersonforAnimal);
        System.out.println(t instanceof TeacherforPerson);
        System.out.println(a instanceof PersonforAnimal);
    }
}
