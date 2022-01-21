class Solution {
  public int minOperations(int[] nums) {
        //get unique elemets
        Set<Integer> set=new HashSet();
        for(int i:nums)
        {
            set.add(i);
        }
        int[] res=new int[set.size()];
        int in=0;
        for(int i:set)
        {
            res[in++]=i;
        }
        //sort the unique elements
        Arrays.sort(res);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<res.length;i++)
        {
            //find the target based on the original array
            int e=res[i]+nums.length-1;
           //binary search for target
            int index=bs(res, i+1, e);
            ans=Math.min(ans, nums.length-(index-i+1));
            
        }
        return ans;
    }
    
    public int bs(int[] nums, int start, int target)
    {
        int high=nums.length-1;
        while(start<=high)
        {
            int mid=start+(high-start)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
            {
                start=mid+1;
            } else {
                high=mid-1;
            }
        }
        return start-1; 
    }
}