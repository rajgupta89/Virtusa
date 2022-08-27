import java.util.*;

class vicky {

	static int digSum(int n)
	{
		if (n == 0)
		return 0;
		return (n % 9 == 0) ? 9 : (n % 9);
	}
	
	public static void main (String[] args)
	{
        Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(digSum(n));
	}
}

