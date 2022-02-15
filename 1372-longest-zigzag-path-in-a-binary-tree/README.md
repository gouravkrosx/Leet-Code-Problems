<h2><a href="https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/">1372. Longest ZigZag Path in a Binary Tree</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given the <code style="user-select: auto;">root</code> of a binary tree.</p>

<p style="user-select: auto;">A ZigZag path for a binary tree is defined as follow:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Choose <strong style="user-select: auto;">any </strong>node in the binary tree and a direction (right or left).</li>
	<li style="user-select: auto;">If the current direction is right, move to the right child of the current node; otherwise, move to the left child.</li>
	<li style="user-select: auto;">Change the direction from right to left or from left to right.</li>
	<li style="user-select: auto;">Repeat the second and third steps until you can't move in the tree.</li>
</ul>

<p style="user-select: auto;">Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the longest <strong style="user-select: auto;">ZigZag</strong> path contained in that tree</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/01/22/sample_1_1702.png" style="width: 221px; height: 383px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1]
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> Longest ZigZag path in blue nodes (right -&gt; left -&gt; right).
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/01/22/sample_2_1702.png" style="width: 157px; height: 329px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,1,1,null,1,null,null,1,1,null,1]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong> Longest ZigZag path in blue nodes (left -&gt; right -&gt; left -&gt; right).
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1]
<strong style="user-select: auto;">Output:</strong> 0
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is in the range <code style="user-select: auto;">[1, 5 * 10<sup style="user-select: auto;">4</sup>]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= Node.val &lt;= 100</code></li>
</ul>
</div>