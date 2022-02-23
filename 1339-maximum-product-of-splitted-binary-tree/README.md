<h2><a href="https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/">1339. Maximum Product of Splitted Binary Tree</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given the <code style="user-select: auto;">root</code> of a binary tree, split the binary tree into two subtrees by removing one edge such that the product of the sums of the subtrees is maximized.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the maximum product of the sums of the two subtrees</em>. Since the answer may be too large, return it <strong style="user-select: auto;">modulo</strong> <code style="user-select: auto;">10<sup style="user-select: auto;">9</sup> + 7</code>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note</strong> that you need to maximize the answer before taking the mod and not after taking it.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/01/21/sample_1_1699.png" style="width: 500px; height: 167px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,2,3,4,5,6]
<strong style="user-select: auto;">Output:</strong> 110
<strong style="user-select: auto;">Explanation:</strong> Remove the red edge and get 2 binary trees with sum 11 and 10. Their product is 110 (11*10)
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/01/21/sample_2_1699.png" style="width: 500px; height: 211px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,null,2,3,4,null,null,5,6]
<strong style="user-select: auto;">Output:</strong> 90
<strong style="user-select: auto;">Explanation:</strong> Remove the red edge and get 2 binary trees with sum 15 and 6.Their product is 90 (15*6)
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is in the range <code style="user-select: auto;">[2, 5 * 10<sup style="user-select: auto;">4</sup>]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= Node.val &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>