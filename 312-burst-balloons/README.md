<h2><a href="https://leetcode.com/problems/burst-balloons/">312. Burst Balloons</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given <code style="user-select: auto;">n</code> balloons, indexed from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">n - 1</code>. Each balloon is painted with a number on it represented by an array <code style="user-select: auto;">nums</code>. You are asked to burst all the balloons.</p>

<p style="user-select: auto;">If you burst the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> balloon, you will get <code style="user-select: auto;">nums[i - 1] * nums[i] * nums[i + 1]</code> coins. If <code style="user-select: auto;">i - 1</code> or <code style="user-select: auto;">i + 1</code> goes out of bounds of the array, then treat it as if there is a balloon with a <code style="user-select: auto;">1</code> painted on it.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the maximum coins you can collect by bursting the balloons wisely</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [3,1,5,8]
<strong style="user-select: auto;">Output:</strong> 167
<strong style="user-select: auto;">Explanation:</strong>
nums = [3,1,5,8] --&gt; [3,5,8] --&gt; [3,8] --&gt; [8] --&gt; []
coins =  3*1*5    +   3*5*8   +  1*3*8  + 1*8*1 = 167</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,5]
<strong style="user-select: auto;">Output:</strong> 10
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == nums.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 500</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums[i] &lt;= 100</code></li>
</ul>
</div>