import java.util.Scanner;

class Student {
    String name;
    double gpa;
    String department;

    public Student(String name, double gpa, String department) {
        this.name = name;
        this.gpa = gpa;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getDepartment() {
        return department;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter the GPA of " + name + ": ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline character
            System.out.print("Enter the department of " + name + ": ");
            String department = scanner.nextLine();

            students[i] = new Student(name, gpa, department);
        }

        double highestGpa = Double.MIN_VALUE;
        double lowestGpa = Double.MAX_VALUE;
        double totalGpa = 0.0;
        int studentCount = students.length;
        String highestGpaStudent = "";
        String lowestGpaStudent = "";

        for (Student student : students) {
            if (student.getGpa() > highestGpa) {
                highestGpa = student.getGpa();
                highestGpaStudent = student.getName();
            }

            if (student.getGpa() < lowestGpa) {
                lowestGpa = student.getGpa();
                lowestGpaStudent = student.getName();
            }

            totalGpa += student.getGpa();
        }

        double averageGpa = totalGpa / studentCount;

        System.out.println("Student with the highest GPA: " + highestGpaStudent);
        System.out.println("Highest GPA: " + highestGpa);
        System.out.println("Department: " + students[0].getDepartment());

        System.out.println("Student with the lowest GPA: " + lowestGpaStudent);
        System.out.println("Lowest GPA: " + lowestGpa);
        System.out.println("Department: " + students[0].getDepartment());

        System.out.println("Total GPA: " + totalGpa);
        System.out.println("Average GPA: " + averageGpa);
    }
}