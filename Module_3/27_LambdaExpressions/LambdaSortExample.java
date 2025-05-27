import java.util.*;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Mango", "Cherry");

        Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));

        System.out.println("Sorted List:");
        list.forEach(System.out::println);
    }
}
