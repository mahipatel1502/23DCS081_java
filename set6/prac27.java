import java.io.*;
public class prac27 {
public static void main(String[] args) throws Exception {
if (args.length == 0) {
System.out.println("No file Found!");
} else {
for (int i = 0; i < args.length; i++) {
try {
BufferedReader f = new BufferedReader(new FileReader(args[i]));
String j;
int count = 0;
while ((j = f.readLine()) != null) {
count++;
}
System.out.println("File name is : " + args[i] + " and Number of lines are : " + count);
} catch (Exception e) {
    System.out.println(e);
    } } }
    System.out.println("23DCS081 Mahi patel");
    } }
    