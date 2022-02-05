<h2><a href="https://leetcode.com/problems/distinct-subsequences/">115. Distinct Subsequences</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given two strings <code style="user-select: auto;">s</code> and <code style="user-select: auto;">t</code>, return <em style="user-select: auto;">the number of distinct subsequences of <code style="user-select: auto;">s</code> which equals <code style="user-select: auto;">t</code></em>.</p>

<p style="user-select: auto;">A string's <strong style="user-select: auto;">subsequence</strong> is a new string formed from the original string by deleting some (can be none) of the characters without disturbing the remaining characters' relative positions. (i.e., <code style="user-select: auto;">"ACE"</code> is a subsequence of <code style="user-select: auto;">"ABCDE"</code> while <code style="user-select: auto;">"AEC"</code> is not).</p>

<p style="user-select: auto;">The test cases are generated so that the answer fits on a 32-bit signed integer.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "rabbbit", t = "rabbit"
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong>
As shown below, there are 3 ways you can generate "rabbit" from S.
<code style="user-select: auto;"><strong style="user-select: auto;"><u style="user-select: auto;">rabb</u></strong>b<strong style="user-select: auto;"><u style="user-select: auto;">it</u></strong></code>
<code style="user-select: auto;"><strong style="user-select: auto;"><u style="user-select: auto;">ra</u></strong>b<strong style="user-select: auto;"><u style="user-select: auto;">bbit</u></strong></code>
<code style="user-select: auto;"><strong style="user-select: auto;"><u style="user-select: auto;">rab</u></strong>b<strong style="user-select: auto;"><u style="user-select: auto;">bit</u></strong></code>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "babgbag", t = "bag"
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong>
As shown below, there are 5 ways you can generate "bag" from S.
<code style="user-select: auto;"><strong style="user-select: auto;"><u style="user-select: auto;">ba</u></strong>b<u style="user-select: auto;"><strong style="user-select: auto;">g</strong></u>bag</code>
<code style="user-select: auto;"><strong style="user-select: auto;"><u style="user-select: auto;">ba</u></strong>bgba<strong style="user-select: auto;"><u style="user-select: auto;">g</u></strong></code>
<code style="user-select: auto;"><u style="user-select: auto;"><strong style="user-select: auto;">b</strong></u>abgb<strong style="user-select: auto;"><u style="user-select: auto;">ag</u></strong></code>
<code style="user-select: auto;">ba<u style="user-select: auto;"><strong style="user-select: auto;">b</strong></u>gb<u style="user-select: auto;"><strong style="user-select: auto;">ag</strong></u></code>
<code style="user-select: auto;">babg<strong style="user-select: auto;"><u style="user-select: auto;">bag</u></strong></code></pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length, t.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> and <code style="user-select: auto;">t</code> consist of English letters.</li>
</ul>
</div>