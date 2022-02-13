// { Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			System.out.println(new GfG().max_sum(arr,n));
			
		t--;
		}
	}
	
}
// } Driver Code Ends


class GfG
{
    int max_sum(int arr[], int n)
    {
	   int allSum = 0;
	   int arrSum = 0;
	   
	   for(int i=0;i<n;i++){
	       arrSum+=arr[i];
	       allSum+=arr[i]*i;
	   }
	   int max=allSum;
	   int currSum=allSum;
	   for(int i=0;i<n;i++){
	       currSum = currSum - arrSum + arr[i]*n;
	       max = Math.max(max,currSum);
	   }
	   
	   return max;
    }	
}
