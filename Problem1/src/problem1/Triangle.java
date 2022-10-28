
package problem1;


public class Triangle extends Shape {
     Triangle(double d1, double d2){
        super(d1,d2);
    }
    
    @Override
    void area(){
        double res = 0.5*dim1*dim2;
        System.out.println("Triangle : "+res);
    }
}
