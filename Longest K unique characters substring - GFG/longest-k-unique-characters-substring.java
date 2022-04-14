// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
     public int longestkSubstr(String s, int k) {
        HashMap < Character, Integer > map = new HashMap < > ();
        int n = s.length();

        int j = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char start = s.charAt(j);
                map.put(start, map.get(start) - 1);
                if (map.get(start) == 0) {
                    map.remove(start);
                }
                j++;
            }

            if (map.size() == k) {
                maxLength = Math.max(maxLength, i - j + 1);
            }
        }

        return maxLength == 0 ? -1 : maxLength;
    }
}