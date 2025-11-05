import java.util.Arrays;
import java.util.List;
public class CountNamesStartingWithA {
public static void main(String[] args) {
List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Apricot", "Berry",
"Cherry");
long count = strings.stream()
.filter(s -> s.startsWith("A"))
.count();
System.out.println("Number of strings starting with 'A': " + count);
}
}