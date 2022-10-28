
package projecttwo;


public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("MD Fahad Uddin");
        System.out.println(str1);
        
        str1.append(" Shuvo ");
        str1.append( 2110317006 );
        System.out.println(str1);
        
        str1.reverse();
        System.out.println(str1);
        
        str1.delete(2,4);
        System.out.println(str1);
    }
    
}
