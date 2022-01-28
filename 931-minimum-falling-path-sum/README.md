<h2><a href="https://leetcode.com/problems/minimum-falling-path-sum/">931. Minimum Falling Path Sum</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an <code style="user-select: auto;">n x n</code> array of integers <code style="user-select: auto;">matrix</code>, return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum sum</strong> of any <strong style="user-select: auto;">falling path</strong> through</em> <code style="user-select: auto;">matrix</code>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">falling path</strong> starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right. Specifically, the next element from position <code style="user-select: auto;">(row, col)</code> will be <code style="user-select: auto;">(row + 1, col - 1)</code>, <code style="user-select: auto;">(row + 1, col)</code>, or <code style="user-select: auto;">(row + 1, col + 1)</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/11/03/failing1-grid.jpg" style="width: 499px; height: 500px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> matrix = [[2,1,3],[6,5,4],[7,8,9]]
<strong style="user-select: auto;">Output:</strong> 13
<strong style="user-select: auto;">Explanation:</strong> There are two falling paths with a minimum sum as shown.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/11/03/failing2-grid.jpg" style="width: 164px; height: 365px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> matrix = [[-19,57],[-40,-5]]
<strong style="user-select: auto;">Output:</strong> -59
<strong style="user-select: auto;">Explanation:</strong> The falling path with a minimum sum is shown.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == matrix.length == matrix[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-100 &lt;= matrix[i][j] &lt;= 100</code></li>
</ul>
</div>