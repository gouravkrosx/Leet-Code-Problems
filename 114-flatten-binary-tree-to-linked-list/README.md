<h2><a href="https://leetcode.com/problems/flatten-binary-tree-to-linked-list/">114. Flatten Binary Tree to Linked List</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given the <code style="user-select: auto;">root</code> of a binary tree, flatten the tree into a "linked list":</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The "linked list" should use the same <code style="user-select: auto;">TreeNode</code> class where the <code style="user-select: auto;">right</code> child pointer points to the next node in the list and the <code style="user-select: auto;">left</code> child pointer is always <code style="user-select: auto;">null</code>.</li>
	<li style="user-select: auto;">The "linked list" should be in the same order as a <a href="https://en.wikipedia.org/wiki/Tree_traversal#Pre-order,_NLR" target="_blank" style="user-select: auto;"><strong style="user-select: auto;">pre-order</strong><strong style="user-select: auto;"> traversal</strong></a> of the binary tree.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/14/flaten.jpg" style="width: 500px; height: 226px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,2,5,3,4,null,6]
<strong style="user-select: auto;">Output:</strong> [1,null,2,null,3,null,4,null,5,null,6]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = []
<strong style="user-select: auto;">Output:</strong> []
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [0]
<strong style="user-select: auto;">Output:</strong> [0]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is in the range <code style="user-select: auto;">[0, 2000]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-100 &lt;= Node.val &lt;= 100</code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<strong style="user-select: auto;">Follow up:</strong> Can you flatten the tree in-place (with <code style="user-select: auto;">O(1)</code> extra space)?</div>