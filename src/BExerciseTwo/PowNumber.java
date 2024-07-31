package BExerciseTwo;

import java.util.Scanner;
import java.util.function.Function;

public class PowNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number: ");
        int num = sc.nextInt();

        System.out.println("Input the power: ");
        int power = sc.nextInt();

        Function<Integer, Integer> numbers = x -> (int) Math.pow(x, power);
        System.out.println(powFunction(num, numbers));
    }

    public static Integer powFunction(Integer x, Function<Integer, Integer> numbers) {
        return numbers.apply(x);
    }

}
