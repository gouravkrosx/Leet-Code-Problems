<h2><a href="https://leetcode.com/problems/dungeon-game/">174. Dungeon Game</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">The demons had captured the princess and imprisoned her in <strong style="user-select: auto;">the bottom-right corner</strong> of a <code style="user-select: auto;">dungeon</code>. The <code style="user-select: auto;">dungeon</code> consists of <code style="user-select: auto;">m x n</code> rooms laid out in a 2D grid. Our valiant knight was initially positioned in <strong style="user-select: auto;">the top-left room</strong> and must fight his way through <code style="user-select: auto;">dungeon</code> to rescue the princess.</p>

<p style="user-select: auto;">The knight has an initial health point represented by a positive integer. If at any point his health point drops to <code style="user-select: auto;">0</code> or below, he dies immediately.</p>

<p style="user-select: auto;">Some of the rooms are guarded by demons (represented by negative integers), so the knight loses health upon entering these rooms; other rooms are either empty (represented as 0) or contain magic orbs that increase the knight's health (represented by positive integers).</p>

<p style="user-select: auto;">To reach the princess as quickly as possible, the knight decides to move only <strong style="user-select: auto;">rightward</strong> or <strong style="user-select: auto;">downward</strong> in each step.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the knight's minimum initial health so that he can rescue the princess</em>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note</strong> that any room can contain threats or power-ups, even the first room the knight enters and the bottom-right room where the princess is imprisoned.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/13/dungeon-grid-1.jpg" style="width: 253px; height: 253px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> dungeon = [[-2,-3,3],[-5,-10,1],[10,30,-5]]
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> The initial health of the knight must be at least 7 if he follows the optimal path: RIGHT-&gt; RIGHT -&gt; DOWN -&gt; DOWN.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> dungeon = [[0]]
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == dungeon.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == dungeon[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 200</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-1000 &lt;= dungeon[i][j] &lt;= 1000</code></li>
</ul>
</div>