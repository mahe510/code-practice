import java.util.*;
class plate{
	double length,width;
	plate(double length, double width){
		this.length=length;
		this.width=width;
		System.out.println("plate constructor length "+length+" and width is="+width);
	}
}
class box extends plate{
	double height;
	box(double length,double width, double height){
		super(length,width);
		this.height=height;
		System.out.println("box constructor height is="+ height);
	}
}
class woodbox extends box{
	double thick;
	woodbox(double length, double width, double height, double thick){
		super(length,width,height);
		this.thick=thick;
		System.out.println("woodbox constructor thickness is ="+thick);
	}
}
class p2_5709{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length, width, height, thickness");
		double l=sc.nextDouble();
		double w=sc.nextDouble();
		double h=sc.nextDouble();
		double t=sc.nextDouble();
		woodbox x = new woodbox(l,w,h,t);
	}
}

		