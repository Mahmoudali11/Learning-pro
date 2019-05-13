 
package project_.of_.java;
 
public class Cube extends Shape {
    private float side;
    public Cube(float side){
        this.side=side;
    }

    @Override
    public float getArea() {
        return (float) (side*side*6);
     }

    @Override
    public float getPerimeter() {
        return (float) (12*side);
     }
     public float getVolume(){
        return (float) Math.pow(side, 3);
    }
     @Override
      public String toString(){
       return   "Area= "+getArea()+" Perimeter= "+getPerimeter()+" volume="+getVolume();

    }
    
    
}
