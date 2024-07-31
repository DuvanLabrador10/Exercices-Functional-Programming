package HExerciseEight;

public class Calculator {
    private Double result;

    public Calculator() {
        this.result = 0.0;
    }

    public Calculator(Double result){
        this.result = result;
    }

    public Calculator addition(Double number){
        System.out.print(this.result + " + " + number);
        this.result += number;
        System.out.println(" After addition: " + " = " + this.result);
        return this;
    }

    public Calculator subtract(double number) {
        System.out.print(this.result + " - " + number);
        this.result -= number;
        System.out.println(" After subtraction: " + " = " + this.result);
        return this;
    }

    public Calculator multiply(double number) {
        System.out.print(this.result + " * " + number);
        this.result *= number;
        System.out.println(" After Multiplication: " + " = " + this.result);
        return this;
    }

    public double getResult() {
        System.out.println("The Accumulated is = " + this.result);
        return this.result;
    }

}
