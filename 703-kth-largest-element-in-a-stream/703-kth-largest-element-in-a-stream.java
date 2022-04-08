class KthLargest {
    PriorityQueue<Integer>hp;
    int size = 0;
    public KthLargest(int k, int[] nums) {
        hp = new PriorityQueue<>();
        size=k;
        for(int i=0;i<nums.length;i++){
            if(hp.size()<k){
                hp.add(nums[i]);
            }else{
                if(hp.peek()<=nums[i]){
                    hp.remove();
                    hp.add(nums[i]);
                }
            }
        }
    }
    
    public int add(int val) {
        if(hp.size()<size){
            hp.add(val);
        }else if(hp.peek()<=val){
            hp.remove();
            hp.add(val);
        }
        return hp.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */