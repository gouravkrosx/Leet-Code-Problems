class Solution {
    
    //Joke Solution
    
     public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        
        for(int startDigit = 1; startDigit<=9; startDigit++) {
            int increment = startDigit;
            int val = startDigit;
            
            while(increment <= 9) {
                if(val <= high && val >= low) {
                    res.add(val);
                }
                increment++;
                val = val * 10 + increment; 
            }
        }
        
        Collections.sort(res);
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