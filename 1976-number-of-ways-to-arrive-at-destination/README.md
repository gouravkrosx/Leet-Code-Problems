<h2><a href="https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/">1976. Number of Ways to Arrive at Destination</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are in a city that consists of <code style="user-select: auto;">n</code> intersections numbered from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">n - 1</code> with <strong style="user-select: auto;">bi-directional</strong> roads between some intersections. The inputs are generated such that you can reach any intersection from any other intersection and that there is at most one road between any two intersections.</p>

<p style="user-select: auto;">You are given an integer <code style="user-select: auto;">n</code> and a 2D integer array <code style="user-select: auto;">roads</code> where <code style="user-select: auto;">roads[i] = [u<sub style="user-select: auto;">i</sub>, v<sub style="user-select: auto;">i</sub>, time<sub style="user-select: auto;">i</sub>]</code> means that there is a road between intersections <code style="user-select: auto;">u<sub style="user-select: auto;">i</sub></code> and <code style="user-select: auto;">v<sub style="user-select: auto;">i</sub></code> that takes <code style="user-select: auto;">time<sub style="user-select: auto;">i</sub></code> minutes to travel. You want to know in how many ways you can travel from intersection <code style="user-select: auto;">0</code> to intersection <code style="user-select: auto;">n - 1</code> in the <strong style="user-select: auto;">shortest amount of time</strong>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">number of ways</strong> you can arrive at your destination in the <strong style="user-select: auto;">shortest amount of time</strong></em>. Since the answer may be large, return it <strong style="user-select: auto;">modulo</strong> <code style="user-select: auto;">10<sup style="user-select: auto;">9</sup> + 7</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/07/17/graph2.png" style="width: 235px; height: 381px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 7, roads = [[0,6,7],[0,1,2],[1,2,3],[1,3,3],[6,3,3],[3,5,1],[6,5,1],[2,5,1],[0,4,5],[4,6,2]]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong> The shortest amount of time it takes to go from intersection 0 to intersection 6 is 7 minutes.
The four ways to get there in 7 minutes are:
- 0 ➝ 6
- 0 ➝ 4 ➝ 6
- 0 ➝ 1 ➝ 2 ➝ 5 ➝ 6
- 0 ➝ 1 ➝ 3 ➝ 5 ➝ 6
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 2, roads = [[1,0,10]]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> There is only one way to go from intersection 0 to intersection 1, and it takes 10 minutes.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 200</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n - 1 &lt;= roads.length &lt;= n * (n - 1) / 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">roads[i].length == 3</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= u<sub style="user-select: auto;">i</sub>, v<sub style="user-select: auto;">i</sub> &lt;= n - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= time<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">u<sub style="user-select: auto;">i </sub>!= v<sub style="user-select: auto;">i</sub></code></li>
	<li style="user-select: auto;">There is at most one road connecting any two intersections.</li>
	<li style="user-select: auto;">You can reach any intersection from any other intersection.</li>
</ul>
</div>