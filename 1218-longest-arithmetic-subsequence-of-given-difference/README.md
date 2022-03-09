<h2><a href="https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/">1218. Longest Arithmetic Subsequence of Given Difference</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer array <code style="user-select: auto;">arr</code> and an integer <code style="user-select: auto;">difference</code>, return the length of the longest subsequence in <code style="user-select: auto;">arr</code> which is an arithmetic sequence such that the difference between adjacent elements in the subsequence equals <code style="user-select: auto;">difference</code>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">subsequence</strong> is a sequence that can be derived from <code style="user-select: auto;">arr</code> by deleting some or no elements without changing the order of the remaining elements.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [1,2,3,4], difference = 1
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation: </strong>The longest arithmetic subsequence is [1,2,3,4].</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [1,3,5,7], difference = 1
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation: </strong>The longest arithmetic subsequence is any single element.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [1,5,7,8,5,3,4,2,1], difference = -2
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation: </strong>The longest arithmetic subsequence is [7,5,3,1].
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= arr.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">4</sup> &lt;= arr[i], difference &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>