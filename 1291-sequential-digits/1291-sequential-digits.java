class Solution {
    
    //Joke Solution
    
     public List<Integer> sequentialDigits(int low, int high) {
        int[] allNums = {12,23,34,45,56,67,78,89,
                         123,234,345,456,567,678,789,
                         1234,2345,3456,4567,5678,6789,
                         12345,23456,34567,45678,56789,
                         123456,234567,345678,456789,
                         1234567,2345678,3456789,
                         12345678,23456789,
                         123456789};
        List<Integer> res = new ArrayList<>();
        int n = allNums.length;
        for (int i = 0; i < n; i++) {
            if (allNums[i] < low) continue;
            if (allNums[i] > high) break;
            res.add(allNums[i]);
        }
        return res;
    }
    
    
//     public List<Integer> sequentialDigits(int low, int high) {
    
//         //find the no of digits and the most significant digit value
        
//         int temp = low;
//         int dig=0;
//         int msb=0;
        
//         while(temp!=0){
//             msb=temp%10;
//             temp=temp/10;
//             dig++;
//         }
        
//         if(msb+dig-1>=10){
//             msb=1;
//             dig++;
//         }
        
//         int number = msb;
//         int seq = msb + 1;
//         for(int i=1;i<dig;i++){
//             number=number*10+seq;
//             seq++;
//         }
        
//         if(number>high){
//             return new ArrayList<>();
//         }
        
//         if (number < low) {
// 			msb++;
// 		}
        
//         ArrayList<Integer>ans = new ArrayList<>();
//         while(number<=high){
            
//             if(msb+dig-1>=10){
//                  msb=1;
//                  dig++;
//              }
            
//             number=msb;
//             seq = msb+1;
//             for(int i=1;i<dig;i++){
//                 number=number*10+seq;
//                 seq++;
//             }
            
//             msb++;
            
//             if(low<=number && number<=high){
//                 ans.add(number);
//             }else{
//                 break;
//             }
            
//         }

//         return ans;
//     }
}