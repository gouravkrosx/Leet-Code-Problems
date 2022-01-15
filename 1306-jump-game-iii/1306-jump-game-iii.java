class Solution {
   public boolean canReach(int[] arr, int start) {

        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        boolean[] visited = new boolean[n];
        visited[start] = true;
        while (!q.isEmpty()) {
            int i = q.poll();
            if (arr[i] == 0) return true; // found result
            for (int j : new int[]{i - arr[i], i + arr[i]}) {
                if (j < 0 || j >= n || visited[j]) continue;
                q.add(j);
                visited[j] = true;
            }
        }
        return false;
    }
}