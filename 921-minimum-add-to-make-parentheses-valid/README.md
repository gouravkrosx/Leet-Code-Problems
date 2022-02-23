<h2><a href="https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/">921. Minimum Add to Make Parentheses Valid</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">A parentheses string is valid if and only if:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">It is the empty string,</li>
	<li style="user-select: auto;">It can be written as <code style="user-select: auto;">AB</code> (<code style="user-select: auto;">A</code> concatenated with <code style="user-select: auto;">B</code>), where <code style="user-select: auto;">A</code> and <code style="user-select: auto;">B</code> are valid strings, or</li>
	<li style="user-select: auto;">It can be written as <code style="user-select: auto;">(A)</code>, where <code style="user-select: auto;">A</code> is a valid string.</li>
</ul>

<p style="user-select: auto;">You are given a parentheses string <code style="user-select: auto;">s</code>. In one move, you can insert a parenthesis at any position of the string.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, if <code style="user-select: auto;">s = "()))"</code>, you can insert an opening parenthesis to be <code style="user-select: auto;">"(<strong style="user-select: auto;">(</strong>)))"</code> or a closing parenthesis to be <code style="user-select: auto;">"())<strong style="user-select: auto;">)</strong>)"</code>.</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the minimum number of moves required to make </em><code style="user-select: auto;">s</code><em style="user-select: auto;"> valid</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "())"
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "((("
<strong style="user-select: auto;">Output:</strong> 3
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s[i]</code> is either <code style="user-select: auto;">'('</code> or <code style="user-select: auto;">')'</code>.</li>
</ul>
</div>