
package problem1;


public class Circle extends Shape {
       Circle(double r){
        super(r,r);
    }
    
    @Override
    void area(){
        double res = Math.PI*dim1*dim2;
        System.out.println("Cicle Area : "+res);
    }
    
}
