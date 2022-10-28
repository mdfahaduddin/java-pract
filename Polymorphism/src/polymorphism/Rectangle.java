
package polymorphism;


public class Rectangle extends Shape {
    
    double length, width;
    
    Rectangle(double l, double w){
        length = l;
        width = w;
    }
    
    @Override
    double area(){
        return length*width;
    }
}
