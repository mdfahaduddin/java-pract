
package projecttwo;


public class Wrapper1 {
    public static void main(String[] args) {
        //primitive to object = autoboxing
        int x = 30;
        Integer y = Integer.valueOf(x);
        
        System.out.println(y);
        
        
        Integer z =x; //Integer.valueOf(x) => this is autoboxing
        System.out.println(z);
        
        
        // object to primitive = unboxing
        Double d = new Double (110.8);
        System.out.println(d);
        
        double e = d; //d.doubleValue();
        System.out.println(e);
        
    }
    
}
