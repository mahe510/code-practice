import java.util.*;
class p5{
		double area(double r){
			return 3.14*r*r;
	} 
		double area(double b, double h){
			return 0.5*h*b;
	}
		int area(int s){
			return s*s;
	}
}
class p5_5709{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	p5 x = new p5();
	System.out.println("Menu\n1. Area of Circle.\n2. Area of Triangle\n3. Area of Square\nEnter your choice :");
	int c = sc.nextInt();
	switch(c){
			case 1:
			System.out.print("Enter radius of circle :");
			double radius=sc.nextDouble();
			System.out.print("Area of Circle :"+ x.area(radius));
			break;
			case 2:
			System.out.print("Enter base of Traingle :");
			double base=sc.nextDouble();
			System.out.print("Enter height of Triangle :");
			double height=sc.nextDouble();
			System.out.print("Area of Traingle :"+ x.area(base,height));
			break;
			case 3:
			System.out.print("Enter side of Square :");
			int side=sc.nextInt();
			System.out.print("Area of Square :"+ x.area(side));
			break;
			default:
                System.out.println("Invalid choice");
		}
	}
}

