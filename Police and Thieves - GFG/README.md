# Police and Thieves
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array of size <strong style="user-select: auto;">n</strong> such that each element contains either a 'P' for policeman or a 'T' for thief. Find the maximum number of thieves that can be caught by the police.&nbsp;<br style="user-select: auto;">
Keep in mind the following conditions :</span></p>

<ol style="user-select: auto;">
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Each policeman can catch only one thief.</span></li>
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">A policeman cannot catch a thief who is more than <strong style="user-select: auto;">K</strong> units away from him.</span></li>
</ol>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 5, K = 1
arr[] = {P, T, T, P, T}
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> Maximum 2 thieves can be 
caught. First policeman catches first thief 
and second police man can catch either second 
or third thief.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 6, K = 2
arr[] = {T, T, P, P, T, P}
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation: </strong>Maximum 3 thieves can be caught.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task: &nbsp;</strong><br style="user-select: auto;">
You dont need to read input or print anything. Complete the function <strong style="user-select: auto;">catchThieves() </strong>that takes <strong style="user-select: auto;">n, k</strong> and <strong style="user-select: auto;">arr[ ]</strong>&nbsp;as input parameters and returns the maximum number of thieves that can be caught by the police.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(N)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ n ≤&nbsp;10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 ≤&nbsp;k ≤&nbsp;100<br style="user-select: auto;">
arr[i] = 'P' or 'T'</span></p>
 <p style="user-select: auto;"></p>
            </div>