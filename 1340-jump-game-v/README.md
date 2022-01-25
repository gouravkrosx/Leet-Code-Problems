<h2><a href="https://leetcode.com/problems/jump-game-v/">1340. Jump Game V</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array of&nbsp;integers <code style="user-select: auto;">arr</code> and an integer <code style="user-select: auto;">d</code>. In one step you can jump from index <code style="user-select: auto;">i</code> to index:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">i + x</code> where:&nbsp;<code style="user-select: auto;">i + x &lt; arr.length</code> and <code style="user-select: auto;"> 0 &lt;&nbsp;x &lt;= d</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">i - x</code> where:&nbsp;<code style="user-select: auto;">i - x &gt;= 0</code> and <code style="user-select: auto;"> 0 &lt;&nbsp;x &lt;= d</code>.</li>
</ul>

<p style="user-select: auto;">In addition, you can only jump from index <code style="user-select: auto;">i</code> to index <code style="user-select: auto;">j</code>&nbsp;if <code style="user-select: auto;">arr[i] &gt; arr[j]</code> and <code style="user-select: auto;">arr[i] &gt; arr[k]</code> for all indices <code style="user-select: auto;">k</code> between <code style="user-select: auto;">i</code> and <code style="user-select: auto;">j</code> (More formally <code style="user-select: auto;">min(i,&nbsp;j) &lt; k &lt; max(i, j)</code>).</p>

<p style="user-select: auto;">You can choose any index of the array and start jumping. Return <em style="user-select: auto;">the maximum number of indices</em>&nbsp;you can visit.</p>

<p style="user-select: auto;">Notice that you can not jump outside of the array at any time.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/01/23/meta-chart.jpeg" style="width: 633px; height: 419px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [6,4,14,6,8,13,9,7,10,6,12], d = 2
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong> You can start at index 10. You can jump 10 --&gt; 8 --&gt; 6 --&gt; 7 as shown.
Note that if you start at index 6 you can only jump to index 7. You cannot jump to index 5 because 13 &gt; 9. You cannot jump to index 4 because index 5 is between index 4 and 6 and 13 &gt; 9.
Similarly You cannot jump from index 3 to index 2 or index 1.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [3,3,3,3,3], d = 3
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> You can start at any index. You always cannot jump to any index.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [7,6,5,4,3,2,1], d = 1
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> Start at index 0. You can visit all the indicies. 
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= arr.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= arr[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= d &lt;= arr.length</code></li>
</ul>
</div>