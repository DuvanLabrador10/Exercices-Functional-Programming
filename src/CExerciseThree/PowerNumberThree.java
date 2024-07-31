package CExerciseThree;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class PowerNumberThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number: ");
        int num = sc.nextInt();

        System.out.println("Input the power: ");
        int power = sc.nextInt();

        Function<Integer, Integer> numbers = x -> (int) Math.pow(x, power);
        Integer result = powFunction(num, numbers);
        System.out.println(result);

        Predicate<Integer> verifyIsPar = x -> x % 2 == 0;
        Boolean resultTwo = isPar(result,verifyIsPar);
        System.out.println("is par? = " + resultTwo);


    }

    public static Integer powFunction(Integer x, Function<Integer, Integer> numbers) {
        return numbers.apply(x);
    }

    public static Boolean isPar(int x, Predicate<Integer> number){
        return number.test(x);
    }


}
