
package hashmapdemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> fruitName = new HashSet<>();
        
        fruitName.add("Apple");
        fruitName.add("Mango");
        fruitName.add("Orange");
        
        System.out.println(fruitName);
        System.out.println(fruitName.size());
        
        
        fruitName.remove("Apple");
        System.out.println(fruitName);
        
        fruitName.clear();
        System.out.println(fruitName);
        
      boolean value =  fruitName.isEmpty();
        System.out.println(value);
    }
}
