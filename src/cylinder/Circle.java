package cylinder;
//class with instance variable
public class Circle {
    double radius;
    //constructor with parameter
    Circle(double r){
        if(r<0){
            r=0;
        }
        radius=r;
    }
    //return type method
    public double getRadius(){
        return radius;
    }
    //return type method to get area value
    public double getArea(){
        return (radius*radius*Math.PI);
    }

}
