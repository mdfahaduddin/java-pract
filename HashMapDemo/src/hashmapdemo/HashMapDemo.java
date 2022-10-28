
package hashmapdemo;

import java.util.HashMap;

public class HashMapDemo {

  
    public static void main(String[] args) {
        
        HashMap<Integer,String> customer = new HashMap<>();
        
        //put and get
        customer.put(101, "Md Fahad");
        customer.put(102, "Md Shuvo");
        customer.put(103, "Md ABDULLAH");
        
        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
    }
    
}
