class Solution {
    public int scheduleCourse(int[][] courses) {
       Arrays.sort(courses,(a,b)->(a[1]-b[1]));
        
        PriorityQueue<Integer>hp = new PriorityQueue<>(Collections.reverseOrder());
        
        int totalTime=0;
        
        for(int i=0;i<courses.length;i++){
            int dur = courses[i][0];
            int lastDay = courses[i][1];
            totalTime+=dur;
            
            hp.add(dur);
            
            if(totalTime>lastDay){
                totalTime-=hp.poll();
            }
        }
        return hp.size();
    }
}