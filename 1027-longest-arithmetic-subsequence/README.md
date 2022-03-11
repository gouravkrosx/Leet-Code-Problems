<h2><a href="https://leetcode.com/problems/longest-arithmetic-subsequence/">1027. Longest Arithmetic Subsequence</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array <code style="user-select: auto;">nums</code> of integers, return the <strong style="user-select: auto;">length</strong> of the longest arithmetic subsequence in <code style="user-select: auto;">nums</code>.</p>

<p style="user-select: auto;">Recall that a <em style="user-select: auto;">subsequence</em> of an array <code style="user-select: auto;">nums</code> is a list <code style="user-select: auto;">nums[i<sub style="user-select: auto;">1</sub>], nums[i<sub style="user-select: auto;">2</sub>], ..., nums[i<sub style="user-select: auto;">k</sub>]</code> with <code style="user-select: auto;">0 &lt;= i<sub style="user-select: auto;">1</sub> &lt; i<sub style="user-select: auto;">2</sub> &lt; ... &lt; i<sub style="user-select: auto;">k</sub> &lt;= nums.length - 1</code>, and that a sequence <code style="user-select: auto;">seq</code> is <em style="user-select: auto;">arithmetic</em> if <code style="user-select: auto;">seq[i+1] - seq[i]</code> are all the same value (for <code style="user-select: auto;">0 &lt;= i &lt; seq.length - 1</code>).</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [3,6,9,12]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation: </strong>
The whole array is an arithmetic sequence with steps of length = 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [9,4,7,2,10]
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation: </strong>
The longest arithmetic subsequence is [4,7,10].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [20,1,15,3,10,5,8]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation: </strong>
The longest arithmetic subsequence is [20,15,10,5].
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= nums.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums[i] &lt;= 500</code></li>
</ul>
</div>