<h2><a href="https://leetcode.com/problems/cousins-in-binary-tree/">993. Cousins in Binary Tree</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given the <code style="user-select: auto;">root</code> of a binary tree with unique values and the values of two different nodes of the tree <code style="user-select: auto;">x</code> and <code style="user-select: auto;">y</code>, return <code style="user-select: auto;">true</code> <em style="user-select: auto;">if the nodes corresponding to the values </em><code style="user-select: auto;">x</code><em style="user-select: auto;"> and </em><code style="user-select: auto;">y</code><em style="user-select: auto;"> in the tree are <strong style="user-select: auto;">cousins</strong>, or </em><code style="user-select: auto;">false</code><em style="user-select: auto;"> otherwise.</em></p>

<p style="user-select: auto;">Two nodes of a binary tree are <strong style="user-select: auto;">cousins</strong> if they have the same depth with different parents.</p>

<p style="user-select: auto;">Note that in a binary tree, the root node is at the depth <code style="user-select: auto;">0</code>, and children of each depth <code style="user-select: auto;">k</code> node are at the depth <code style="user-select: auto;">k + 1</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/02/12/q1248-01.png" style="width: 304px; height: 270px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,2,3,4], x = 4, y = 3
<strong style="user-select: auto;">Output:</strong> false
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/02/12/q1248-02.png" style="width: 334px; height: 266px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,2,3,null,4,null,5], x = 5, y = 4
<strong style="user-select: auto;">Output:</strong> true
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/02/13/q1248-03.png" style="width: 267px; height: 258px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,2,3,null,4], x = 2, y = 3
<strong style="user-select: auto;">Output:</strong> false
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is in the range <code style="user-select: auto;">[2, 100]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= Node.val &lt;= 100</code></li>
	<li style="user-select: auto;">Each node has a <strong style="user-select: auto;">unique</strong> value.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">x != y</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">x</code> and <code style="user-select: auto;">y</code> are exist in the tree.</li>
</ul>
</div>