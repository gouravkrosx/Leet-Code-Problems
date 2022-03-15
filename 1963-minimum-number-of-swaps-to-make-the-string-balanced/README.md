<h2><a href="https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/">1963. Minimum Number of Swaps to Make the String Balanced</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> string <code style="user-select: auto;">s</code> of <strong style="user-select: auto;">even</strong> length <code style="user-select: auto;">n</code>. The string consists of <strong style="user-select: auto;">exactly</strong> <code style="user-select: auto;">n / 2</code> opening brackets <code style="user-select: auto;">'['</code> and <code style="user-select: auto;">n / 2</code> closing brackets <code style="user-select: auto;">']'</code>.</p>

<p style="user-select: auto;">A string is called <strong style="user-select: auto;">balanced</strong> if and only if:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">It is the empty string, or</li>
	<li style="user-select: auto;">It can be written as <code style="user-select: auto;">AB</code>, where both <code style="user-select: auto;">A</code> and <code style="user-select: auto;">B</code> are <strong style="user-select: auto;">balanced</strong> strings, or</li>
	<li style="user-select: auto;">It can be written as <code style="user-select: auto;">[C]</code>, where <code style="user-select: auto;">C</code> is a <strong style="user-select: auto;">balanced</strong> string.</li>
</ul>

<p style="user-select: auto;">You may swap the brackets at <strong style="user-select: auto;">any</strong> two indices <strong style="user-select: auto;">any</strong> number of times.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum</strong> number of swaps to make </em><code style="user-select: auto;">s</code> <em style="user-select: auto;"><strong style="user-select: auto;">balanced</strong></em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "][]["
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> You can make the string balanced by swapping index 0 with index 3.
The resulting string is "[[]]".
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "]]][[["
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> You can do the following to make the string balanced:
- Swap index 0 with index 4. s = "[]][][".
- Swap index 1 with index 5. s = "[[][]]".
The resulting string is "[[][]]".
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "[]"
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> The string is already balanced.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == s.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= n &lt;= 10<sup style="user-select: auto;">6</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n</code> is even.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">s[i]</code> is either <code style="user-select: auto;">'[' </code>or <code style="user-select: auto;">']'</code>.</li>
	<li style="user-select: auto;">The number of opening brackets <code style="user-select: auto;">'['</code> equals <code style="user-select: auto;">n / 2</code>, and the number of closing brackets <code style="user-select: auto;">']'</code> equals <code style="user-select: auto;">n / 2</code>.</li>
</ul>
</div>