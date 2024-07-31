package GExerciseSeven;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ExerciseSeven {

    public static void main(String[] args) {
        List<LocalDate> listDates = getList(LocalDate.of(2024,7,28),LocalDate.of(2024,7,29),LocalDate.of(2024,7,30));

        Consumer<LocalDate> resultTwo = getDateMessage();
        listDates.forEach(resultTwo);
        System.out.println("----------------");
        listDates.forEach(ExerciseSeven::printDateMessage);
    }
    public static <T> List<T> getList(T... dates){
        return Arrays.asList(dates);
    }

    public static Consumer<LocalDate> getDateMessage(){
        UnaryOperator<String> text = x  -> x;
        String result = text.apply("The date is: ");
        return date -> System.out.println(result + date);
    }

    public static void printDateMessage(LocalDate date) {
        System.out.println("The date is: " + date);
    }

}
