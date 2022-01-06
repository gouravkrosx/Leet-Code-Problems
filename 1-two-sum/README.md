<h2><a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array of integers <code style="user-select: auto;">nums</code>&nbsp;and an integer <code style="user-select: auto;">target</code>, return <em style="user-select: auto;">indices of the two numbers such that they add up to <code style="user-select: auto;">target</code></em>.</p>

<p style="user-select: auto;">You may assume that each input would have <strong style="user-select: auto;"><em style="user-select: auto;">exactly</em> one solution</strong>, and you may not use the <em style="user-select: auto;">same</em> element twice.</p>

<p style="user-select: auto;">You can return the answer in any order.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,7,11,15], target = 9
<strong style="user-select: auto;">Output:</strong> [0,1]
<strong style="user-select: auto;">Output:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [3,2,4], target = 6
<strong style="user-select: auto;">Output:</strong> [1,2]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [3,3], target = 6
<strong style="user-select: auto;">Output:</strong> [0,1]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">9</sup> &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">9</sup> &lt;= target &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
	<li style="user-select: auto;"><strong style="user-select: auto;">Only one valid answer exists.</strong></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<strong style="user-select: auto;">Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than&nbsp;<code style="user-select: auto;">O(n<sup style="user-select: auto;">2</sup>)&nbsp;</code>time complexity?</div>