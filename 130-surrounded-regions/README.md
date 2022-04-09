<h2><a href="https://leetcode.com/problems/surrounded-regions/">130. Surrounded Regions</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an <code style="user-select: auto;">m x n</code> matrix <code style="user-select: auto;">board</code> containing <code style="user-select: auto;">'X'</code> and <code style="user-select: auto;">'O'</code>, <em style="user-select: auto;">capture all regions that are 4-directionally&nbsp;surrounded by</em> <code style="user-select: auto;">'X'</code>.</p>

<p style="user-select: auto;">A region is <strong style="user-select: auto;">captured</strong> by flipping all <code style="user-select: auto;">'O'</code>s into <code style="user-select: auto;">'X'</code>s in that surrounded region.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/xogrid.jpg" style="width: 550px; height: 237px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
<strong style="user-select: auto;">Output:</strong> [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
<strong style="user-select: auto;">Explanation:</strong> Surrounded regions should not be on the border, which means that any 'O' on the border of the board are not flipped to 'X'. Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'. Two cells are connected if they are adjacent cells connected horizontally or vertically.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> board = [["X"]]
<strong style="user-select: auto;">Output:</strong> [["X"]]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == board.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == board[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 200</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">board[i][j]</code> is <code style="user-select: auto;">'X'</code> or <code style="user-select: auto;">'O'</code>.</li>
</ul>
</div>