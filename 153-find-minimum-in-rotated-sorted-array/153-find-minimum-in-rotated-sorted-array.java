class Solution {
    public int findMin(int[] arr) {
        
        if(arr.length==1)return arr[0];
        
        if(arr.length==2)return Math.min(arr[0],arr[1]);
        
        int s = 0;
		int e = arr.length - 1;
		while (s < e) {
			int mid = (s + e) / 2;
            
			if (mid > s && arr[mid] < arr[mid - 1]) {
				return arr[mid];
			}

			if (mid < e && arr[mid] > arr[mid + 1]) {
				return arr[mid+1];
			}

			// because the (highest element)pivot element would be present in unsorted area
			if (arr[mid] > arr[s] && arr[mid]>arr[e]) {
				s = mid + 1;
			} else {
				e = mid-1;
			}
		}
        return arr[s];
    }
}