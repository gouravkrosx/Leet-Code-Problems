<h2><a href="https://leetcode.com/problems/append-k-integers-with-minimal-sum/">2195. Append K Integers With Minimal Sum</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an integer array <code style="user-select: auto;">nums</code> and an integer <code style="user-select: auto;">k</code>. Append <code style="user-select: auto;">k</code> <strong style="user-select: auto;">unique positive</strong> integers that do <strong style="user-select: auto;">not</strong> appear in <code style="user-select: auto;">nums</code> to <code style="user-select: auto;">nums</code> such that the resulting total sum is <strong style="user-select: auto;">minimum</strong>.</p>

<p style="user-select: auto;">Return<em style="user-select: auto;"> the sum of the</em> <code style="user-select: auto;">k</code> <em style="user-select: auto;">integers appended to</em> <code style="user-select: auto;">nums</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,4,25,10,25], k = 2
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> The two unique positive integers that do not appear in nums which we append are 2 and 3.
The resulting sum of nums is 1 + 4 + 25 + 10 + 25 + 2 + 3 = 70, which is the minimum.
The sum of the two integers appended is 2 + 3 = 5, so we return 5.</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [5,6], k = 6
<strong style="user-select: auto;">Output:</strong> 25
<strong style="user-select: auto;">Explanation:</strong> The six unique positive integers that do not appear in nums which we append are 1, 2, 3, 4, 7, and 8.
The resulting sum of nums is 5 + 6 + 1 + 2 + 3 + 4 + 7 + 8 = 36, which is the minimum. 
The sum of the six integers appended is 1 + 2 + 3 + 4 + 7 + 8 = 25, so we return 25.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= 10<sup style="user-select: auto;">8</sup></code></li>
</ul>
</div>