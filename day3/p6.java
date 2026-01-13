import java.util.*;
class P6 {
    double length;
    double breadth;
    P6() {
        this.length = 0;
        this.breadth = 0;
    }
    P6(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double area() {
        return length * breadth;
    }
    void show() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area());
    }
}
class P6_5709 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        P6 cal = new P6();
        System.out.println("\nDefault value:");
        cal.show();
        System.out.print("Enter the length: ");
        cal.length = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        cal.breadth = sc.nextDouble();
        System.out.println("\nValues after user input:");
        cal.show();
       }
}
