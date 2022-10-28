
package linkedlist1;

import java.util.LinkedList;


public class LinkedList1 {

   
    public static void main(String[] args) {
       LinkedList<String> countryNames = new LinkedList<>();
       
       countryNames.add("Saudi");
       countryNames.add("BD");
       countryNames.add("PAK");
       countryNames.add("Turky");
       countryNames.add(4,"Afg");
       countryNames.addFirst("Makka");
       
        System.out.println(countryNames);
        
        countryNames.forEach(System.out::println);
        System.out.println(countryNames.size());
    }
    
}
