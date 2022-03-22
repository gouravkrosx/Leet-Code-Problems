<h2><a href="https://leetcode.com/problems/find-if-path-exists-in-graph/">1971. Find if Path Exists in Graph</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There is a <strong style="user-select: auto;">bi-directional</strong> graph with <code style="user-select: auto;">n</code> vertices, where each vertex is labeled from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">n - 1</code> (<strong style="user-select: auto;">inclusive</strong>). The edges in the graph are represented as a 2D integer array <code style="user-select: auto;">edges</code>, where each <code style="user-select: auto;">edges[i] = [u<sub style="user-select: auto;">i</sub>, v<sub style="user-select: auto;">i</sub>]</code> denotes a bi-directional edge between vertex <code style="user-select: auto;">u<sub style="user-select: auto;">i</sub></code> and vertex <code style="user-select: auto;">v<sub style="user-select: auto;">i</sub></code>. Every vertex pair is connected by <strong style="user-select: auto;">at most one</strong> edge, and no vertex has an edge to itself.</p>

<p style="user-select: auto;">You want to determine if there is a <strong style="user-select: auto;">valid path</strong> that exists from vertex <code style="user-select: auto;">source</code> to vertex <code style="user-select: auto;">destination</code>.</p>

<p style="user-select: auto;">Given <code style="user-select: auto;">edges</code> and the integers <code style="user-select: auto;">n</code>, <code style="user-select: auto;">source</code>, and <code style="user-select: auto;">destination</code>, return <code style="user-select: auto;">true</code><em style="user-select: auto;"> if there is a <strong style="user-select: auto;">valid path</strong> from </em><code style="user-select: auto;">source</code><em style="user-select: auto;"> to </em><code style="user-select: auto;">destination</code><em style="user-select: auto;">, or </em><code style="user-select: auto;">false</code><em style="user-select: auto;"> otherwise</em><em style="user-select: auto;">.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/08/14/validpath-ex1.png" style="width: 141px; height: 121px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> There are two paths from vertex 0 to vertex 2:
- 0 → 1 → 2
- 0 → 2
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/08/14/validpath-ex2.png" style="width: 281px; height: 141px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
<strong style="user-select: auto;">Output:</strong> false
<strong style="user-select: auto;">Explanation:</strong> There is no path from vertex 0 to vertex 5.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 2 * 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= edges.length &lt;= 2 * 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">edges[i].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= u<sub style="user-select: auto;">i</sub>, v<sub style="user-select: auto;">i</sub> &lt;= n - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">u<sub style="user-select: auto;">i</sub> != v<sub style="user-select: auto;">i</sub></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= source, destination &lt;= n - 1</code></li>
	<li style="user-select: auto;">There are no duplicate edges.</li>
	<li style="user-select: auto;">There are no self edges.</li>
</ul>
</div>