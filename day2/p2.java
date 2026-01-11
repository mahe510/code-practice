class p2_5709
{
	public static void main(String arg[])
	{
		int a,i,e=0,o=0;
		for(i=0;i<10;i++)
		{
			a = Integer.parseInt(arg[i]);
			if(a%2==0)
				e++;
			else
				o++;
		}
		System.out.println("No. of even numbers "+e);
		System.out.println("No. of odd numbers "+o);
	}
}
		
		
		
		