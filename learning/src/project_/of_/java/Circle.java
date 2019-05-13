 
package project_.of_.java;

 
public class Circle extends Shape {
    private float radius;
    public Circle(){
        radius=(float)0.1;
    }
    public Circle(float radius ){
        this.radius=radius;
    }
  public void setradius (float r){
      this.radius=r;
  }
    @Override
    public float getArea() {
        return (float) (radius*radius*3.14);
     }

    @Override
    public float getPerimeter() {
        return (float) (2*3.14*radius);
     }
    @Override
    public String toString (){
        return "Area= "+getArea()+" Perimeter= "+getPerimeter();
    }
    
}
