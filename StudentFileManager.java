import java.io.*;
import java.util.Scanner;

public class StudentFileManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String file_n = "student_records.txt";

        do {
            System.out.println("1. ADD  2. DISPLAY  3. SEARCH  4. EXIT");
            System.out.print("ENTER CHOICE: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    try (FileWriter fw = new FileWriter(file_n, true);
                            BufferedWriter bw = new BufferedWriter(fw)) {

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Roll Number: ");
                        String rollNo = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        String marks = sc.nextLine();

                        String record = name + ", " + rollNo + ", " + marks;
                        bw.write(record);
                        bw.newLine();
                        System.out.println("added");

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 2: // Display Records
                    try (BufferedReader br = new BufferedReader(new FileReader(file_n))) {
                        String line;
                        System.out.println("\n------");
                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    String searchRollNo = sc.nextLine();
                    boolean found = false;

                    try (BufferedReader br = new BufferedReader(new FileReader(file_n))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            String[] parts = line.split(",\\s*");
                            if (parts.length == 3 && parts[1].equals(searchRollNo)) {
                                System.out.println("Record Found: " + line);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Roll No not found.");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
