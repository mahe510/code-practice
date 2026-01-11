class demo
{
	int x;
	int y;
	static int c;
	demo()
	{
		c++;
	}
}
class p4_5709{
	public static void main(String arg[])
	{
		demo ob1 = new demo();
		demo ob2 = new demo();
		System.out.println("No. of objects created are " +demo.c);
	}
}
