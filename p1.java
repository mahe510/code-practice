import java.util.*;
class p2d{
	double length,breadth;
	p2d(double length, double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	double calcost(){
		double area=length*breadth;
		return area*40;
	}
}
class p3d extends p2d{
	double height;
	p3d(double length, double breadth, double height){
		super(length,breadth);
		this.height=height;
	}
	double calcost(){
		double volume=length*breadth*height;
		return volume*60;
	}
}
class p1_5709{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for 2d and 2 for 3d");
		int n = sc.nextInt();
		if(n==1)
		{
			System.out.println("enter length and breadth");
			double length=sc.nextDouble();
			double breadth=sc.nextDouble();
			p2d x = new p2d(length,breadth);
			double c = x.calcost();
			System.out.println("total cost ="+c);
		}
		else if(n==2)
		{
			System.out.println("enter length, breadth and height");
			double length=sc.nextDouble();
			double breadth=sc.nextDouble();
			double height=sc.nextDouble();
			p3d y = new p3d(length,breadth,height);
			double c = y.calcost();
			System.out.println("total cost ="+c);
		}
		else{
			System.out.println("invalid choice");
		}
	}
}

			