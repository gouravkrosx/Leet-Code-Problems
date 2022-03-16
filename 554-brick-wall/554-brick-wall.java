class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int sum = 0;
        
        for(int i:wall.get(0)){
            sum+=i;
        }
        
        HashMap<Integer,Integer>map = new HashMap<>();  
        
        
        for(int i=0;i<wall.size();i++){
            int tempSum=0;
            
            for(int j=0;j<wall.get(i).size();j++){
                tempSum+=wall.get(i).get(j);
                map.put(tempSum,map.getOrDefault(tempSum,0)+1);
            }
        }
        
        int max = 0;
        for(int key:map.keySet()){
            if(key!=sum){
                max = Math.max(max,map.get(key));
            }
        }
        
        return wall.size()-max;
    }
}