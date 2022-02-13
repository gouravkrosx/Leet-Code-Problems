<h2><a href="https://leetcode.com/problems/distribute-candies-to-people/">1103. Distribute Candies to People</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">We distribute some&nbsp;number of <code style="user-select: auto;">candies</code>, to a row of <strong style="user-select: auto;"><code style="user-select: auto;">n =&nbsp;num_people</code></strong>&nbsp;people in the following way:</p>

<p style="user-select: auto;">We then give 1 candy to the first person, 2 candies to the second person, and so on until we give <code style="user-select: auto;">n</code>&nbsp;candies to the last person.</p>

<p style="user-select: auto;">Then, we go back to the start of the row, giving <code style="user-select: auto;">n&nbsp;+ 1</code> candies to the first person, <code style="user-select: auto;">n&nbsp;+ 2</code> candies to the second person, and so on until we give <code style="user-select: auto;">2 * n</code>&nbsp;candies to the last person.</p>

<p style="user-select: auto;">This process repeats (with us giving one more candy each time, and moving to the start of the row after we reach the end) until we run out of candies.&nbsp; The last person will receive all of our remaining candies (not necessarily one more than the previous gift).</p>

<p style="user-select: auto;">Return an array (of length <code style="user-select: auto;">num_people</code>&nbsp;and sum <code style="user-select: auto;">candies</code>) that represents the final distribution of candies.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> candies = 7, num_people = 4
<strong style="user-select: auto;">Output:</strong> [1,2,3,1]
<strong style="user-select: auto;">Explanation:</strong>
On the first turn, ans[0] += 1, and the array is [1,0,0,0].
On the second turn, ans[1] += 2, and the array is [1,2,0,0].
On the third turn, ans[2] += 3, and the array is [1,2,3,0].
On the fourth turn, ans[3] += 1 (because there is only one candy left), and the final array is [1,2,3,1].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> candies = 10, num_people = 3
<strong style="user-select: auto;">Output:</strong> [5,2,3]
<strong style="user-select: auto;">Explanation: </strong>
On the first turn, ans[0] += 1, and the array is [1,0,0].
On the second turn, ans[1] += 2, and the array is [1,2,0].
On the third turn, ans[2] += 3, and the array is [1,2,3].
On the fourth turn, ans[0] += 4, and the final array is [5,2,3].
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">1 &lt;= candies &lt;= 10^9</li>
	<li style="user-select: auto;">1 &lt;= num_people &lt;= 1000</li>
</ul>
</div>