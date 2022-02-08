<h2><a href="https://leetcode.com/problems/longest-happy-string/">1405. Longest Happy String</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">A string <code style="user-select: auto;">s</code> is called <strong style="user-select: auto;">happy</strong> if it satisfies the following conditions:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> only contains the letters <code style="user-select: auto;">'a'</code>, <code style="user-select: auto;">'b'</code>, and <code style="user-select: auto;">'c'</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> does not contain any of <code style="user-select: auto;">"aaa"</code>, <code style="user-select: auto;">"bbb"</code>, or <code style="user-select: auto;">"ccc"</code> as a substring.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> contains <strong style="user-select: auto;">at most</strong> <code style="user-select: auto;">a</code> occurrences of the letter <code style="user-select: auto;">'a'</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> contains <strong style="user-select: auto;">at most</strong> <code style="user-select: auto;">b</code> occurrences of the letter <code style="user-select: auto;">'b'</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> contains <strong style="user-select: auto;">at most</strong> <code style="user-select: auto;">c</code> occurrences of the letter <code style="user-select: auto;">'c'</code>.</li>
</ul>

<p style="user-select: auto;">Given three integers <code style="user-select: auto;">a</code>, <code style="user-select: auto;">b</code>, and <code style="user-select: auto;">c</code>, return <em style="user-select: auto;">the <strong style="user-select: auto;">longest possible happy </strong>string</em>. If there are multiple longest happy strings, return <em style="user-select: auto;">any of them</em>. If there is no such string, return <em style="user-select: auto;">the empty string </em><code style="user-select: auto;">""</code>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">substring</strong> is a contiguous sequence of characters within a string.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> a = 1, b = 1, c = 7
<strong style="user-select: auto;">Output:</strong> "ccaccbcc"
<strong style="user-select: auto;">Explanation:</strong> "ccbccacc" would also be a correct answer.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> a = 7, b = 1, c = 0
<strong style="user-select: auto;">Output:</strong> "aabaa"
<strong style="user-select: auto;">Explanation:</strong> It is the only correct answer in this case.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= a, b, c &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">a + b + c &gt; 0</code></li>
</ul>
</div>