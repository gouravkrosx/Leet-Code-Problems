<h2><a href="https://leetcode.com/problems/length-of-longest-fibonacci-subsequence/">873. Length of Longest Fibonacci Subsequence</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">A sequence <code style="user-select: auto;">x<sub style="user-select: auto;">1</sub>, x<sub style="user-select: auto;">2</sub>, ..., x<sub style="user-select: auto;">n</sub></code> is <em style="user-select: auto;">Fibonacci-like</em> if:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n &gt;= 3</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">x<sub style="user-select: auto;">i</sub> + x<sub style="user-select: auto;">i+1</sub> == x<sub style="user-select: auto;">i+2</sub></code> for all <code style="user-select: auto;">i + 2 &lt;= n</code></li>
</ul>

<p style="user-select: auto;">Given a <b style="user-select: auto;">strictly increasing</b> array <code style="user-select: auto;">arr</code> of positive integers forming a sequence, return <em style="user-select: auto;">the <strong style="user-select: auto;">length</strong> of the longest Fibonacci-like subsequence of</em> <code style="user-select: auto;">arr</code>. If one does not exist, return <code style="user-select: auto;">0</code>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">subsequence</strong> is derived from another sequence <code style="user-select: auto;">arr</code> by deleting any number of elements (including none) from <code style="user-select: auto;">arr</code>, without changing the order of the remaining elements. For example, <code style="user-select: auto;">[3, 5, 8]</code> is a subsequence of <code style="user-select: auto;">[3, 4, 5, 6, 7, 8]</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [1,2,3,4,5,6,7,8]
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> The longest subsequence that is fibonacci-like: [1,2,3,5,8].</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [1,3,7,11,12,14,18]
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation</strong>:<strong style="user-select: auto;"> </strong>The longest subsequence that is fibonacci-like: [1,11,12], [3,11,14] or [7,11,18].</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">3 &lt;= arr.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= arr[i] &lt; arr[i + 1] &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
</ul>
</div>