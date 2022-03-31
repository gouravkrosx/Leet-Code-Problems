<h2><a href="https://leetcode.com/problems/split-array-largest-sum/">410. Split Array Largest Sum</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array <code style="user-select: auto;">nums</code> which consists of non-negative integers and an integer <code style="user-select: auto;">m</code>, you can split the array into <code style="user-select: auto;">m</code> non-empty continuous subarrays.</p>

<p style="user-select: auto;">Write an algorithm to minimize the largest sum among these <code style="user-select: auto;">m</code> subarrays.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [7,2,5,10,8], m = 2
<strong style="user-select: auto;">Output:</strong> 18
<strong style="user-select: auto;">Explanation:</strong>
There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8],
where the largest sum among the two subarrays is only 18.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,4,5], m = 2
<strong style="user-select: auto;">Output:</strong> 9
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,4,4], m = 3
<strong style="user-select: auto;">Output:</strong> 4
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">6</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m &lt;= min(50, nums.length)</code></li>
</ul>
</div>