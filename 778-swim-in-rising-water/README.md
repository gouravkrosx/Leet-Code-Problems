<h2><a href="https://leetcode.com/problems/swim-in-rising-water/">778. Swim in Rising Water</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an <code style="user-select: auto;">n x n</code> integer matrix <code style="user-select: auto;">grid</code> where each value <code style="user-select: auto;">grid[i][j]</code> represents the elevation at that point <code style="user-select: auto;">(i, j)</code>.</p>

<p style="user-select: auto;">The rain starts to fall. At time <code style="user-select: auto;">t</code>, the depth of the water everywhere is <code style="user-select: auto;">t</code>. You can swim from a square to another 4-directionally adjacent square if and only if the elevation of both squares individually are at most <code style="user-select: auto;">t</code>. You can swim infinite distances in zero time. Of course, you must stay within the boundaries of the grid during your swim.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the least time until you can reach the bottom right square </em><code style="user-select: auto;">(n - 1, n - 1)</code><em style="user-select: auto;"> if you start at the top left square </em><code style="user-select: auto;">(0, 0)</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/06/29/swim1-grid.jpg" style="width: 164px; height: 165px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[0,2],[1,3]]
<strong style="user-select: auto;">Output:</strong> 3
Explanation:
At time 0, you are in grid location (0, 0).
You cannot go anywhere else because 4-directionally adjacent neighbors have a higher elevation than t = 0.
You cannot reach point (1, 1) until time 3.
When the depth of water is 3, we can swim anywhere inside the grid.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/06/29/swim2-grid-1.jpg" style="width: 404px; height: 405px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]]
<strong style="user-select: auto;">Output:</strong> 16
<strong style="user-select: auto;">Explanation:</strong> The final route is shown.
We need to wait until time 16 so that (0, 0) and (4, 4) are connected.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 50</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= grid[i][j] &lt;&nbsp;n<sup style="user-select: auto;">2</sup></code></li>
	<li style="user-select: auto;">Each value <code style="user-select: auto;">grid[i][j]</code> is <strong style="user-select: auto;">unique</strong>.</li>
</ul>
</div>