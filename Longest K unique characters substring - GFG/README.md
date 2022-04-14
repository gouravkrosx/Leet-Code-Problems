# Longest K unique characters substring
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a string you need to print the size of the longest possible substring that has exactly K&nbsp;unique characters. If there is no possible substring then print -1.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
S = "aabacbebebe</span><span style="font-size: 18px; user-select: auto;">", K = 3
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation</strong>: "cbebebe" is the longest 
substring with K distinct characters.
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>: 
S = "aaaa", K = 2
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation</strong>: There's no substring with K
distinct characters.
</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">longestKSubstr()&nbsp;</strong>which takes the string S and an integer K as input and returns the length of the longest substring with exactly K&nbsp;distinct characters. If there is no substring with exactly K distinct characters then return -1.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(|S|).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(1).</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ |S| ≤ 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 ≤ K ≤ 10<sup style="user-select: auto;">5</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>