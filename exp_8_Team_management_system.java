import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class TeamManagement {
public static void main(String[] args) {
Set<String> teamMembers = new HashSet<>();
teamMembers.add("Alice");
teamMembers.add("Bob");
teamMembers.add("Charlie");
teamMembers.add("Bob"); // Duplicate will not be added
System.out.println("Team Members (Unique):");
for (String member : teamMembers) {
System.out.println("- " + member);
}
Map<String, String> roles = new HashMap<>();
roles.put("Alice", "Developer");
roles.put("Bob", "Tester");
roles.put("Charlie", "Project Manager");
System.out.println("\nAssigned Roles:");
Programming Lab-3 (Java Programming) (T.Y B.Tech)
for (Map.Entry<String, String> entry : roles.entrySet()) {
System.out.println(entry.getKey() + " - " + entry.getValue());
}
}
}
