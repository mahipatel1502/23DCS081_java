import java.util.*;
public class prac40 {
public static void main(String[] args) {
Map<String, Integer> wordMap = new TreeMap<>();
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a text:");
String text = scanner.nextLine();
String[] words = text.toLowerCase().split("\\W+");
for (String word : words) {
if (!word.isEmpty()) {
wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
} }
System.out.println("\nWord Occurrences (in alphabetical order):");
Set<Map.Entry<String, Integer>> entrySet = wordMap.entrySet();
for (Map.Entry<String, Integer> entry : entrySet) {
System.out.println(entry.getKey() + ": " + entry.getValue());
} } }
