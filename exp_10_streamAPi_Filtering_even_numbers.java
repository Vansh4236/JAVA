import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class EvenNumberFilter {
public static void main(String[] args) {
List<Integer> numbers = Arrays.asList(5, 12, 7, 8, 15, 24, 33, 16);
List<Integer> evenNumbers = numbers.stream()
.filter(n -> n % 2 == 0)
.collect(Collectors.toList());
System.out.println("Even Numbers: " + evenNumbers);
}
}