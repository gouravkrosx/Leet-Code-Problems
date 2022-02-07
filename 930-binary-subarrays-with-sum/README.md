<h2><a href="https://leetcode.com/problems/binary-subarrays-with-sum/">930. Binary Subarrays With Sum</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a binary array <code style="user-select: auto;">nums</code> and an integer <code style="user-select: auto;">goal</code>, return <em style="user-select: auto;">the number of non-empty <strong style="user-select: auto;">subarrays</strong> with a sum</em> <code style="user-select: auto;">goal</code>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">subarray</strong> is a contiguous part of the array.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,0,1,0,1], goal = 2
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong> The 4 subarrays are bolded and underlined below:
[<u style="user-select: auto;"><strong style="user-select: auto;">1,0,1</strong></u>,0,1]
[<u style="user-select: auto;"><strong style="user-select: auto;">1,0,1,0</strong></u>,1]
[1,<u style="user-select: auto;"><strong style="user-select: auto;">0,1,0,1</strong></u>]
[1,0,<u style="user-select: auto;"><strong style="user-select: auto;">1,0,1</strong></u>]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [0,0,0,0,0], goal = 0
<strong style="user-select: auto;">Output:</strong> 15
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 3 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">nums[i]</code> is either <code style="user-select: auto;">0</code> or <code style="user-select: auto;">1</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= goal &lt;= nums.length</code></li>
</ul></div>