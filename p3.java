import java.util.*;
class apple{
	void show(){
		System.out.println("apple");
	}
}
class banana extends apple{
	void show(){
		System.out.println("banana");
	}
}
class cherry extends apple{
	void show(){
		System.out.println("cherry");
	}
}
class p3_5709{
	public static void main(String arg[]){
		apple a = new apple();
		banana b = new banana();
		cherry c = new cherry();
		//dynamic method dispatch
		apple x;
		x=a;
		x.show();
		x=b;
		x.show();
		x=c;
		x.show();
	}
}