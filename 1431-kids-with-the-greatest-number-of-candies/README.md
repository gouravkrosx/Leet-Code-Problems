<h2><a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/">1431. Kids With the Greatest Number of Candies</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There are <code style="user-select: auto;">n</code> kids with candies. You are given an integer array <code style="user-select: auto;">candies</code>, where each <code style="user-select: auto;">candies[i]</code> represents the number of candies the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> kid has, and an integer <code style="user-select: auto;">extraCandies</code>, denoting the number of extra candies that you have.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">a boolean array </em><code style="user-select: auto;">result</code><em style="user-select: auto;"> of length </em><code style="user-select: auto;">n</code><em style="user-select: auto;">, where </em><code style="user-select: auto;">result[i]</code><em style="user-select: auto;"> is </em><code style="user-select: auto;">true</code><em style="user-select: auto;"> if, after giving the </em><code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code><em style="user-select: auto;"> kid all the </em><code style="user-select: auto;">extraCandies</code><em style="user-select: auto;">, they will have the <strong style="user-select: auto;">greatest</strong> number of candies among all the kids</em><em style="user-select: auto;">, or </em><code style="user-select: auto;">false</code><em style="user-select: auto;"> otherwise</em>.</p>

<p style="user-select: auto;">Note that <strong style="user-select: auto;">multiple</strong> kids can have the <strong style="user-select: auto;">greatest</strong> number of candies.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> candies = [2,3,5,1,3], extraCandies = 3
<strong style="user-select: auto;">Output:</strong> [true,true,true,false,true] 
<strong style="user-select: auto;">Explanation:</strong> If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> candies = [4,2,1,1,2], extraCandies = 1
<strong style="user-select: auto;">Output:</strong> [true,false,false,false,false] 
<strong style="user-select: auto;">Explanation:</strong> There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> candies = [12,1,12], extraCandies = 10
<strong style="user-select: auto;">Output:</strong> [true,false,true]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == candies.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= n &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= candies[i] &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= extraCandies &lt;= 50</code></li>
</ul>
</div>