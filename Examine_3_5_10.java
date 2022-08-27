import java.util.Arrays;
import java.util.Scanner;

class Examine_3_5_10
{
	static int count(int n)
	{
		int table[] = new int[n + 1], i;
	
		Arrays.fill(table, 0);
	
		table[0] = 1;
	
		for (i = 3; i <= n; i++)
			table[i] += table[i - 3];
		for (i = 5; i <= n; i++)
			table[i] += table[i - 5];
		for (i = 10; i <= n; i++)
			table[i] += table[i - 10];
	
		return table[n];
	}
	
	public static void main (String[] args)
	{
        Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(count(n));
	
	}
}

