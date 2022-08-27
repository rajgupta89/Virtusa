import java.util.*;
class jackie {
    static int findElement(int arr[], int n){
        int[] mini = new int[n];
        int[] maxi = new int[n];
        for(int i = 0; i < n; i++){
            mini[i] = 10000000;
            maxi[i] = 0;
        }
        maxi[0] = arr[0];
        for(int i = 1; i < n; i++){
            maxi[i] = Math.max(maxi[i-1], arr[i]);
        }
        mini[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            mini[i] = Math.min(mini[i+1], arr[i]);
        }
        for(int i = 1; i < n-1; i++){
            if(arr[i] >= maxi[i-1] && arr[i] <= mini[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
public static void main(String args[])
	{
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
			int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=in.nextInt();
            }
			System.out.println(findElement(arr, n));
	}

}