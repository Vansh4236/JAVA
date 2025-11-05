import java.util.Arrays;
import java.util.List;
public class NameUpperCase {
public static void main(String[] args) {
List<String> names = Arrays.asList("ravi", "meena", "akash", "nisha");
System.out.println("Names in Uppercase:");
names.stream()
.map(String::toUpperCase)
.forEach(System.out::println);
}
}