
package projecttwo;


public class String1 {
    public static void main(String[] args) {
        String str1 = "MD Fahad Uddin.";
        String str2 = "Md Shuvo";
        String str4 = new String("MD Fahad Uddin.");
        
        char[] str3 = {'F','a','h','a','d'};
        System.out.println(str3);
        
       int len = str1.length();
        System.out.println("Length = "+len);
        
        if(str1.equals(str4)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        String multiName = str1.concat(str2);
        System.out.println(multiName);
        
        String upper = multiName.toUpperCase();
        System.out.println(upper);
        
        String lower = multiName.toLowerCase();
        System.out.println(lower);
        
        boolean last = str2.endsWith("o");
        System.out.println("Last char : "+last);
        
        
        
    }
    
}
