class Solution {
    public int minJumps(int[] arr) {
       	ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

		int n = arr.length;

		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (!map.containsKey(arr[i])) {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(arr[i], list);
			} else {
                ArrayList<Integer> list = map.get(arr[i]);
				list.add(i);
			}
		}

	
		Queue<Integer> q = new LinkedList<>();

		q.add(0);
		boolean[] vis = new boolean[n];
		vis[0] = true;
		int steps = 0;

		while (!q.isEmpty()) {

			int size = q.size();
			for (int i = 0; i < size; i++) {
				int idx = q.poll();
				if (idx == n - 1) {
					return steps;
				}

                ArrayList<Integer>list = map.get(arr[idx]);
                list.add(idx+1);
                list.add(idx-1);
                
				for (int an : list) {
					if ( an < n && an >=0 && !vis[an] && an != idx ) {
						vis[an] = true;
						q.offer(an);
					}
				}
                list.clear();
			}  
			steps++;
		}
        
		return steps;
    }
}