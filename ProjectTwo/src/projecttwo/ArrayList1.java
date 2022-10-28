
package projecttwo;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(2,60);
        
        for(int x : num){
            System.out.print(x+", ");
        }
        System.out.println("Size = "+num.size());
        System.out.println(num);
        
        //iterator
        Iterator itrin = num.iterator();
        
        while(itrin.hasNext()){
            System.out.print(itrin.next()+", ");
        }
         int position = num.indexOf(40);
        System.out.println("Index of 40 : "+position);
        num.set(4,70);
        System.out.println("after setting : "+num);
        
       int a = num.get(0);
        System.out.println(a);
        
        num.remove(2);
        System.out.println();
        System.out.println("After Removing: "+num);
        
      //  num.removeAll(num);
     //   System.out.println("Removing all: "+num);
        boolean numcheck = num.contains(30);
        System.out.println("Avaliable in list ? : "+numcheck);
       
        num.clear();
        System.out.println(num);
        boolean check =  num.isEmpty();
        System.out.println("List empty : "+check);
        
    }
    
}
