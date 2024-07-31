package IExerciseNine;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExerciseNine {
    public static void main(String[] args) {

        List<String> list = listNames("Messi","Cr7","Neymar","Mbbappe","Messi","Cr7");
        list.forEach(System.out::println);
        System.out.println("-----------------------------");
        listInformation(list,"Messi");


    }

    public static <T> List<T> listNames(T... elements){
        return Arrays.asList(elements);
    }

    public static List<String> getNamesElements(List<String> list, String name){
        return list.stream().filter(listName -> listName.equals(name))
                .toList();
    }

    public static void listInformation(List<String> filterList, String name){
        List<String> names = getNamesElements(filterList, name);
        Optional<List<String>> optionalList = Optional.of(names);

        if(optionalList.get().isEmpty()){
            System.out.println("Sorry, The list is empty whit the name: " + name);
        }else {
            optionalList.ifPresent(
                    list -> {
                        System.out.println("Filtered list: ");
                        list.forEach(System.out::println);
                    }
            );
        }
    }
}
