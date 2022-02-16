<h2><a href="https://leetcode.com/problems/next-greater-element-ii/">503. Next Greater Element II</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a circular integer array <code style="user-select: auto;">nums</code> (i.e., the next element of <code style="user-select: auto;">nums[nums.length - 1]</code> is <code style="user-select: auto;">nums[0]</code>), return <em style="user-select: auto;">the <strong style="user-select: auto;">next greater number</strong> for every element in</em> <code style="user-select: auto;">nums</code>.</p>

<p style="user-select: auto;">The <strong style="user-select: auto;">next greater number</strong> of a number <code style="user-select: auto;">x</code> is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return <code style="user-select: auto;">-1</code> for this number.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,1]
<strong style="user-select: auto;">Output:</strong> [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,4,3]
<strong style="user-select: auto;">Output:</strong> [2,3,4,-1,4]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">9</sup> &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
</ul>
</div>