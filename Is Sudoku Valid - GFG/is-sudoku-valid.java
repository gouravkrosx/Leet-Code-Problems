// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[] = in.readLine().trim().split("\\s+");
            int mat[][] = new int[9][9];
            for(int i = 0;i < 81;i++)
                mat[i/9][i%9] = Integer.parseInt(s1[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.isValid(mat));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int isValid(int mat[][]){
      
      boolean fl=true;
      
     //is valid row or column
      for(int i=0;i<9;i++){
          if(!isValidRow(mat,i)||!isValidColumn(mat,i)){
              fl=false;
              break;
          }
      }
      
     //is valid cell
      for(int i=0;i<9;i+=3){
          for(int j=0;j<9;j+=3){
              fl=fl&isValidCell(mat,i,j);
          }
      }  
    
        return (fl)?1:0;
    }
    
    public static boolean isValidF(int[]freq){
        
        for(int i=1;i<=9;i++){
            if(freq[i]>1)return false;
        }
        return true;
    }
    
    public static boolean isValidRow(int[][]mat,int row){
        int[]freq=new int[10];
        
        for(int c=0;c<9;c++){
            freq[mat[row][c]]++;
        }
        
        return isValidF(freq);
    }
     
    public static boolean isValidColumn(int[][]mat,int column){
        int[]freq=new int[10];
        
        for(int r=0;r<9;r++){
            freq[mat[r][column]]++;
        }
        
        return isValidF(freq);
    }
    
    public static boolean isValidCell(int[][]mat,int a,int b){
        int[]freq=new int[10];
        
        for(int r=a;r<a+3;r++){
            for(int c=b;c<b+3;c++){
                freq[mat[r][c]]++;
            }
        }
        return isValidF(freq);
    }
    
}