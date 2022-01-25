<h2><a href="https://leetcode.com/problems/jump-game-vi/">1696. Jump Game VI</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">nums</code> and an integer <code style="user-select: auto;">k</code>.</p>

<p style="user-select: auto;">You are initially standing at index <code style="user-select: auto;">0</code>. In one move, you can jump at most <code style="user-select: auto;">k</code> steps forward without going outside the boundaries of the array. That is, you can jump from index <code style="user-select: auto;">i</code> to any index in the range <code style="user-select: auto;">[i + 1, min(n - 1, i + k)]</code> <strong style="user-select: auto;">inclusive</strong>.</p>

<p style="user-select: auto;">You want to reach the last index of the array (index <code style="user-select: auto;">n - 1</code>). Your <strong style="user-select: auto;">score</strong> is the <strong style="user-select: auto;">sum</strong> of all <code style="user-select: auto;">nums[j]</code> for each index <code style="user-select: auto;">j</code> you visited in the array.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">maximum score</strong> you can get</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [<u style="user-select: auto;">1</u>,<u style="user-select: auto;">-1</u>,-2,<u style="user-select: auto;">4</u>,-7,<u style="user-select: auto;">3</u>], k = 2
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> You can choose your jumps forming the subsequence [1,-1,4,3] (underlined above). The sum is 7.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [<u style="user-select: auto;">10</u>,-5,-2,<u style="user-select: auto;">4</u>,0,<u style="user-select: auto;">3</u>], k = 3
<strong style="user-select: auto;">Output:</strong> 17
<strong style="user-select: auto;">Explanation:</strong> You can choose your jumps forming the subsequence [10,4,3] (underlined above). The sum is 17.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,-5,-20,4,-1,3,-6,-3], k = 2
<strong style="user-select: auto;">Output:</strong> 0
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length, k &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">4</sup> &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>