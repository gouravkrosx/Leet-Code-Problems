# Distribute N candies among K people
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given <strong style="user-select: auto;">N</strong> candies and <strong style="user-select: auto;">K</strong> people. In the first turn, the first person gets 1 candy, the second gets 2 candies, and so on till K people. In the next turn, the first person gets K+1 candies, the second person gets K+2 candies and so on. If the number of candies is less than the required number of candies at every turn, then the person receives the remaining number of candies. Find the total number of candies every person has at the end.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 7, K = 4
<strong style="user-select: auto;">Output:
</strong>1 2 3 1
<strong style="user-select: auto;">Explanation:</strong>
At the first turn, the fourth person
has to be given 4 candies, but there is
only 1 left, hence he takes only one. </span>
</pre>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></div>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 10, K = 3
<strong style="user-select: auto;">Output :</strong>
5 2 3</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:</strong>
At the second turn first one receives
4 and then we have no more candies left. </span>

</pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:&nbsp;&nbsp;</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">distributeCandies()</strong>&nbsp;which takes 2 integers N and K as input and returns a list, where the ith integer denotes the number of candies the ith person gets.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(logN+K)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(K)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 10<sup style="user-select: auto;">8</sup><br style="user-select: auto;">
1 ≤ K ≤ 100</span></p>
 <p style="user-select: auto;"></p>
            </div>