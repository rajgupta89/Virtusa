import java.util.*;

class adhi
{
static void printOrder(int[] arr, int n, int k)
{
	Arrays.sort(arr);

	for (int i = 0; i < k; i++)
		System.out.print(arr[i]+" ");

	for (int j = n - 1; j >= k; j--)
	System.out.print(arr[j]+" ");
	
}

public static void main(String[] args)
{
    Scanner in=new Scanner(System.in);
	int n = in.nextInt();
    int k=in.nextInt();
	int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]=in.nextInt();
    }
	printOrder(arr, n,k);

}
}
