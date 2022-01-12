<h2><a href="https://leetcode.com/problems/insert-into-a-binary-search-tree/">701. Insert into a Binary Search Tree</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given the <code style="user-select: auto;">root</code> node of a binary search tree (BST) and a <code style="user-select: auto;">value</code> to insert into the tree. Return <em style="user-select: auto;">the root node of the BST after the insertion</em>. It is <strong style="user-select: auto;">guaranteed</strong> that the new value does not exist in the original BST.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Notice</strong>&nbsp;that there may exist&nbsp;multiple valid ways for the&nbsp;insertion, as long as the tree remains a BST after insertion. You can return <strong style="user-select: auto;">any of them</strong>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/05/insertbst.jpg" style="width: 752px; height: 221px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [4,2,7,1,3], val = 5
<strong style="user-select: auto;">Output:</strong> [4,2,7,1,3,5]
<strong style="user-select: auto;">Explanation:</strong> Another accepted tree is:
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/05/bst.jpg" style="width: 352px; height: 301px; user-select: auto;">
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [40,20,60,10,30,50,70], val = 25
<strong style="user-select: auto;">Output:</strong> [40,20,60,10,30,50,70,null,null,25]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
<strong style="user-select: auto;">Output:</strong> [4,2,7,1,3,5]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in&nbsp;the tree will be in the range <code style="user-select: auto;">[0,&nbsp;10<sup style="user-select: auto;">4</sup>]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">8</sup> &lt;= Node.val &lt;= 10<sup style="user-select: auto;">8</sup></code></li>
	<li style="user-select: auto;">All the values <code style="user-select: auto;">Node.val</code> are <strong style="user-select: auto;">unique</strong>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">8</sup> &lt;= val &lt;= 10<sup style="user-select: auto;">8</sup></code></li>
	<li style="user-select: auto;">It's <strong style="user-select: auto;">guaranteed</strong> that <code style="user-select: auto;">val</code> does not exist in the original BST.</li>
</ul>
</div>