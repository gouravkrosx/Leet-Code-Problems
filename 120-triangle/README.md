<h2><a href="https://leetcode.com/problems/triangle/">120. Triangle</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a <code style="user-select: auto;">triangle</code> array, return <em style="user-select: auto;">the minimum path sum from top to bottom</em>.</p>

<p style="user-select: auto;">For each step, you may move to an adjacent number of the row below. More formally, if you are on index <code style="user-select: auto;">i</code> on the current row, you may move to either index <code style="user-select: auto;">i</code> or index <code style="user-select: auto;">i + 1</code> on the next row.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
<strong style="user-select: auto;">Output:</strong> 11
<strong style="user-select: auto;">Explanation:</strong> The triangle looks like:
   <u style="user-select: auto;">2</u>
  <u style="user-select: auto;">3</u> 4
 6 <u style="user-select: auto;">5</u> 7
4 <u style="user-select: auto;">1</u> 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> triangle = [[-10]]
<strong style="user-select: auto;">Output:</strong> -10
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= triangle.length &lt;= 200</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">triangle[0].length == 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">triangle[i].length == triangle[i - 1].length + 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">4</sup> &lt;= triangle[i][j] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<strong style="user-select: auto;">Follow up:</strong> Could you&nbsp;do this using only <code style="user-select: auto;">O(n)</code> extra space, where <code style="user-select: auto;">n</code> is the total number of rows in the triangle?</div>