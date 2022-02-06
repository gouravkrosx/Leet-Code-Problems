class Solution {
    public int[] maxSubsequence(int[] A, int k) {
         List<int[]> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            list.add(new int[]{A[i], i});
        }
        list.sort((a, b) -> b[0] - a[0]); // sort desc by value
        List<int[]> subList = list.subList(0, k);
        subList.sort((a, b) -> a[1] - b[1]); // sort asc by index
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = subList.get(i)[0];
        }
        return res;
    }   
}