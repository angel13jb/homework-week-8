package carpetcostcalculator;

public class Floor {
    //instance variable
    double width;
    double length;
//constructor with parameters and initializing value
    public Floor(double width,double length){
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
//method return area
public double getArea(){
        return width*length;
}


}
