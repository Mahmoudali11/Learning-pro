 
package project_.of_.java;

 
public abstract class Shape {
    private String name;
    public Shape()
    {
        this.name="  ";
    }
    public Shape(String name){
        this.name=name;
    }
    public String  getName(){
        return name;
    }
    public abstract float getArea();
    public abstract float getPerimeter();
    
}
