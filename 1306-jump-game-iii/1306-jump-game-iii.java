class Solution {
   public boolean canReach(int[] arr, int start) {
			ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < n; i++) {

			int node = arr[i];
			int a = (i + arr[i] < n) ? i + arr[i] : -1;
			int b = (i - arr[i] >= 0) ? i - arr[i] : -1;

			if (a != -1) {
				graph.get(i).add(a);
			}

			if (b != -1) {
				graph.get(i).add(b);
			}

		}

		Queue<Integer> q = new LinkedList<>();

		q.add(start);
		boolean[] vis = new boolean[n];
		vis[start] = true;

		while (!q.isEmpty()) {
			int node = q.poll();
			if (arr[node] == 0) {
				return true;
			}

			for (int an : graph.get(node)) {
				if (!vis[an]) {
					vis[an] = true;
					q.offer(an);
				}
			}

		}

		return false;
   }
}