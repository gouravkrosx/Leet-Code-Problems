<h2><a href="https://leetcode.com/problems/longest-continuous-increasing-subsequence/">674. Longest Continuous Increasing Subsequence</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an unsorted array of integers <code style="user-select: auto;">nums</code>, return <em style="user-select: auto;">the length of the longest <strong style="user-select: auto;">continuous increasing subsequence</strong> (i.e. subarray)</em>. The subsequence must be <strong style="user-select: auto;">strictly</strong> increasing.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">continuous increasing subsequence</strong> is defined by two indices <code style="user-select: auto;">l</code> and <code style="user-select: auto;">r</code> (<code style="user-select: auto;">l &lt; r</code>) such that it is <code style="user-select: auto;">[nums[l], nums[l + 1], ..., nums[r - 1], nums[r]]</code> and for each <code style="user-select: auto;">l &lt;= i &lt; r</code>, <code style="user-select: auto;">nums[i] &lt; nums[i + 1]</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,3,5,4,7]
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> The longest continuous increasing subsequence is [1,3,5] with length 3.
Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
4.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,2,2,2,2]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> The longest continuous increasing subsequence is [2] with length 1. Note that it must be strictly
increasing.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">9</sup> &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
</ul>
</div>