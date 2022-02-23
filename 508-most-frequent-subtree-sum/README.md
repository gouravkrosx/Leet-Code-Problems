<h2><a href="https://leetcode.com/problems/most-frequent-subtree-sum/">508. Most Frequent Subtree Sum</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given the <code style="user-select: auto;">root</code> of a binary tree, return the most frequent <strong style="user-select: auto;">subtree sum</strong>. If there is a tie, return all the values with the highest frequency in any order.</p>

<p style="user-select: auto;">The <strong style="user-select: auto;">subtree sum</strong> of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself).</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/24/freq1-tree.jpg" style="width: 207px; height: 183px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [5,2,-3]
<strong style="user-select: auto;">Output:</strong> [2,-3,4]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/24/freq2-tree.jpg" style="width: 207px; height: 183px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [5,2,-5]
<strong style="user-select: auto;">Output:</strong> [2]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is in the range <code style="user-select: auto;">[1, 10<sup style="user-select: auto;">4</sup>]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">5</sup> &lt;= Node.val &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>