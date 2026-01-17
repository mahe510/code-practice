class p1_5709
{
	public static void main(String arg[])
	{
		int x = Integer.parseInt(arg[0]);
		int y = Integer.parseInt(arg[1]);
		int z = Integer.parseInt(arg[2]);
		int l = (x>y)?((x>z)?x:z):((y>z)?y:z);
		System.out.println("largest element is "+l);
	}
}
	

		