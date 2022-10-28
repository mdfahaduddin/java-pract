
package oop1;

public class Box {
    double height,width,depth;
    
     Box(double height, double w, double d){
         this.height = height;
         width = w;
         depth = d;
     }
     
    void displayVol(){
       double vol = height * width * depth;
        System.out.println("Volume : "+vol);
    }
}
