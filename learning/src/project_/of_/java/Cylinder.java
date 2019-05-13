 
package project_.of_.java;

 
public class Cylinder extends Circle  {
    private float height;
    public Cylinder (float r,float height){
        this.height=height;
        super.setradius(r);
    }

    
    public float getAreaofSide() {
         return  (float) (getPerimeter()*height);
    }

    @Override
    public float getArea() {
        return (float) (getAreaofSide()+2*super.getArea());
       }
    public float getVolume(){
        return (float) (super.getArea()*height);
    }
    public float getareaofbase(){
        return super.getArea();
    }
    public float getperimeterofbase(){
        return super.getPerimeter();
    }

    @Override
    public String toString() {
         return  "Area="+getArea()+" Volume="+getVolume();
    }
     

  
    
    
}
