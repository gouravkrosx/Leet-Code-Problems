class Solution {
   
    //Not taking PriorityQueue because it will take o(k) time in removal of element other than peek
    //But TreeSet take O(logK) in the worst case also.
    // Storing indexes not values just to maintain order of the duplicates too.
    
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[]res = new double[nums.length-k+1];
        
        //lo -> max TreeSet
        TreeSet<Integer>lo = new TreeSet<>((a,b)->nums[a]!=nums[b]?Integer.compare(nums[a],nums[b]):a-b);
        
       //hi-> min TreeSet     
        TreeSet<Integer>hi = new TreeSet<>((a,b)->nums[a]!=nums[b]?Integer.compare(nums[a],nums[b]):a-b);
        
        int right=0,left=0;
        
        while(left<nums.length){
            lo.add(left);
            hi.add(lo.pollLast());
            if(hi.size()>lo.size())lo.add(hi.pollFirst());
            
            if(lo.size()+hi.size()==k){
                res[right]=(lo.size()==hi.size())?nums[lo.last()]/2.0+nums[hi.first()]/2.0:nums[lo.last()]/1.0;
                
                if(!lo.remove(right))hi.remove(right);
                right++;
            }
            left++;
        }
        return res;
    }
}