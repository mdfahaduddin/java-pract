
package problem1;


public class Rectangle extends Shape {
    
    Rectangle(double a1, double a2){
        super(a1,a2);
    }
    
    @Override
    void area(){
        double res = dim1*dim2;
        System.out.println("Rectangle : "+res);
    }
    
}
