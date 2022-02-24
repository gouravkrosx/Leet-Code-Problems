class Solution {
    public int numDecodings(String s) {
        int[]dp = new int[s.length()+1];
        Arrays.fill(dp,-1);
        return decodeWays(s,dp);
    }
    public int decodeWays(String str,int[]dp){
        if(str.length()==0)return 1;
        
        if(str.charAt(0)=='0'){
            return 0;
        }
        
        if(dp[str.length()]!=-1)return dp[str.length()];
        
        int sg = decodeWays(str.substring(1),dp);
        
        int db = 0;
        
        if(str.length()>=2){
            int n = Integer.parseInt(str.substring(0,2));
            if(n<=26){
                 db = decodeWays(str.substring(2),dp);
            }
            
        }
        return dp[str.length()] = sg+db;
    }
}