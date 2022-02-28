<h2><a href="https://leetcode.com/problems/relative-sort-array/">1122. Relative Sort Array</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given two arrays <code style="user-select: auto;">arr1</code> and <code style="user-select: auto;">arr2</code>, the elements of <code style="user-select: auto;">arr2</code> are distinct, and all elements in <code style="user-select: auto;">arr2</code> are also in <code style="user-select: auto;">arr1</code>.</p>

<p style="user-select: auto;">Sort the elements of <code style="user-select: auto;">arr1</code> such that the relative ordering of items in <code style="user-select: auto;">arr1</code> are the same as in <code style="user-select: auto;">arr2</code>. Elements that do not appear in <code style="user-select: auto;">arr2</code> should be placed at the end of <code style="user-select: auto;">arr1</code> in <strong style="user-select: auto;">ascending</strong> order.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
<strong style="user-select: auto;">Output:</strong> [2,2,2,1,4,3,3,9,6,7,19]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
<strong style="user-select: auto;">Output:</strong> [22,28,8,6,17,44]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= arr1.length, arr2.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= arr1[i], arr2[i] &lt;= 1000</code></li>
	<li style="user-select: auto;">All the elements of <code style="user-select: auto;">arr2</code> are <strong style="user-select: auto;">distinct</strong>.</li>
	<li style="user-select: auto;">Each&nbsp;<code style="user-select: auto;">arr2[i]</code> is in <code style="user-select: auto;">arr1</code>.</li>
</ul>
</div>