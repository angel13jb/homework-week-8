package carpetcostcalculator;

public class Calculator {
    //instance variable
    Floor floor;
    Carpet carpet;
    //constructor to initialize the field
    public Calculator(Floor floor,Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }
    //method to calculate total cost
    public double getTotalCost(){
        double area= floor.getArea();
        double cost= carpet.getCost();
        return area*cost;
    }




}
