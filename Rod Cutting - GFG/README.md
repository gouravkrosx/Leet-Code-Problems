# Rod Cutting
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a rod of length <strong style="user-select: auto;">N</strong> inches and an array of prices,&nbsp;<strong style="user-select: auto;">price[]</strong> that contains prices of all pieces of size smaller than <strong style="user-select: auto;">N</strong>. Determine the maximum value obtainable by cutting up the rod and selling the pieces.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 8
Price[] = {1, 5, 8, 9, 10, 17, 17, 20}
<strong style="user-select: auto;">Output:</strong>
22</span>
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Explanation:
</span></strong><span style="font-size: 18px; user-select: auto;">The maximum obtainable value is 22 by
cutting in two pieces of lengths 2 and 
6, i.e., 5+17=22.</span>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N=8
Price[] = {3, 5, 8, 9, 10, 17, 17, 20}
<strong style="user-select: auto;">Output:</strong> 24
<strong style="user-select: auto;">Explanation: </strong>
The maximum obtainable value is 
24 by cutting the rod into 8 pieces 
of length 1, i.e, 8*3=24. </span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:&nbsp;&nbsp;</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">cutRod()</strong>&nbsp;which takes the array <strong style="user-select: auto;">A[]</strong> and its size <strong style="user-select: auto;">N</strong><strong style="user-select: auto;"> </strong>as inputs and returns the maximum price obtainable.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(N<sup style="user-select: auto;">2</sup>)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(N)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 1000<br style="user-select: auto;">
1 ≤ A<sub style="user-select: auto;">i</sub> ≤ 10<sup style="user-select: auto;">5</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>