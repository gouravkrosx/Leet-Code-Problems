class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
    
        char[]c1 = str1.toCharArray();
        char[]c2 = str2.toCharArray();
        int m = c1.length;
        int n = c2.length;
        
        int[][]dp = new int[m+1][n+1];
        
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }else if(c1[i-1]==c2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
       
        // after computing LCS use same logic of printing LCS.(using lcs table)
        int i=m;
        int j=n;
        
        StringBuilder sb = new StringBuilder();
        
        while(i>0 && j>0){
            if(c1[i-1]==c2[j-1]){
                sb.append(c1[i-1]);
                i--;
                j--;
            }else if(dp[i-1][j]>=dp[i][j-1]){
                sb.append(c1[i-1]);
                i--;
            }else if(dp[i-1][j]<dp[i][j-1]){
                sb.append(c2[j-1]);
                j--;
            }
        }
        
        while(i>0){sb.append(c1[i-1]);i--;};
        while(j>0){sb.append(c2[j-1]);j--;};
        
        return sb.reverse().toString();
    }
}