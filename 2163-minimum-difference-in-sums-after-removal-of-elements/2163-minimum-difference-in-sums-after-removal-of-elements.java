class Solution {
    public long minimumDifference(int[] nums) {
        int n = nums.length;
        int len3=n/3;
        
        long res = Long.MAX_VALUE; 
        
        long[]left = new long[n];
        
        long[]right = new long[n];
        
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        
        long sum=0;
        
        for(int i=0;i<len3;i++){
            sum+=nums[i];
            max.add(nums[i]);
        }
        
        for(int i=len3;i<=2*len3;i++){
            left[i]=sum;
            sum+=nums[i];
            max.add(nums[i]);
            sum-=max.poll();
        }
        
        PriorityQueue<Integer>min = new PriorityQueue<>();
        
        sum=0;
        
        for(int i=0;i<len3;i++){
            sum+=nums[n-i-1];
            min.add(nums[n-i-1]);
        }
        
        for(int i=len3;i<=2*len3;i++){
            right[n-i]=sum;
            sum+=nums[n-i-1];
            min.add(nums[n-i-1]);
            sum-=min.poll();
        }
        
        for(int i=len3;i<=2*len3;i++){
            res = Math.min(res,left[i]-right[i]);
        }    
            
        return res;
    }
}