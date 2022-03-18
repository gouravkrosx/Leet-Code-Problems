class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<>(){
           @Override
            public int compare(int[]a,int[]b){
                if(a[0]==b[0]){
                    return a[1]-b[1];
                }else{
                    return b[0]-a[0];
                }
            } 
        });
        
        
        LinkedList<int[]>list = new LinkedList<>();
        
        for(int[]a:people){
            list.add(a[1],a);
        }
        int i = 0;
        int[][]res = new int[people.length][2];
        
        for(int[]v:list){
            res[i++] = v;
        }
        
        return res;
    }
}