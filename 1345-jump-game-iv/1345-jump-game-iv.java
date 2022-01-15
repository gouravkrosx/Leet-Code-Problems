class Solution {
  
    /*
Anyone who doesn't understand it
Just try executing this test case: 7 7 7 7 7 1 2 3
with cout<<arr[i]<<" "<<next.size()<<endl; // below this line vector& next = indicesOfValue[arr[i]];
After the first iteration the size of map[arr[i]] i;e 7 will become 0
   */ 
    public int minJumps(int[] arr) {
       	ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

		int n = arr.length;

		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

		for (int i = 0; i<n; i++) {
            map.putIfAbsent(arr[i], new ArrayList<>());            
            map.get(arr[i]).add(i);            
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
                list.clear();   //avoid later lookup , and later TLE.
			}  
			steps++;
		}
        
		return steps;
    }
}