
package filedemo;

import java.io.File;
import java.util.Scanner;

public class FileDemo3 {
    public static void main(String[] args) {
        try{
        File file = new File("C:\\Users\\walton\\Desktop\\person\\person1.txt");
        
        Scanner sc = new Scanner(file);
        
        
        while(sc.hasNext()){
        String id = sc.next();
        String name = sc.next();
        
            System.out.println("ID : "+id+" Name : "+name);
        }
        sc.close();
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
