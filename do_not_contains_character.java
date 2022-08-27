import java.util.Scanner;

class do_not_contains_character
{

	static int CountSubstring(char str[], int n)
	{

		int ans = (n * (n + 1)) / 2;

		int a_index = 0;
		int b_index = 0;
		int c_index = 0;

		for (int i = 0; i < n; i++)
		{
			if (str[i] == 'a')
			{
				a_index = i + 1;
				ans -= Math.min(b_index, c_index);
			}
			else if (str[i] == 'b')
			{
				b_index = i + 1;
				ans -= Math.min(a_index, c_index);
			}
			else
			{
				c_index = i + 1;
				ans -= Math.min(a_index, b_index);
			}
		}

		return ans;
	}

	public static void main(String[] args)
	{
        Scanner in=new Scanner(System.in);
        String s=in.next();
		char str[] = s.toCharArray();
		int n = str.length;

		System.out.println(CountSubstring(str, n));
	}
}

