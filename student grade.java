import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    void inputData(Scanner sc) {
        System.out.print("Enter Student ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("-----------------------");
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student students[] = new Student[3];

        for(int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("\nEnter details for Student " + (i+1));
            students[i].inputData(sc);
        }

        System.out.println("\nStudent Details:");
        int total = 0;

        for(int i = 0; i < students.length; i++) {
            students[i].displayData();
            total = total + students[i].marks;
        }

        double average = total / students.length;

        System.out.println("Average Marks: " + average);

        sc.close();
    }
}