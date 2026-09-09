import java.util.List;

public class StreamExample {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(evenNumbers);

        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println(doubled);
    }
}
