<h2><a href="https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/">153. Find Minimum in Rotated Sorted Array</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Suppose an array of length <code style="user-select: auto;">n</code> sorted in ascending order is <strong style="user-select: auto;">rotated</strong> between <code style="user-select: auto;">1</code> and <code style="user-select: auto;">n</code> times. For example, the array <code style="user-select: auto;">nums = [0,1,2,4,5,6,7]</code> might become:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">[4,5,6,7,0,1,2]</code> if it was rotated <code style="user-select: auto;">4</code> times.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">[0,1,2,4,5,6,7]</code> if it was rotated <code style="user-select: auto;">7</code> times.</li>
</ul>

<p style="user-select: auto;">Notice that <strong style="user-select: auto;">rotating</strong> an array <code style="user-select: auto;">[a[0], a[1], a[2], ..., a[n-1]]</code> 1 time results in the array <code style="user-select: auto;">[a[n-1], a[0], a[1], a[2], ..., a[n-2]]</code>.</p>

<p style="user-select: auto;">Given the sorted rotated array <code style="user-select: auto;">nums</code> of <strong style="user-select: auto;">unique</strong> elements, return <em style="user-select: auto;">the minimum element of this array</em>.</p>

<p style="user-select: auto;">You must write an algorithm that runs in&nbsp;<code style="user-select: auto;">O(log n) time.</code></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [3,4,5,1,2]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> The original array was [1,2,3,4,5] rotated 3 times.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [4,5,6,7,0,1,2]
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [11,13,15,17]
<strong style="user-select: auto;">Output:</strong> 11
<strong style="user-select: auto;">Explanation:</strong> The original array was [11,13,15,17] and it was rotated 4 times. 
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == nums.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 5000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-5000 &lt;= nums[i] &lt;= 5000</code></li>
	<li style="user-select: auto;">All the integers of <code style="user-select: auto;">nums</code> are <strong style="user-select: auto;">unique</strong>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">nums</code> is sorted and rotated between <code style="user-select: auto;">1</code> and <code style="user-select: auto;">n</code> times.</li>
</ul>
</div>