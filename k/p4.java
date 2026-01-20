import java.util.*;
class p4_5709
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		int n = sc.nextInt();
		int s=0,r;
		int x=n;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		if(x==s)
		{
            System.out.println("The number is a palindrome.");
        } 
		else 
		{
            System.out.println("The number is not a palindrome.");
        }
	}
}	