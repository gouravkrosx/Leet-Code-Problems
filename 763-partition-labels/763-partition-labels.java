class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer>start = new HashMap<>();
        HashMap<Character,Integer>end = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!start.containsKey(ch)){
                start.put(ch,i+1);
            }
            end.put(ch,i+1);
        }
        
        List<int[]>list = new ArrayList<>();
        
        for(char key:start.keySet()){
            int st = start.get(key);
            int e = end.get(key);
            
            list.add(new int[]{st,e});
        }
        Collections.sort(list,(a,b)->(a[0]-b[0]));
        
        int[] prev = list.get(0);
        int i=0;
        int j=1;
        
        while(j<list.size()){
            if(prev[1]>=list.get(j)[0]){
                list.get(i)[1] = Math.max(list.get(j)[1],prev[1]);
            }else{
                i++;
                list.get(i)[0]=list.get(j)[0];
                list.get(i)[1]=list.get(j)[1];
                prev = list.get(i);
            }
            j++;
        }     
        
        List<Integer>ans = new ArrayList<>();
        
        for(int idx=0;idx<=i;idx++){
            int val = list.get(idx)[1]-list.get(idx)[0]+1;
            ans.add(val);
        }
        
        return ans;
    }
}