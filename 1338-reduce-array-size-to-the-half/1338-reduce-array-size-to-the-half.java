class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        PriorityQueue<Integer>hp = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        hp.addAll(map.keySet());
        
        int count=0;
        int size=arr.length/2;
        
        Set<Integer>set = new HashSet<>();
        while(count<size){
            int key = hp.poll();
            set.add(key);
            count+=map.get(key);
            map.remove(key);
        }
        return set.size();
    }
}