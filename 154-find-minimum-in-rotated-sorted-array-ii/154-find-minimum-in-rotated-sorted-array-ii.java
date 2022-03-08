class Solution {
    public int findMin(int[] arr) {
        if(arr.length==1)return arr[0];
         
        int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
            
			if(arr[mid]<arr[e]){
                e=mid;
            }else if(arr[mid]>arr[e]){
                s=mid+1;
            }else{
                e--;
            }
		}
        return arr[s];
    }
}