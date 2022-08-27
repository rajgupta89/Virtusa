import java.util.*;

class suresh_rajesh {
    void findcoins(int [] coin, int i,int j)
if(i==j){
	return coin[i];
}
if(i+1==j){
return Integer.max(coin[i],coin[j]);
}
int start=coin[i]+Integer.min(findcoins(coin,i+2,j),
findcoins(coin,i+1,j-1)
)

int end=coin[j]+Integer.min(findcoins(coin,i+1,j-1),
findcoins(coin,i,j-2)
return Integer.max(start,end);
)


}
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int inp=scan.nextInt();
		int arr[]=new int[inp];
		for(int i=0;i<inp;i++){
		    arr[i]=scan.nextInt();
		}
		
		findcoins(arr,0,inp);
	}
}