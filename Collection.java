import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {
        Set<String> students = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        String name;

        do {
            System.out.println("\n1.ADD  2.DELETE  3.DISPLAY  4.SEARCH  5.EXIT");
            System.out.print("ENTER CHOICE: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    name = sc.nextLine();
                    if (students.add(name)) {
                        System.out.println("Student added.");
                    } else {
                        System.out.println("Duplicate");
                    }
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    name = sc.nextLine();
                    if (students.remove(name)) {
                        System.out.println("Student removed");
                    } else {
                        System.out.println("not found");
                    }
                    break;

                case 3:
                    List<String> sortedList = new ArrayList<>(students);
                    Collections.sort(sortedList);
                    System.out.println("Student Sorted:");
                    for (String student : sortedList) {
                        System.out.println(student);
                    }
                    break;

                case 4:
                    System.out.print("Enter name");
                    name = sc.nextLine();
                    if (students.contains(name)) {
                        System.out.println("Student found.");
                    } else {
                        System.out.println("not found");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Enter valid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
