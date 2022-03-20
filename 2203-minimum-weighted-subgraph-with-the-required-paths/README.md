<h2><a href="https://leetcode.com/problems/minimum-weighted-subgraph-with-the-required-paths/">2203. Minimum Weighted Subgraph With the Required Paths</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an integer <code style="user-select: auto;">n</code> denoting the number of nodes of a <strong style="user-select: auto;">weighted directed</strong> graph. The nodes are numbered from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">n - 1</code>.</p>

<p style="user-select: auto;">You are also given a 2D integer array <code style="user-select: auto;">edges</code> where <code style="user-select: auto;">edges[i] = [from<sub style="user-select: auto;">i</sub>, to<sub style="user-select: auto;">i</sub>, weight<sub style="user-select: auto;">i</sub>]</code> denotes that there exists a <strong style="user-select: auto;">directed</strong> edge from <code style="user-select: auto;">from<sub style="user-select: auto;">i</sub></code> to <code style="user-select: auto;">to<sub style="user-select: auto;">i</sub></code> with weight <code style="user-select: auto;">weight<sub style="user-select: auto;">i</sub></code>.</p>

<p style="user-select: auto;">Lastly, you are given three <strong style="user-select: auto;">distinct</strong> integers <code style="user-select: auto;">src1</code>, <code style="user-select: auto;">src2</code>, and <code style="user-select: auto;">dest</code> denoting three distinct nodes of the graph.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum weight</strong> of a subgraph of the graph such that it is <strong style="user-select: auto;">possible</strong> to reach</em> <code style="user-select: auto;">dest</code> <em style="user-select: auto;">from both</em> <code style="user-select: auto;">src1</code> <em style="user-select: auto;">and</em> <code style="user-select: auto;">src2</code> <em style="user-select: auto;">via a set of edges of this subgraph</em>. In case such a subgraph does not exist, return <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">subgraph</strong> is a graph whose vertices and edges are subsets of the original graph. The <strong style="user-select: auto;">weight</strong> of a subgraph is the sum of weights of its constituent edges.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/02/17/example1drawio.png" style="width: 263px; height: 250px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 6, edges = [[0,2,2],[0,5,6],[1,0,3],[1,4,5],[2,1,1],[2,3,3],[2,3,4],[3,4,2],[4,5,1]], src1 = 0, src2 = 1, dest = 5
<strong style="user-select: auto;">Output:</strong> 9
<strong style="user-select: auto;">Explanation:</strong>
The above figure represents the input graph.
The blue edges represent one of the subgraphs that yield the optimal answer.
Note that the subgraph [[1,0,3],[0,5,6]] also yields the optimal answer. It is not possible to get a subgraph with less weight satisfying all the constraints.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/02/17/example2-1drawio.png" style="width: 350px; height: 51px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 3, edges = [[0,1,1],[2,1,1]], src1 = 0, src2 = 1, dest = 2
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation:</strong>
The above figure represents the input graph.
It can be seen that there does not exist any path from node 1 to node 2, hence there are no subgraphs satisfying all the constraints.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">3 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= edges.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">edges[i].length == 3</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= from<sub style="user-select: auto;">i</sub>, to<sub style="user-select: auto;">i</sub>, src1, src2, dest &lt;= n - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">from<sub style="user-select: auto;">i</sub> != to<sub style="user-select: auto;">i</sub></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">src1</code>, <code style="user-select: auto;">src2</code>, and <code style="user-select: auto;">dest</code> are pairwise distinct.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= weight[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>