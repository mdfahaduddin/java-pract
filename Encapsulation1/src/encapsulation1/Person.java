
package encapsulation1;

public class Person {
   private String name,id;
   private int age;
   
   //setter
   public void setName(String name){
       this.name = name;
   }
   
    public void setId(String id){
       this.id = id;
   }
    
     public void setAge(int a){
       age = a;
   }
    
     //getter
   public String getName(){
       return name;
   }
   
   public String getId(){
       return id;
   }
   
   public int getAge(){
       return age;
   }
    
}
