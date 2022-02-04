<h2><a href="https://leetcode.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/">1292. Maximum Side Length of a Square with Sum Less than or Equal to Threshold</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a <code style="user-select: auto;">m x n</code> matrix <code style="user-select: auto;">mat</code> and an integer <code style="user-select: auto;">threshold</code>, return <em style="user-select: auto;">the maximum side-length of a square with a sum less than or equal to </em><code style="user-select: auto;">threshold</code><em style="user-select: auto;"> or return </em><code style="user-select: auto;">0</code><em style="user-select: auto;"> if there is no such square</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/12/05/e1.png" style="width: 335px; height: 186px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> mat = [[1,1,3,2,4,3,2],[1,1,3,2,4,3,2],[1,1,3,2,4,3,2]], threshold = 4
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> The maximum side length of square with sum less than 4 is 2 as shown.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> mat = [[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2]], threshold = 1
<strong style="user-select: auto;">Output:</strong> 0
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == mat.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == mat[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 300</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= mat[i][j] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= threshold &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>