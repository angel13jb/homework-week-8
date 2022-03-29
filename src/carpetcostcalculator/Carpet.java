package carpetcostcalculator;

public class Carpet {
    //instance variable
    double cost;

    //constructor with parameters
    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }

    }

    //method return value cost
    public double getCost() {
        return cost;
    }
}