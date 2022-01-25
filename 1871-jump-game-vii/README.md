<h2><a href="https://leetcode.com/problems/jump-game-vii/">1871. Jump Game VII</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> binary string <code style="user-select: auto;">s</code> and two integers <code style="user-select: auto;">minJump</code> and <code style="user-select: auto;">maxJump</code>. In the beginning, you are standing at index <code style="user-select: auto;">0</code>, which is equal to <code style="user-select: auto;">'0'</code>. You can move from index <code style="user-select: auto;">i</code> to index <code style="user-select: auto;">j</code> if the following conditions are fulfilled:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">i + minJump &lt;= j &lt;= min(i + maxJump, s.length - 1)</code>, and</li>
	<li style="user-select: auto;"><code style="user-select: auto;">s[j] == '0'</code>.</li>
</ul>

<p style="user-select: auto;">Return <code style="user-select: auto;">true</code><i style="user-select: auto;"> if you can reach index </i><code style="user-select: auto;">s.length - 1</code><i style="user-select: auto;"> in </i><code style="user-select: auto;">s</code><em style="user-select: auto;">, or </em><code style="user-select: auto;">false</code><em style="user-select: auto;"> otherwise.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "<u style="user-select: auto;">0</u>11<u style="user-select: auto;">0</u>1<u style="user-select: auto;">0</u>", minJump = 2, maxJump = 3
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong>
In the first step, move from index 0 to index 3. 
In the second step, move from index 3 to index 5.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "01101110", minJump = 2, maxJump = 3
<strong style="user-select: auto;">Output:</strong> false
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= s.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s[i]</code> is either <code style="user-select: auto;">'0'</code> or <code style="user-select: auto;">'1'</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">s[0] == '0'</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= minJump &lt;= maxJump &lt; s.length</code></li>
</ul>
</div>