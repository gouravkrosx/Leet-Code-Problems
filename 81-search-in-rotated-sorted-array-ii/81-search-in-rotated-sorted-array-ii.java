class Solution {
    public boolean search(int[] arr, int target) {
        int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == target) {
				return true;
			}
			// left part sorted
			if (arr[mid] > arr[l]) {
				// key lies in left part
				if (target < arr[mid] && target >= arr[l]) {
					r = mid;
				} else {
					l = mid + 1;
				}
			} else if(arr[mid]<arr[l]) {// right part sorted
				if (target > arr[mid] && target <= arr[r]) {
					l = mid;
				} else {
					r = mid-1;
				}
			}else{
                l++; // have no idea about the array, but we can exclude nums[l] because nums[l] == nums[mid]
            }
		}
		return false;
    }
}