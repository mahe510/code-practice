import java.util.*;
class p3_5709
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int x = a[j];
					a[j] = a[j+1];
					a[j+1] =x;
				}
			}
		}
		System.out.print("ascending order :");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}
			