import java.util.*;
class Student {
    int roll;
    String name;
    double cgpa;
}
class p3_5709{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter details for student ");
            System.out.print("Enter Roll No: ");
            students[i].roll = sc.nextInt();
            System.out.print("Enter Name: ");
            students[i].name = sc.next();
            System.out.print("Enter CGPA: ");
            students[i].cgpa = sc.nextDouble();
        }
        System.out.println("\nDetails of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Roll No: "+students[i].roll +
                               ", Name: "+students[i].name +
                               ", CGPA: "+students[i].cgpa);
        }
        double minCgpa = students[0].cgpa;
        String minName = students[0].name;

        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < minCgpa) {
                minCgpa = students[i].cgpa;
                minName = students[i].name;
            }
        }

        System.out.println("\nStudent with the lowest CGPA:");
        System.out.println("Name: "+minName+", CGPA: "+minCgpa);
		}
}
