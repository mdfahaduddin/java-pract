
package projecttwo;

public class StringBuffer2 {
    public static void main(String[] args) {
        String s1 = "1211";
                
                StringBuffer sb = new StringBuffer(s1);
                
                String sb2 = sb.reverse().toString();
                
                if(s1.equals(sb2)){
             System.out.println("Palindrom");
         }else{
             System.out.println("Not Palindrom");
         }
    }
    
}
