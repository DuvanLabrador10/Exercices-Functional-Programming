package HExerciseEight;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first number: ");
        Double firstNumber = sc.nextDouble();

        System.out.println("Input the second number: ");
        Double secondNumber = sc.nextDouble();

        System.out.println("Input the third number: ");
        Double thirdNumber = sc.nextDouble();

        Calculator calculator = new Calculator();
        calculator.addition(firstNumber)
                .subtract(secondNumber)
                .multiply(thirdNumber)
                .getResult();

    }
}
