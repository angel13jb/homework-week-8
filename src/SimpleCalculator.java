public class SimpleCalculator {
    //program of number of calculator
    double firstNumber;
    double secondNumber;

    //method 1 with no parameter
    public void getFirstNumber() {
        firstNumber = 0;
    }

    //method 2 with no parameter
    public void getSecondNumber() {
        secondNumber = 0;
    }

    //method 3 with parameter set value
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    //method 4 with parameter with set value
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //method 5 with no parameter return value
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    //method 6 with no parameter return value
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    //method 7 with no parameter return value
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    //method 8 with no parameter return value
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else
            return firstNumber / secondNumber;


    }

    //calling in main method
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add:" + calculator.getAdditionResult());
        System.out.println("subtract:" + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply:" + calculator.getMultiplicationResult());
        System.out.println("divide:" + calculator.getDivisionResult());


    }

}
