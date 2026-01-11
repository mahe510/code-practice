import java.util.*;
class p5_5709
{
    public static void main(String arg[])
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
		{
            a[i] = sc.nextInt();
        }
        int v[] = new int[n];
        for (int i = 0; i < n; i++)
		{
            if (v[i] == 0)
			{
                int c = 1;
                for (int j = i + 1; j < n; j++)
				{
                    if (a[j] == a[i] && v[j] == 0)
					{
                        c++;
                        v[j] = 1;
                    }
                }
                System.out.println("Occurrences of " + a[i] + " is " + c);
                v[i] = 1;
            }
        }
    }
}
