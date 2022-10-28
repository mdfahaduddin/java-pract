
package filedemo;

import java.io.File;


public class FileDemo {

   
    public static void main(String[] args) {
        
        File dir = new File("C:\\Users\\walton\\Desktop\\person");
        if(dir.mkdir()){
            System.out.println(dir.getName() +" folder created");
        }
       String dloc = dir.getAbsolutePath();
        System.out.println(dloc);
        
        //if(dir.delete()){
          //  System.out.println(dir.getName() +" folder delete");
       // }
       
       File file1 = new File("C:\\Users\\walton\\Desktop\\person\\person1.txt");
       File file2 = new File("C:\\Users\\walton\\Desktop\\person\\person2.txt");
       
       try{
       file1.createNewFile();
       file2.createNewFile();
           System.out.println("Created");
       }catch(Exception e){
           System.out.println(e);
       }
       
       file1.delete();
       if(file1.exists()){
           System.out.println("File exists");
       }else{
           System.out.println("File does not exists");
       }
        
    }
    
}
