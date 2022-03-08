<h2><a href="https://leetcode.com/problems/all-paths-from-source-to-target/">797. All Paths From Source to Target</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a directed acyclic graph (<strong style="user-select: auto;">DAG</strong>) of <code style="user-select: auto;">n</code> nodes labeled from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">n - 1</code>, find all possible paths from node <code style="user-select: auto;">0</code> to node <code style="user-select: auto;">n - 1</code> and return them in <strong style="user-select: auto;">any order</strong>.</p>

<p style="user-select: auto;">The graph is given as follows: <code style="user-select: auto;">graph[i]</code> is a list of all nodes you can visit from node <code style="user-select: auto;">i</code> (i.e., there is a directed edge from node <code style="user-select: auto;">i</code> to node <code style="user-select: auto;">graph[i][j]</code>).</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/28/all_1.jpg" style="width: 242px; height: 242px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> graph = [[1,2],[3],[3],[]]
<strong style="user-select: auto;">Output:</strong> [[0,1,3],[0,2,3]]
<strong style="user-select: auto;">Explanation:</strong> There are two paths: 0 -&gt; 1 -&gt; 3 and 0 -&gt; 2 -&gt; 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/28/all_2.jpg" style="width: 423px; height: 301px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> graph = [[4,3,1],[3,2,4],[3],[4],[]]
<strong style="user-select: auto;">Output:</strong> [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == graph.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= n &lt;= 15</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= graph[i][j] &lt; n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">graph[i][j] != i</code> (i.e., there will be no self-loops).</li>
	<li style="user-select: auto;">All the elements of <code style="user-select: auto;">graph[i]</code> are <strong style="user-select: auto;">unique</strong>.</li>
	<li style="user-select: auto;">The input graph is <strong style="user-select: auto;">guaranteed</strong> to be a <strong style="user-select: auto;">DAG</strong>.</li>
</ul>
</div>