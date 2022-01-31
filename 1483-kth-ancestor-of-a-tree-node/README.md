<h2><a href="https://leetcode.com/problems/kth-ancestor-of-a-tree-node/">1483. Kth Ancestor of a Tree Node</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a tree with <code style="user-select: auto;">n</code> nodes numbered from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">n - 1</code> in the form of a parent array <code style="user-select: auto;">parent</code> where <code style="user-select: auto;">parent[i]</code> is the parent of <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> node. The root of the tree is node <code style="user-select: auto;">0</code>. Find the <code style="user-select: auto;">k<sup style="user-select: auto;">th</sup></code> ancestor of a given node.</p>

<p style="user-select: auto;">The <code style="user-select: auto;">k<sup style="user-select: auto;">th</sup></code> ancestor of a tree node is the <code style="user-select: auto;">k<sup style="user-select: auto;">th</sup></code> node in the path from that node to the root node.</p>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">TreeAncestor</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">TreeAncestor(int n, int[] parent)</code> Initializes the object with the number of nodes in the tree and the parent array.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">int getKthAncestor(int node, int k)</code> return the <code style="user-select: auto;">k<sup style="user-select: auto;">th</sup></code> ancestor of the given node <code style="user-select: auto;">node</code>. If there is no such ancestor, return <code style="user-select: auto;">-1</code>.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/08/28/1528_ex1.png" style="width: 396px; height: 262px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["TreeAncestor", "getKthAncestor", "getKthAncestor", "getKthAncestor"]
[[7, [-1, 0, 0, 1, 1, 2, 2]], [3, 1], [5, 2], [6, 3]]
<strong style="user-select: auto;">Output</strong>
[null, 1, 0, -1]

<strong style="user-select: auto;">Explanation</strong>
TreeAncestor treeAncestor = new TreeAncestor(7, [-1, 0, 0, 1, 1, 2, 2]);
treeAncestor.getKthAncestor(3, 1); // returns 1 which is the parent of 3
treeAncestor.getKthAncestor(5, 2); // returns 0 which is the grandparent of 5
treeAncestor.getKthAncestor(6, 3); // returns -1 because there is no such ancestor</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= n &lt;= 5 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">parent.length == n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">parent[0] == -1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= parent[i] &lt; n</code> for all <code style="user-select: auto;">0 &lt; i &lt; n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= node &lt; n</code></li>
	<li style="user-select: auto;">There will be at most <code style="user-select: auto;">5 * 10<sup style="user-select: auto;">4</sup></code> queries.</li>
</ul>
</div>