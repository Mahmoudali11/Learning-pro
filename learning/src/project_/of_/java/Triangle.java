 
package project_.of_.java;
 
public class Triangle extends Shape {
    private float side1;
    private float side2;
    private float hypotenuse;
    public Triangle(float s1,float s2,float h){
        this.hypotenuse=h;
        this.side1=s1;
        this.side2=s2;
    }
 
    float pe=0;
    @Override 
    public float getPerimeter() { 
              
       pe=hypotenuse+side1+side2;
       return  pe;
     }
    @Override 
    public float getArea() {
        float p=(float)(getPerimeter()/2);
        return (float) Math.sqrt(p*(p-hypotenuse)*(p-side1)*(p-side2));
     }
    @Override
   public String toString(){
       return   "Area= "+getArea()+" Perimeter= "+getPerimeter();

    }
    
    
}
