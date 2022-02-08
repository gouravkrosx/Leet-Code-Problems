<h2><a href="https://leetcode.com/problems/sliding-window-median/">480. Sliding Window Median</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">The <strong style="user-select: auto;">median</strong> is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle values.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For examples, if <code style="user-select: auto;">arr = [2,<u style="user-select: auto;">3</u>,4]</code>, the median is <code style="user-select: auto;">3</code>.</li>
	<li style="user-select: auto;">For examples, if <code style="user-select: auto;">arr = [1,<u style="user-select: auto;">2,3</u>,4]</code>, the median is <code style="user-select: auto;">(2 + 3) / 2 = 2.5</code>.</li>
</ul>

<p style="user-select: auto;">You are given an integer array <code style="user-select: auto;">nums</code> and an integer <code style="user-select: auto;">k</code>. There is a sliding window of size <code style="user-select: auto;">k</code> which is moving from the very left of the array to the very right. You can only see the <code style="user-select: auto;">k</code> numbers in the window. Each time the sliding window moves right by one position.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the median array for each window in the original array</em>. Answers within <code style="user-select: auto;">10<sup style="user-select: auto;">-5</sup></code> of the actual value will be accepted.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,3,-1,-3,5,3,6,7], k = 3
<strong style="user-select: auto;">Output:</strong> [1.00000,-1.00000,-1.00000,3.00000,5.00000,6.00000]
<strong style="user-select: auto;">Explanation:</strong> 
Window position                Median
---------------                -----
[<strong style="user-select: auto;">1  3  -1</strong>] -3  5  3  6  7        1
 1 [<strong style="user-select: auto;">3  -1  -3</strong>] 5  3  6  7       -1
 1  3 [<strong style="user-select: auto;">-1  -3  5</strong>] 3  6  7       -1
 1  3  -1 [<strong style="user-select: auto;">-3  5  3</strong>] 6  7        3
 1  3  -1  -3 [<strong style="user-select: auto;">5  3  6</strong>] 7        5
 1  3  -1  -3  5 [<strong style="user-select: auto;">3  6  7</strong>]       6
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,4,2,3,1,4,2], k = 3
<strong style="user-select: auto;">Output:</strong> [2.00000,3.00000,3.00000,3.00000,2.00000,3.00000,2.00000]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= nums.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-2<sup style="user-select: auto;">31</sup> &lt;= nums[i] &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
</ul>
</div>