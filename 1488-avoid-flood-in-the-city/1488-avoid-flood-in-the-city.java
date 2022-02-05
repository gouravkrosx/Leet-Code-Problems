class Solution {
    public int[] avoidFlood(int[] rains) {
       //this map will store the rain corresponds to the prev last index of its occurence
        HashMap<Integer,Integer>map = new HashMap<>();
       
//Dont try to find the zero in treeset as floor(i) for the curr rain which has been previously visited, in this way you
// are ignoring this case -> [0,1,1] here when 1 comes for the first time you just put it in the set and second time when you first 
// when you perform thr function for it to find the prev zero that won't work as it is not a valid case. 
// Instead find the location ahead of the previous occurence of the current rain in the zero treeset as described in the below soln.
       
       
        //this stores the location of zeros in sorted order
        TreeSet<Integer>zeros = new TreeSet<>();
        int n = rains.length;
        int[]res = new int[n];
        
        for(int i=0;i<n;i++){
            if(rains[i]==0){
                zeros.add(i);
                res[i]=1;  //in case this zero could not used.
            }else{
                if(map.containsKey(rains[i])){
                    // find the location of zero that can be used to empty rains[i]
                    Integer next = zeros.ceiling(map.get(rains[i]));
                    //if next is null so you cant dry the lake means there will be flood.
                    if(next==null){
                        return new int[0];
                    }
                    zeros.remove(next); //since this 0 has been used now.
                    res[next]=rains[i];
                }
                res[i]=-1; //according to the problem
                map.put(rains[i],i);
            }
        }
        return res;
    } 
}