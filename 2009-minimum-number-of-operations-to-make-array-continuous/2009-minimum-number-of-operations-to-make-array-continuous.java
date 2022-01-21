class Solution {
  
public int minOperations(int[] nums) {
    if(nums.length==1)return 0;
      
      int size=nums.length;
      
      //to remove duplicates in the array
      Set<Integer>st = new HashSet<>();
      
      for(int n:nums)st.add(n);
      
      int[]res=new int[st.size()];
	
      int in=0;	
      for(int i:st)res[in++]=i;	
        
      Arrays.sort(res);  
    
      int ans=size;
      
      for(int i=0;i<res.length;i++){
          int end= res[i]+(nums.length-1); //this should be my last element int the range to make the array continuous.
          int idx = BinarySearch(res,i+1,end);
          
          int continousRange=idx-i+1;
          
          ans=Math.min(ans,size-continousRange);
      }
      
      return ans;
  }
    
    public int BinarySearch(int[]arr,int start,int diff){
        int end=arr.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            
            if(arr[mid]==diff)return mid;
            
            if(arr[mid]<diff){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start-1;
    }
}