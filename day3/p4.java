import java.util.Scanner;
class p4 {
    int subtract(int a, int b) {
        return a - b;
    }
    int subtract(int a, int b, int c) {
        return a - b - c;
    }
    double subtract(double a, double b) {
        return a - b;
    }
    int subtract(int a[]) {
        int r = a[0];
        for (int i = 1; i < a.length; i++) { 
            r -= a[i];
        }
        return r;
    }
}
class p4_5709 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        p4 x = new p4();
        System.out.println("Subtracting two integers: " + x.subtract(10, 5));
        System.out.println("Subtracting three integers: " + x.subtract(20, 5, 3));
        System.out.println("Subtracting two doubles: " + x.subtract(15.5, 4.3));
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Subtracting array elements: " + x.subtract(a));
    }
}
