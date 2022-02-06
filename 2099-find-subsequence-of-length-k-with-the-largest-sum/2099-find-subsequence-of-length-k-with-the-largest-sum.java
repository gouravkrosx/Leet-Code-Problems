class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
    
int n = nums.length;
		pair[] arr = new pair[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new pair(nums[i], i);
		}

		Arrays.sort(arr, (a, b) -> a.val - b.val);

		if (k == 1) {
			return new int[] { arr[0].val };
		}

		pair[] temp = new pair[k];

		int j = 0;
		for (int i = n - 1; i >= n - k; i--) {
			temp[j] = new pair(arr[i].val, arr[i].idx);
			j++;
		}

		Arrays.sort(temp, (a, b) -> a.idx - b.idx);

		int[] res = new int[k];
		for (int i = 0; i < k; i++) {
			res[i] = temp[i].val;
		}

		return res;
    }
    
    class pair{
        int val;
        int idx;
        pair(int v,int i){
            val=v;
            idx=i;
        }
    }
    
}