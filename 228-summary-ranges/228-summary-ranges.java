class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String>list = new ArrayList<>();

        if(nums.length==0)return list;
        
        if(nums.length==1){
            list.add(nums[0]+"");
            return list;
        }
        
        int n=nums.length;
        int i=0;
        String str="";
        while(i<n-1){
            if(nums[i]+1==nums[i+1]){
                if(str.length()==0){
                    str+=nums[i];
                }
            }else{
                if(str.length()==0){
                    list.add(nums[i]+"");
                }else{
                    list.add(str+"->"+nums[i]);
                    str="";
                }
            }
            i++;
        }
        if(nums[n-1]==nums[n-2]+1){
            str=str+"->"+nums[n-1];
            list.add(str);
        }else{
            list.add(nums[n-1]+"");
        }
        return list;
    }
}