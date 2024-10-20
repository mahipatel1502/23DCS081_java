import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DatabaseManager {
    // Regex for validating email addresses
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    // Method to insert expert data into a .txt file
    public void insertExpertData(String name, String tech, int exp, String job, String contact, String email) {
        try (FileWriter fileWriter = new FileWriter("experts.txt", true)) { // Changed to experts.txt
            // Write the expert data into the file, each field on a new line
            fileWriter.write(" Name: " + name + "\n");
            fileWriter.write("Technology: " + tech + "\n");
            fileWriter.write("Experience: " + exp + "\n");
            fileWriter.write("Job: " + job + "\n");
            fileWriter.write("Contact No.: " + contact + "\n");
            fileWriter.write("Email: " + email + "\n");
            fileWriter.write("-------------------------\n"); // Separator for entries
            System.out.println("Data inserted successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to search for expert data by name
    public void searchExpertData(String name) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("experts.txt"))) {
            String line;
            boolean found = false;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(" Name: ") && line.contains(name)) { // Check if the line contains the search name
                    // Print the details until we reach the separator line
                    System.out.println("Expert Found:");
                    do {
                        System.out.println(line);
                        line = bufferedReader.readLine();
                    } while (line != null && !line.equals("-------------------------"));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No expert found with the name: " + name);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    // Method to validate email format
    private boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    // Method to update expert data
    public void updateExpertData(String name, String newTech, int newExp, String newJob, String newContact, String newEmail) {
        File inputFile = new File("experts.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(tempFile)) {

            String line;
            boolean updated = false;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(" Name: ") && line.contains(name)) {
                    writer.write(" Name: " + name + "\n");
                    writer.write("Technology: " + newTech + "\n");
                    writer.write("Experience: " + newExp + "\n");
                    writer.write("Job: " + newJob + "\n");
                    writer.write("Contact No.: " + newContact + "\n");
                    writer.write("Email: " + newEmail + "\n");
                    writer.write("-------------------------\n");
                    updated = true;
                    // Skip the next lines until the separator
                    while ((line = reader.readLine()) != null && !line.equals("-------------------------"));
                } else {
                    writer.write(line + "\n");
                }
            }
            if (updated) {
                System.out.println("Expert data updated successfully.");
            } else {
                System.out.println("No expert found with the name: " + name);
            }
        } catch (IOException e) {
            System.out.println("Error during update: " + e.getMessage());
        }
        // Delete original file and rename temp file
        inputFile.delete();
        tempFile.renameTo(inputFile);
    }

    // Method to delete expert data
    public void deleteExpertData(String name) {
        File inputFile = new File("experts.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(tempFile)) {

            String line;
            boolean deleted = false;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(" Name: ") && line.contains(name)) {
                    deleted = true;
                    // Skip the next lines until the separator
                    while ((line = reader.readLine()) != null && !line.equals("-------------------------"));
                    continue; // Skip writing this expert's data
                }
                writer.write(line + "\n");
            }
            if (deleted) {
                System.out.println("Expert data deleted successfully.");
            } else {
                System.out.println("No expert found with the name: " + name);
            }
        } catch (IOException e) {
            System.out.println("Error during deletion: " + e.getMessage());
        }
        // Delete original file and rename temp file
        inputFile.delete();
        tempFile.renameTo(inputFile);
    }

    // Method to list all experts
    public void listAllExperts() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("experts.txt"))) {
            String line;
            System.out.println("Listing all experts:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Expert");
            System.out.println("2. Search Expert");
            System.out.println("3. Update Expert");
            System.out.println("4. Delete Expert");
            System.out.println("5. List All Experts");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next(); // Consume the invalid input
            }

            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Technology: ");
                    String tech = sc.nextLine();
                    System.out.print("Enter Experience: ");

                    while (!sc.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid integer for experience.");
                        sc.next(); // Consume the invalid input
                    }

                    int exp = sc.nextInt();
                    sc.nextLine(); // Consume the newline character

                    System.out.print("Enter Job: ");
                    String job = sc.nextLine();
                    System.out.print("Enter Contact No.: ");
                    String contact = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    if (!dbManager.isValidEmail(email)) {
                        System.out.println("Invalid email format. Please try again.");
                        break;
                    }

                    dbManager.insertExpertData(name, tech, exp, job, contact, email);
                    break;

                case 2:
                    System.out.print("Enter Name to Search: ");
                    String searchName = sc.nextLine();
                    dbManager.searchExpertData(searchName);
                    break;

                case 3:
                    System.out.print("Enter Name to Update: ");
                    String updateName = sc.nextLine();
                    System.out.print("Enter New Technology: ");
                    String newTech = sc.nextLine();
                    System.out.print("Enter New Experience: ");

                    while (!sc.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid integer for experience.");
                        sc.next(); // Consume the invalid input
                    }

                    int newExp = sc.nextInt();
                    sc.nextLine(); // Consume the newline character

                    System.out.print("Enter New Job: ");
                    String newJob = sc.nextLine();
                    System.out.print("Enter New Contact No.: ");
                    String newContact = sc.nextLine();
                    System.out.print("Enter New Email: ");
                    String newEmail = sc.nextLine();

                    if (!dbManager.isValidEmail(newEmail)) {
                        System.out.println("Invalid email format. Please try again.");
                        break;
                    }

                    dbManager.updateExpertData(updateName, newTech, newExp, newJob, newContact, newEmail);
                    break;

                case 4:
                    System.out.print("Enter Name to Delete: ");
                    String deleteName = sc.nextLine();
                    dbManager.deleteExpertData(deleteName);
                    break;

                case 5:
                    dbManager.listAllExperts();
                    break;

                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close(); // Close the scanner when done
    }
}