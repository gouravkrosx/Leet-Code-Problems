class Solution {
    public static int rob(int[] nums) {
		if(nums.length==1)return nums[0];
        
        ArrayList<Integer>temp1 = new ArrayList<>();
        ArrayList<Integer>temp2 = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(i!=0)temp1.add(nums[i]);
            if(i!=nums.length-1)temp2.add(nums[i]);
        }
        
        return Math.max(houseRobI(temp1),houseRobI(temp2));
	}
    public static int houseRobI(ArrayList<Integer>arr){
        int prev=arr.get(0);
        int prev2=0;
        
        for(int i=1;i<arr.size();i++){
            int pick = arr.get(i);
            
            if(i>1){
                pick+=prev2;
            }
            
            int notPick = 0 + prev;
            
            int curr = Math.max(pick,notPick);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}