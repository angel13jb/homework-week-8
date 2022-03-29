package poolarea;

public class Rectangle {
    double width;
    double length;
    //constructor to set value
    public Rectangle(double width,double length){
        if(width<0){
            this.width=0;
        }else{
            this.width=width;
        }
        if(length<0){
            this.length=0;
        }else{
            this.length=length;
        }
    }
    //method to get value of width

    public double getWidth() {
        return width;
    }
    //method to get value of length

    public double getLength() {
        return length;
    }
    //method to get value of area
    public double getArea(){
        return(width*length);
    }
}
