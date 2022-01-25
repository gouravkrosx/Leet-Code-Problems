class Solution {
    public int maxResult(int[] nums, int k) {
      
		int n = nums.length;
        
        // we are maintaining maximum score upto ith index
        Deque<pair> q = new ArrayDeque();
        q.offerLast(new pair(nums[0],0));
        
        int i = 1;
	
        int max = nums[0];
        
		while (i < n) {

            while (!q.isEmpty() && q.peekFirst().idx < i - k) {
				q.pollFirst();
			}
            
            // this is the max upto ith index
			max = nums[i] + ((q.isEmpty()) ? 0 : q.peek().val);

			while (!q.isEmpty() && q.peekLast().val <= max) {
				q.pollLast();
			}

			q.offerLast(new pair(max, i));

			i++;
		}

		return max;
    }
    class pair{
        int val;
        int idx;
        pair(int v,int id){
            this.val=v;
            this.idx=id;
        }
    }
}