<h2><a href="https://leetcode.com/problems/contains-duplicate-iii/">220. Contains Duplicate III</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer array <code style="user-select: auto;">nums</code> and two integers <code style="user-select: auto;">k</code> and <code style="user-select: auto;">t</code>, return <code style="user-select: auto;">true</code> if there are <strong style="user-select: auto;">two distinct indices</strong> <code style="user-select: auto;">i</code> and <code style="user-select: auto;">j</code> in the array such that <code style="user-select: auto;">abs(nums[i] - nums[j]) &lt;= t</code> and <code style="user-select: auto;">abs(i - j) &lt;= k</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,1], k = 3, t = 0
<strong style="user-select: auto;">Output:</strong> true
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,0,1,1], k = 1, t = 2
<strong style="user-select: auto;">Output:</strong> true
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,5,9,1,5,9], k = 2, t = 3
<strong style="user-select: auto;">Output:</strong> false
</pre>
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 2 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-2<sup style="user-select: auto;">31</sup> &lt;= nums[i] &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= k &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= t &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
</ul>
</div>