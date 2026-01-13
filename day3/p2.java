import java.util.*;
class rectangle
{
	double length;
	double breadth;
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length");
		length= sc.nextDouble();
		System.out.println("enter breadth");
		breadth= sc.nextDouble();
	}
	void calculate()
	{
		double area=length*breadth;
		double perimeter=2*(length+breadth);
		display(area,perimeter);
	}
	void display(double x, double y)
	{
		System.out.println("area is: "+x);
		System.out.println("perimeter is: "+y);
	}
}
class p2_5709{
	public static void main(String arg[])
	{
		rectangle z = new rectangle();
		z.read();
		z.calculate();
	}
}
	
	
		