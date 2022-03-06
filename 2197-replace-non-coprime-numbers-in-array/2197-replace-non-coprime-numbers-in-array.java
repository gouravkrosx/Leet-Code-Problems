class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        
        
        List<Integer>arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        
        if(arr.size()==1)return arr;
        
        int i=1;
        List<Integer>temp = new ArrayList<>();
        temp.add(arr.get(0));
        
        while(i<arr.size()){
            long a = arr.get(i);
                while(temp.size()!=0){
                    long b = temp.get(temp.size()-1);
                    if(gcd(a,b)!=1){
                        temp.remove(temp.size()-1);
                        a = lcm(a,b);
                    }else{
                        break;
                    }  
                }
               temp.add((int)a);
            i++;
        }
        return temp;
        
    }
    public static long gcd(long a, long b) {
		if (b == 0)
			return a;

		return gcd(b, a % b);
	}

	public static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}
}