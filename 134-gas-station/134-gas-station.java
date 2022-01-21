class Solution { 
      public int canCompleteCircuit(int[] gas, int[] cost) {
       int start=0;
       int sum=0;
       int diff=0;
          
         for(int i=0;i<gas.length;i++){
             sum+=gas[i]-cost[i];
             if(sum<0){
                 start=i+1;
                 diff+=sum;
                 sum=0;
             }
         } 
          
         return (sum+diff>=0)?start:-1;
    }  
}