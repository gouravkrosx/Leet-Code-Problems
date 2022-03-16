<h2><a href="https://leetcode.com/problems/brick-wall/">554. Brick Wall</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There is a rectangular brick wall in front of you with <code style="user-select: auto;">n</code> rows of bricks. The <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> row has some number of bricks each of the same height (i.e., one unit) but they can be of different widths. The total width of each row is the same.</p>

<p style="user-select: auto;">Draw a vertical line from the top to the bottom and cross the least bricks. If your line goes through the edge of a brick, then the brick is not considered as crossed. You cannot draw a line just along one of the two vertical edges of the wall, in which case the line will obviously cross no bricks.</p>

<p style="user-select: auto;">Given the 2D array <code style="user-select: auto;">wall</code> that contains the information about the wall, return <em style="user-select: auto;">the minimum number of crossed bricks after drawing such a vertical line</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/24/cutwall-grid.jpg" style="width: 493px; height: 577px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
<strong style="user-select: auto;">Output:</strong> 2
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> wall = [[1],[1],[1]]
<strong style="user-select: auto;">Output:</strong> 3
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == wall.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= wall[i].length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= sum(wall[i].length) &lt;= 2 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">sum(wall[i])</code> is the same for each row <code style="user-select: auto;">i</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= wall[i][j] &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
</ul>
</div>