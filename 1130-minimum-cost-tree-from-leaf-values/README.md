<h2><a href="https://leetcode.com/problems/minimum-cost-tree-from-leaf-values/">1130. Minimum Cost Tree From Leaf Values</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array <code style="user-select: auto;">arr</code> of positive integers, consider all binary trees such that:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Each node has either <code style="user-select: auto;">0</code> or <code style="user-select: auto;">2</code> children;</li>
	<li style="user-select: auto;">The values of <code style="user-select: auto;">arr</code> correspond to the values of each <strong style="user-select: auto;">leaf</strong> in an in-order traversal of the tree.</li>
	<li style="user-select: auto;">The value of each non-leaf node is equal to the product of the largest leaf value in its left and right subtree, respectively.</li>
</ul>

<p style="user-select: auto;">Among all possible binary trees considered, return <em style="user-select: auto;">the smallest possible sum of the values of each non-leaf node</em>. It is guaranteed this sum fits into a <strong style="user-select: auto;">32-bit</strong> integer.</p>

<p style="user-select: auto;">A node is a <strong style="user-select: auto;">leaf</strong> if and only if it has zero children.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/08/10/tree1.jpg" style="width: 500px; height: 169px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [6,2,4]
<strong style="user-select: auto;">Output:</strong> 32
<strong style="user-select: auto;">Explanation:</strong> There are two possible trees shown.
The first has a non-leaf node sum 36, and the second has non-leaf node sum 32.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/08/10/tree2.jpg" style="width: 224px; height: 145px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [4,11]
<strong style="user-select: auto;">Output:</strong> 44
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= arr.length &lt;= 40</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= arr[i] &lt;= 15</code></li>
	<li style="user-select: auto;">It is guaranteed that the answer fits into a <strong style="user-select: auto;">32-bit</strong> signed integer (i.e., it is less than 2<sup style="user-select: auto;">31</sup>).</li>
</ul>
</div>