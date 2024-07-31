package DExerciseFour;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BookMain {
    public static void main(String[] args) {
        List<Books> books = usingSupplier().get();
        usingConsumer().accept(books);
    }

    /**
     * Interfaz que no recibe argumentos y devuelve un valor
     * */
    public static Supplier<List<Books>> usingSupplier() {
        Books bookOne = new Books("Learn Java", "James Gosling", 10.0);
        Books bookTwo = new Books("Learn JS", "Brendan Eich", 6.8);
        Books bookThree = new Books("Learn Python", "Guido", 9.3);
        Books bookFour = new Books("Test Book", "author test", 6.5);
        Supplier<List<Books>> supplier = () -> Arrays.asList(bookOne, bookTwo, bookThree, bookFour);
        return supplier;
    }

    /**
     * Interfaz que recibe argumentos y no devuelve un valor
     * */
    public static Consumer<List<Books>> usingConsumer() {
        return books -> {
            Predicate<Books> isScoreGreaterThan = book -> book.getScore() >= 7.0;

            books.forEach(book -> {
                if (isScoreGreaterThan.test(book)) {
                    UnaryOperator<String> result = text -> text;
                    System.out.println(result.apply("The book " + book.getBookName() + " Have a score " + book.getScore() + " It's recommended"));
                    System.out.println("-------------------------------------------------------------------------------------------");
                } else {
                    UnaryOperator<String> result = text -> text;
                    System.out.println(result.apply("The book " + book.getBookName() + " Have a score " + book.getScore() + " It's not recommended"));
                    System.out.println("-------------------------------------------------------------------------------------------");
                }
            });

        };
    }


}
