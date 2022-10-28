
package projecttwo;

public class BrCn {
    public static void main(String[] args){
        int i;
        for (i = 1; i <= 100; i++) {
            if (i == 10) {
                break;
            }
            System.out.println(i);
        }
        
        for (i = 1; i <= 100; i++) {
            if (i == 10) {
                continue;
            }
            System.out.println(i);
        }
    }
    
}
