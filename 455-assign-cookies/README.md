<h2><a href="https://leetcode.com/problems/assign-cookies/">455. Assign Cookies</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.</p>

<p style="user-select: auto;">Each child <code style="user-select: auto;">i</code> has a greed factor <code style="user-select: auto;">g[i]</code>, which is the minimum size of a cookie that the child will be content with; and each cookie <code style="user-select: auto;">j</code> has a size <code style="user-select: auto;">s[j]</code>. If <code style="user-select: auto;">s[j] &gt;= g[i]</code>, we can assign the cookie <code style="user-select: auto;">j</code> to the child <code style="user-select: auto;">i</code>, and the child <code style="user-select: auto;">i</code> will be content. Your goal is to maximize the number of your content children and output the maximum number.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> g = [1,2,3], s = [1,1]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> g = [1,2], s = [1,2,3]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
You have 3 cookies and their sizes are big enough to gratify all of the children, 
You need to output 2.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= g.length &lt;= 3 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= s.length &lt;= 3 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= g[i], s[j] &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
</ul>
</div>