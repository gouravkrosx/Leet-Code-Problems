<h2><a href="https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/">2096. Step-By-Step Directions From a Binary Tree Node to Another</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given the <code style="user-select: auto;">root</code> of a <strong style="user-select: auto;">binary tree</strong> with <code style="user-select: auto;">n</code> nodes. Each node is uniquely assigned a value from <code style="user-select: auto;">1</code> to <code style="user-select: auto;">n</code>. You are also given an integer <code style="user-select: auto;">startValue</code> representing the value of the start node <code style="user-select: auto;">s</code>, and a different integer <code style="user-select: auto;">destValue</code> representing the value of the destination node <code style="user-select: auto;">t</code>.</p>

<p style="user-select: auto;">Find the <strong style="user-select: auto;">shortest path</strong> starting from node <code style="user-select: auto;">s</code> and ending at node <code style="user-select: auto;">t</code>. Generate step-by-step directions of such path as a string consisting of only the <strong style="user-select: auto;">uppercase</strong> letters <code style="user-select: auto;">'L'</code>, <code style="user-select: auto;">'R'</code>, and <code style="user-select: auto;">'U'</code>. Each letter indicates a specific direction:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">'L'</code> means to go from a node to its <strong style="user-select: auto;">left child</strong> node.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">'R'</code> means to go from a node to its <strong style="user-select: auto;">right child</strong> node.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">'U'</code> means to go from a node to its <strong style="user-select: auto;">parent</strong> node.</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the step-by-step directions of the <strong style="user-select: auto;">shortest path</strong> from node </em><code style="user-select: auto;">s</code><em style="user-select: auto;"> to node</em> <code style="user-select: auto;">t</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/11/15/eg1.png" style="width: 214px; height: 163px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [5,1,2,3,null,6,4], startValue = 3, destValue = 6
<strong style="user-select: auto;">Output:</strong> "UURL"
<strong style="user-select: auto;">Explanation:</strong> The shortest path is: 3 → 1 → 5 → 2 → 6.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/11/15/eg2.png" style="width: 74px; height: 102px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [2,1], startValue = 2, destValue = 1
<strong style="user-select: auto;">Output:</strong> "L"
<strong style="user-select: auto;">Explanation:</strong> The shortest path is: 2 → 1.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is <code style="user-select: auto;">n</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= Node.val &lt;= n</code></li>
	<li style="user-select: auto;">All the values in the tree are <strong style="user-select: auto;">unique</strong>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= startValue, destValue &lt;= n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">startValue != destValue</code></li>
</ul>
</div>