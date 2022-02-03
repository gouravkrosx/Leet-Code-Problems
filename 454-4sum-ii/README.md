<h2><a href="https://leetcode.com/problems/4sum-ii/">454. 4Sum II</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given four integer arrays <code style="user-select: auto;">nums1</code>, <code style="user-select: auto;">nums2</code>, <code style="user-select: auto;">nums3</code>, and <code style="user-select: auto;">nums4</code> all of length <code style="user-select: auto;">n</code>, return the number of tuples <code style="user-select: auto;">(i, j, k, l)</code> such that:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= i, j, k, l &lt; n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0</code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong>
The two tuples are:
1. (0, 0, 0, 1) -&gt; nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
2. (1, 1, 0, 0) -&gt; nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == nums1.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == nums2.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == nums3.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == nums4.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 200</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-2<sup style="user-select: auto;">28</sup> &lt;= nums1[i], nums2[i], nums3[i], nums4[i] &lt;= 2<sup style="user-select: auto;">28</sup></code></li>
</ul>
</div>