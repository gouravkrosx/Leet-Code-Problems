<h2><a href="https://leetcode.com/problems/count-artifacts-that-can-be-extracted/">2201. Count Artifacts That Can Be Extracted</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There is an <code style="user-select: auto;">n x n</code> <strong style="user-select: auto;">0-indexed</strong> grid with some artifacts buried in it. You are given the integer <code style="user-select: auto;">n</code> and a <strong style="user-select: auto;">0-indexed </strong>2D integer array <code style="user-select: auto;">artifacts</code> describing the positions of the rectangular artifacts where <code style="user-select: auto;">artifacts[i] = [r1<sub style="user-select: auto;">i</sub>, c1<sub style="user-select: auto;">i</sub>, r2<sub style="user-select: auto;">i</sub>, c2<sub style="user-select: auto;">i</sub>]</code> denotes that the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> artifact is buried in the subgrid where:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">(r1<sub style="user-select: auto;">i</sub>, c1<sub style="user-select: auto;">i</sub>)</code> is the coordinate of the <strong style="user-select: auto;">top-left</strong> cell of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> artifact and</li>
	<li style="user-select: auto;"><code style="user-select: auto;">(r2<sub style="user-select: auto;">i</sub>, c2<sub style="user-select: auto;">i</sub>)</code> is the coordinate of the <strong style="user-select: auto;">bottom-right</strong> cell of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> artifact.</li>
</ul>

<p style="user-select: auto;">You will excavate some cells of the grid and remove all the mud from them. If the cell has a part of an artifact buried underneath, it will be uncovered. If all the parts of an artifact are uncovered, you can extract it.</p>

<p style="user-select: auto;">Given a <strong style="user-select: auto;">0-indexed</strong> 2D integer array <code style="user-select: auto;">dig</code> where <code style="user-select: auto;">dig[i] = [r<sub style="user-select: auto;">i</sub>, c<sub style="user-select: auto;">i</sub>]</code> indicates that you will excavate the cell <code style="user-select: auto;">(r<sub style="user-select: auto;">i</sub>, c<sub style="user-select: auto;">i</sub>)</code>, return <em style="user-select: auto;">the number of artifacts that you can extract</em>.</p>

<p style="user-select: auto;">The test cases are generated such that:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">No two artifacts overlap.</li>
	<li style="user-select: auto;">Each artifact only covers at most <code style="user-select: auto;">4</code> cells.</li>
	<li style="user-select: auto;">The entries of <code style="user-select: auto;">dig</code> are unique.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/09/16/untitled-diagram.jpg" style="width: 216px; height: 216px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 2, artifacts = [[0,0,0,0],[0,1,1,1]], dig = [[0,0],[0,1]]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> 
The different colors represent different artifacts. Excavated cells are labeled with a 'D' in the grid.
There is 1 artifact that can be extracted, namely the red artifact.
The blue artifact has one part in cell (1,1) which remains uncovered, so we cannot extract it.
Thus, we return 1.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/09/16/untitled-diagram-1.jpg" style="width: 216px; height: 216px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 2, artifacts = [[0,0,0,0],[0,1,1,1]], dig = [[0,0],[0,1],[1,1]]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> Both the red and blue artifacts have all parts uncovered (labeled with a 'D') and can be extracted, so we return 2. 
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= artifacts.length, dig.length &lt;= min(n<sup style="user-select: auto;">2</sup>, 10<sup style="user-select: auto;">5</sup>)</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">artifacts[i].length == 4</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">dig[i].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= r1<sub style="user-select: auto;">i</sub>, c1<sub style="user-select: auto;">i</sub>, r2<sub style="user-select: auto;">i</sub>, c2<sub style="user-select: auto;">i</sub>, r<sub style="user-select: auto;">i</sub>, c<sub style="user-select: auto;">i</sub> &lt;= n - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">r1<sub style="user-select: auto;">i</sub> &lt;= r2<sub style="user-select: auto;">i</sub></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">c1<sub style="user-select: auto;">i</sub> &lt;= c2<sub style="user-select: auto;">i</sub></code></li>
	<li style="user-select: auto;">No two artifacts will overlap.</li>
	<li style="user-select: auto;">The number of cells covered by an artifact is <strong style="user-select: auto;">at most</strong> <code style="user-select: auto;">4</code>.</li>
	<li style="user-select: auto;">The entries of <code style="user-select: auto;">dig</code> are unique.</li>
</ul>
</div>