package poolarea;
//extend parent class in child class
public class Cuboid extends Rectangle{
    double height;
    //constructor to initialize value
    public Cuboid(double width,double length,double height){
        super(width, length);
        if(height<0){
            this.height=0;
        }else{
            this.height=height;
        }
    }
    //method to get value of height

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
