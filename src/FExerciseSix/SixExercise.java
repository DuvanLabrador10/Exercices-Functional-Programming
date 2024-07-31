package FExerciseSix;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.BiFunction;

public class SixExercise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the name: ");
        String name = sc.next();

        System.out.println("Input the age: ");
        int age = sc.nextInt();


        String result = getAgeMessage(name,age,LocalDate.of(2000,6,21));
        System.out.println(result);
    }


    public static String getAgeMessage(String name, int age, LocalDate birthDate) {
        BiFunction<Integer, LocalDate, Boolean> validateAge = (inputAge, dateOfBirth) -> {
            int calculatedAge = Period.between(dateOfBirth, LocalDate.now()).getYears();
            return calculatedAge == inputAge;
        };
        boolean isCorrect = validateAge.apply(age, birthDate);


        Person<String, Integer, LocalDate, String> personMessage = (namePerson,agePerson,birthPerson) -> {
            if (isCorrect) {
                return "The birth of date "  + namePerson +" "+ birthPerson  + " It's corresponding " + " whit him/her age is " + agePerson;
            } else {
                return "The birth of date "  + namePerson +" "+ birthPerson  + " It's not corresponding " + " whit him/her is " + agePerson;
            }
        };

        return personMessage.apply(name, age, birthDate);
    }

    @FunctionalInterface
    interface Person<T,U,V,R>{
        R apply(T t, U u, V v);
    }

}
