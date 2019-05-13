 
package project_.of_.java;
 
public class Rectangle extends Shape {
    private float length;
    private float width;
    public Rectangle(float l,float w){
        this.length=l;
        this.width=w;
    }

    @Override
    public float getArea() {
        return (float) (length*width);
     }

    @Override
    public float getPerimeter() {
        return (float) (2*(length+width));
     }
    @Override
    public String toString(){
        return "Area="+getArea()+" perimeter="+getPerimeter();
    }
    
}
