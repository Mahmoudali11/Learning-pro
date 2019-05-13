package project_.of_.java;

import java.util.Scanner;

public class Project_Of_Java {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        print();
        boolean exit=true;
        do
        { int x = t.nextInt();
        if (x < 0) {
            print();
        }
        switch (x) {
            case 1: {
                boolean v = true;
                float r = (float) (Math.random()) * 100;
                Circle c = new Circle(r);
                System.out.println("use these laws to caculate area and perimeter" + "\n"
                        + "Area= 3.14*r*r" + "\n"
                        + "perimeter=2*r*3.14" + "\n" + "for example if r=" + r
                        + ",what is area and perimeter?");
                do {
                    System.out.println(" Enter value of area:");

                    float area = t.nextFloat();

                    if (area == (float) c.getArea() ) {
                        System.out.println("True Value ");
                        v = false;
                    } else {
                        System.out.println("Flase value  TRY Again!");
                    }
                } while (v);
                boolean m = true;
                do {
                    System.out.println(" Enter value of perimeter:");

                    float perimeter = t.nextFloat();

                    if (perimeter == (float) c.getPerimeter()   ) {
                        System.out.println("True Value ");
                        m = false;
                    } else {
                        System.out.println("Flase value TRY Again!");
                    }

                } while (m);
                break;
            }
            case 2: {
                float x1 = (float) (Math.random() * 100);
                float y = (float) (Math.random() * 100);
                float z = (float) (Math.random() * 100);
                float k = Math.max(x1, z);
                float b = Math.max(k, y);
                Triangle l = new Triangle(x1, y, z);
                System.out.println("use these laws to caculate area and perimeter" + "\n"
                        + "Area=  sqrt(p*(p-hypotenuse)*(p-side1)*(p-side2) "
                        + ",while p is perimeter is divided by 2" + "\n"
                        + "perimeter= side1+side2+perimeter" + "\n"
                        + "for example if side1=" + x1 + " ans side2=" + y + " side3=" + z
                        + " and hypotenues" + b
                        + ",what is area and perimeter?");

                boolean v = true;

                do { 
                     
                    System.out.println(" Enter value of area:");

                    float area = t.nextFloat();
                    
                    if (area == (float) l.getArea()) {
                        System.out.println("True Value ");
                        v = false;
                    } else {
                        System.out.println("Flase value  TRY Again!");
                    }
                } while (v);
                boolean m = true;
                do {
                    System.out.println(" Enter value of perimeter:");

                    float perimeter = t.nextFloat();

                    if (perimeter == (float) l.getPerimeter() ) {
                        System.out.println("True Value ");
                        m = false;
                    } else {
                        System.out.println("Flase value TRY Again!");
                    }

                } while (m);
              break;
            }
            case 3:{
                boolean v = true;
                float r = (float) (Math.random()) * 100;
               Cube c = new Cube(r);
                System.out.println("use these laws to caculate area and perimeter" + "\n"
                        + "Area= 6*side*side" + "\n"
                        + "perimeter=12*side" + "\n" +"Volume =side*side*side"+"\n "+
                        "for example if r=" + r
                        + ",what is area and perimeter and Volume?");
                do {
                     System.out.println(" Enter value of area:");

                    float area = t.nextFloat();

                    if (area == (float) c.getArea() ) {
                        System.out.println("True Value ");
                        v = false;
                    } else {
                        System.out.println("Flase value  TRY Again!");
                    }
                } while (v);
                boolean m = true;
                do {
                        
                    System.out.println(" Enter value of perimeter:");

                    float perimeter = t.nextFloat();

                    if (perimeter == (float) c.getPerimeter()   ) {
                        System.out.println("True Value ");
                        m = false;
                    } else {
                        System.out.println("Flase value TRY Again!");
                    }

                } while (m);
                 boolean m1 = true;
                do {
                    System.out.println(" Enter value of Volume:");

                    float volume = t.nextFloat();

                    if (volume == (float) c.getVolume()  ) {
                        System.out.println("True Value ");
                        m1 = false;
                    } else {
                        System.out.println("Flase value TRY Again!");
                    }

                } while (m);
                break;
            }
            case 4:{
                boolean v = true;
                float r = (float) (Math.random()) * 100;
                   float r1 = (float) (Math.random()) * 100;
                     float ma=Math.max(r, r1);
                     float mi=Math.min(r, r1);
                Rectangle c = new Rectangle(r,r1);
                System.out.println("use these laws to caculate area and perimeter" + "\n"
                        + "Area= width*length" + "\n"
                        + "perimeter=2*(width+length)" + "\n" + "for example if width=" + mi
                        +" and length= "+ ma+",what is area and perimeter?");
                do {
                    System.out.println(" Enter value of area:");

                    float area = t.nextFloat();

                    if (area == (float) c.getArea() ) {
                        System.out.println("True Value ");
                        v = false;
                    } else {
                        System.out.println("Flase value  TRY Again!");
                    }
                } while (v);
                boolean m = true;
                do {
                    System.out.println(" Enter value of perimeter:");

                    float perimeter = t.nextFloat();

                    if (perimeter == (float) c.getPerimeter()   ) {
                        System.out.println("True Value ");
                        m = false;
                    } else {
                        System.out.println("Flase value TRY Again!");
                    }

                } while (m);
                break;
            }
            case 5:{
                
                boolean v = true;
                float r = (float) (Math.random()) * 100;
              float h = (float) (Math.random()) * 100;

              Cylinder c = new Cylinder(r,h);
                System.out.println("use these laws to caculate area and perimeter" + "\n"
                        + "Area= (2*3.14*r)*height+2*(r*r*3.14)" + "\n"
                        +  "\n" +"Volume =  (r*r*3.14)*height"+"\n "+
                        "for example if radius =" + r
                        +"  and  height="+h+ ",what is area  and Volume?");
                do {
                    System.out.println(c.getArea());
                     System.out.println(" Enter value of area:");

                    float area = t.nextFloat();

                    if (area == (float) c.getArea() ) {
                        System.out.println("True Value ");
                        v = false;
                    } else {
                        System.out.println("Flase value  TRY Again!");
                    }
                } while (v);
              
                 boolean m1 = true;
                do {
                    System.out.println(" Enter value of Volume:");

                    float volume = t.nextFloat();

                    if (volume == (float) c.getVolume()  ) {
                        System.out.println("True Value ");
                        m1 = false;
                    } else {
                        System.out.println("Flase value TRY Again!");
                    }

                } while (m1);
                break;
            }
             
            case 6:{
                exit=false;
            }
        }

    }while(exit);}

    public static void print() {
        System.out.println("please choose any shape you want,  then enter it's number !" + "\n"
                + "1]Circle."
                + "\n" + "2]Triangle."
                + "\n" + "3]Cube. "
                + "\n" + "4]Rectangle." + "\n" + "5]cylinder." + "\n "+
                "6]Exit."+"\n"
                + " enter a negative number,to go main menue!");
    }

}
