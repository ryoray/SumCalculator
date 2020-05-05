public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double getAdditionResult() {
        double sum = getFirstNumber() + getSecondNumber();
        return sum;
    }

    public double getSubtractionResult() {
        double subtract = getFirstNumber() - getSecondNumber();
        return subtract;
    }

    public double getMultiplicationResult() {
        double multiply = getFirstNumber() * getSecondNumber();
        return multiply;
    }

    public double getDivisionResult() {
        double division;
        if (getSecondNumber() == 0) {
            division = 0.0;
        } else {
            division = getFirstNumber() / getSecondNumber();
        }
        return division;
    }
}
