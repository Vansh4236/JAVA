import java.io.*;
import java.util.regex.*;
public class ResumeFormatter {
public static void main(String[] args) throws IOException {
File inputFolder = new File("./input_resumes/");
File[] files = inputFolder.listFiles();
if (files == null || files.length == 0) {
System.out.println("No files found in input_resumes directory.");
return;
}
File outputFolder = new File("./cleaned_resumes/");
if (!outputFolder.exists()) {
outputFolder.mkdir();
}
for (File file : files) {
if (file.isFile() && file.getName().endsWith(".txt")) {
processResume(file, outputFolder);
}
}
}
public static void processResume(File inputFile, File outputFolder) throws IOException {
BufferedReader reader = new BufferedReader(new FileReader(inputFile));
String line;
String name = "Not Found";
String email = "Not Found";
StringBuilder skills = new StringBuilder();
// 􈆆􎀱 Correct regex for email
Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,6}");
while ((line = reader.readLine()) != null) {
line = line.trim();
if (line.toLowerCase().contains("name:")) {
name = line.split(":", 2)[1].trim();
} else if (emailPattern.matcher(line).find()) {
Matcher matcher = emailPattern.matcher(line);
if (matcher.find()) {
email = matcher.group();
}
} else if (line.toLowerCase().contains("skills:")) {
skills.append(line.split(":", 2)[1].trim()).append(", ");
}
}
reader.close();
File outputFile = new File(outputFolder, "Formatted_" + inputFile.getName());
FileWriter writer = new FileWriter(outputFile);
writer.write("Formatted Resume\n");
writer.write("====================\n");
writer.write("Name : " + name + "\n");
writer.write("Email : " + email + "\n");
writer.write("Skills: " + (skills.length() > 0 ? skills.toString() : "Not Mentioned") + "\n");
writer.close();
System.out.println("Processed: " + inputFile.getName());
}
}