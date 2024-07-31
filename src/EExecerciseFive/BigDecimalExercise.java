package EExecerciseFive;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class BigDecimalExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first number: ");
        BigDecimal numberOne = sc.nextBigDecimal();

        System.out.println("Input the second number: ");
        BigDecimal numberTwo = sc.nextBigDecimal();

        BigDecimal result = divisionNumber(numberOne, numberTwo);
        System.out.println(result);
    }

    public static BigDecimal divisionNumber(BigDecimal numberOne, BigDecimal numberTwo) {
        BinaryOperator<BigDecimal> division = (x, y) -> x.divide(y, 2, RoundingMode.HALF_UP);
        return division.apply(numberOne, numberTwo);
    }
}
