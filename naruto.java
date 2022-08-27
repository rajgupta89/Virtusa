import java.util.*;

class naruto{

static void diagonal(int[][] A, int n)
{
	int N = 2 * n - 1;

	ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	
	for(int i = 0; i < N; i++)
		result.add(new ArrayList<>());

	for(int i = 0; i < n; i++)
		for(int j = 0; j < n; j++)
			result.get(i + j).add(A[i][j]);
	
	for(int i = 0; i < result.size(); i++)
	{
		for(int j = 0; j < result.get(i).size(); j++)
			System.out.print(result.get(i).get(j) + " ");
	}
}

public static void main(String[] args)
{
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[][] A=new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            A[i][j]=in.nextInt();
        }
    }
	
	diagonal(A,n);
}
}

