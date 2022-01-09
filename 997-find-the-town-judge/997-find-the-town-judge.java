class Solution {
    public int findJudge(int n, int[][] trust) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=1;i<=n;i++){
            map.put(i,0);
        }
        
        for(int i=0;i<trust.length;i++){
            int a =trust[i][0];
            int b =trust[i][1];
            if(map.get(b)!=-1){
                map.put(a,-1);
                map.put(b,map.get(b)+1);
            }else{
                map.put(a,-1);
            }
        }
    
        for(int key:map.keySet()){
            if(map.get(key)==n-1){
                return key;
            }        
        }
        return -1;
    }
}