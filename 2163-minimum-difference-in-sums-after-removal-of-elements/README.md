<h2><a href="https://leetcode.com/problems/minimum-difference-in-sums-after-removal-of-elements/">2163. Minimum Difference in Sums After Removal of Elements</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">nums</code> consisting of <code style="user-select: auto;">3 * n</code> elements.</p>

<p style="user-select: auto;">You are allowed to remove any <strong style="user-select: auto;">subsequence</strong> of elements of size <strong style="user-select: auto;">exactly</strong> <code style="user-select: auto;">n</code> from <code style="user-select: auto;">nums</code>. The remaining <code style="user-select: auto;">2 * n</code> elements will be divided into two <strong style="user-select: auto;">equal</strong> parts:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The first <code style="user-select: auto;">n</code> elements belonging to the first part and their sum is <code style="user-select: auto;">sum<sub style="user-select: auto;">first</sub></code>.</li>
	<li style="user-select: auto;">The next <code style="user-select: auto;">n</code> elements belonging to the second part and their sum is <code style="user-select: auto;">sum<sub style="user-select: auto;">second</sub></code>.</li>
</ul>

<p style="user-select: auto;">The <strong style="user-select: auto;">difference in sums</strong> of the two parts is denoted as <code style="user-select: auto;">sum<sub style="user-select: auto;">first</sub> - sum<sub style="user-select: auto;">second</sub></code>.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, if <code style="user-select: auto;">sum<sub style="user-select: auto;">first</sub> = 3</code> and <code style="user-select: auto;">sum<sub style="user-select: auto;">second</sub> = 2</code>, their difference is <code style="user-select: auto;">1</code>.</li>
	<li style="user-select: auto;">Similarly, if <code style="user-select: auto;">sum<sub style="user-select: auto;">first</sub> = 2</code> and <code style="user-select: auto;">sum<sub style="user-select: auto;">second</sub> = 3</code>, their difference is <code style="user-select: auto;">-1</code>.</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum difference</strong> possible between the sums of the two parts after the removal of </em><code style="user-select: auto;">n</code><em style="user-select: auto;"> elements</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [3,1,2]
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation:</strong> Here, nums has 3 elements, so n = 1. 
Thus we have to remove 1 element from nums and divide the array into two equal parts.
- If we remove nums[0] = 3, the array will be [1,2]. The difference in sums of the two parts will be 1 - 2 = -1.
- If we remove nums[1] = 1, the array will be [3,2]. The difference in sums of the two parts will be 3 - 2 = 1.
- If we remove nums[2] = 2, the array will be [3,1]. The difference in sums of the two parts will be 3 - 1 = 2.
The minimum difference between sums of the two parts is min(-1,1,2) = -1. 
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [7,9,5,8,1,3]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> Here n = 2. So we must remove 2 elements and divide the remaining array into two parts containing two elements each.
If we remove nums[2] = 5 and nums[3] = 8, the resultant array will be [7,9,1,3]. The difference in sums will be (7+9) - (1+3) = 12.
To obtain the minimum difference, we should remove nums[1] = 9 and nums[4] = 1. The resultant array becomes [7,5,8,3]. The difference in sums of the two parts is (7+5) - (8+3) = 1.
It can be shown that it is not possible to obtain a difference smaller than 1.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">nums.length == 3 * n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>