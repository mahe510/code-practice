import java.util.*;
class p6_5709
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,left=0,right=0;
		System.out.print("Enter the number of rows and columns of the matrix:");
		n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
					left=left+a[i][j];
				if((i+j)==(n-1))
					right=right+a[i][j];
			}
		}
		System.out.println("Sum of left diagonal:"+left);
		System.out.println("Sum of right diagonal:"+right);
	}
}