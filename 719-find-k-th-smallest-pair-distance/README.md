<h2><a href="https://leetcode.com/problems/find-k-th-smallest-pair-distance/">719. Find K-th Smallest Pair Distance</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">The <strong style="user-select: auto;">distance of a pair</strong> of integers <code style="user-select: auto;">a</code> and <code style="user-select: auto;">b</code> is defined as the absolute difference between <code style="user-select: auto;">a</code> and <code style="user-select: auto;">b</code>.</p>

<p style="user-select: auto;">Given an integer array <code style="user-select: auto;">nums</code> and an integer <code style="user-select: auto;">k</code>, return <em style="user-select: auto;">the</em> <code style="user-select: auto;">k<sup style="user-select: auto;">th</sup></code> <em style="user-select: auto;">smallest <strong style="user-select: auto;">distance among all the pairs</strong></em> <code style="user-select: auto;">nums[i]</code> <em style="user-select: auto;">and</em> <code style="user-select: auto;">nums[j]</code> <em style="user-select: auto;">where</em> <code style="user-select: auto;">0 &lt;= i &lt; j &lt; nums.length</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,3,1], k = 1
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> Here are all the pairs:
(1,3) -&gt; 2
(1,1) -&gt; 0
(3,1) -&gt; 2
Then the 1<sup style="user-select: auto;">st</sup> smallest distance pair is (1,1), and its distance is 0.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,1,1], k = 2
<strong style="user-select: auto;">Output:</strong> 0
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,6,1], k = 3
<strong style="user-select: auto;">Output:</strong> 5
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == nums.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= n &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">6</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= n * (n - 1) / 2</code></li>
</ul>
</div>