
package projecttwo;


public class StringtoPrimitive {
    public static void main(String[] args) {
        //primitive data type to String
        double x = 10.202;
        String str = Double.toString(x);
        System.out.println(str);
        
        //String to primitive data type
        String str1 = "320";
        int y = Integer.parseInt(str1);
        double z = Double.parseDouble(str1);
        System.out.println(y);
        System.out.println(z);
        
        y = Integer.valueOf(str1);
        System.out.println(y);
    }
}
