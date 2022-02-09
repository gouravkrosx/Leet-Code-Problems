<h2><a href="https://leetcode.com/problems/reduce-array-size-to-the-half/">1338. Reduce Array Size to The Half</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an integer array <code style="user-select: auto;">arr</code>. You can choose a set of integers and remove all the occurrences of these integers in the array.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the minimum size of the set so that <strong style="user-select: auto;">at least</strong> half of the integers of the array are removed</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [3,3,3,3,5,5,5,2,2,7]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> Choosing {3,7} will make the new array [5,5,5,2,2] which has size 5 (i.e equal to half of the size of the old array).
Possible sets of size 2 are {3,5},{3,2},{5,2}.
Choosing set {2,7} is not possible as it will make the new array [3,3,3,3,5,5,5] which has a size greater than half of the size of the old array.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [7,7,7,7,7,7]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> The only possible set you can choose is {7}. This will make the new array empty.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= arr.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">arr.length</code> is even.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= arr[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>