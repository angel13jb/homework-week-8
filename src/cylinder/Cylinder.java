package cylinder;
//class overloading
public class Cylinder extends Circle {
    double height;
//calling parent class constructor value
    Cylinder(double radius,double height) {
        super(radius);
       if(height<0){
            height=0;
        }
       height=height;
    }
    public double getHeight(){
        return height;
    }
    //get volume of cylinder
    public double getVolume(){
        return getArea() * getHeight();
    }

}
