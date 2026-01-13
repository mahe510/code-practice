import java.util.*;
class box{
	double length;
	double width;
	double height;
	box(double l,double w, double h)
	{
		length=l;
		width=w;
		height=h;
	}
	double volume()
	{
		return length*width*height;
	}
}
class demo
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length");
		double length = sc.nextDouble();
		System.out.println("enter width");
		double width = sc.nextDouble();
		System.out.println("enter height");
		double height = sc.nextDouble();
		box x = new box(length,width,height);
		System.out.println("volume of box is: "+x.volume());
	}
}