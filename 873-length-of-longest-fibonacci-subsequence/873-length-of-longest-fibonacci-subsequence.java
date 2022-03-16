class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        
        int max = 0;
        
        for(int val:arr){
            map.put(val,0);
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int a = arr[i];
                int b = arr[j];
                int c = a+b;
                map.put(a,1);
                map.put(b,2);
                
                while(map.containsKey(c)){
                    map.put(c,map.get(b)+1);
                    max = Math.max(max,map.get(c));
                    a = b;
                    b = c;
                    c = a+b;
                }
            }
        }
        return max;
    }
}