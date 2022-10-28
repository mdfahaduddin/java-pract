
package linkedlist1;

import java.util.LinkedList;

public class LinkedList2Test {
    public static void main(String[] args) {
        LinkedList<LinkedList2> list = new LinkedList<>();
        
        LinkedList2 s1 = new LinkedList2("Md Fahad","12","211-0317-006");
        LinkedList2 s2 = new LinkedList2("Md Shuvo","12","211-0317-006");
        LinkedList2 s3 = new LinkedList2("Md Abdullah","12","211-0317-006");
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        for(LinkedList2 s : list){
            System.out.println(s.name);
            System.out.println(s.cname);
            System.out.println(s.id);
        }
    }
}
