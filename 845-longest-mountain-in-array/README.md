<h2><a href="https://leetcode.com/problems/longest-mountain-in-array/">845. Longest Mountain in Array</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You may recall that an array <code style="user-select: auto;">arr</code> is a <strong style="user-select: auto;">mountain array</strong> if and only if:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">arr.length &gt;= 3</code></li>
	<li style="user-select: auto;">There exists some index <code style="user-select: auto;">i</code> (<strong style="user-select: auto;">0-indexed</strong>) with <code style="user-select: auto;">0 &lt; i &lt; arr.length - 1</code> such that:
	<ul style="user-select: auto;">
		<li style="user-select: auto;"><code style="user-select: auto;">arr[0] &lt; arr[1] &lt; ... &lt; arr[i - 1] &lt; arr[i]</code></li>
		<li style="user-select: auto;"><code style="user-select: auto;">arr[i] &gt; arr[i + 1] &gt; ... &gt; arr[arr.length - 1]</code></li>
	</ul>
	</li>
</ul>

<p style="user-select: auto;">Given an integer array <code style="user-select: auto;">arr</code>, return <em style="user-select: auto;">the length of the longest subarray, which is a mountain</em>. Return <code style="user-select: auto;">0</code> if there is no mountain subarray.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [2,1,4,7,3,2,5]
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> The largest mountain is [1,4,7,3,2] which has length 5.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [2,2,2]
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> There is no mountain.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= arr.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= arr[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Follow up:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Can you solve it using only one pass?</li>
	<li style="user-select: auto;">Can you solve it in <code style="user-select: auto;">O(1)</code> space?</li>
</ul>
</div>