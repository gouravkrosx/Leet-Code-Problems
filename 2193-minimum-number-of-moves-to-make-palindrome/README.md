<h2><a href="https://leetcode.com/problems/minimum-number-of-moves-to-make-palindrome/">2193. Minimum Number of Moves to Make Palindrome</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a string <code style="user-select: auto;">s</code> consisting only of lowercase English letters.</p>

<p style="user-select: auto;">In one <strong style="user-select: auto;">move</strong>, you can select any two <strong style="user-select: auto;">adjacent</strong> characters of <code style="user-select: auto;">s</code> and swap them.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum number of moves</strong> needed to make</em> <code style="user-select: auto;">s</code> <em style="user-select: auto;">a palindrome</em>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note</strong> that the input will be generated such that <code style="user-select: auto;">s</code> can always be converted to a palindrome.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "aabb"
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong>
We can obtain two palindromes from s, "abba" and "baab". 
- We can obtain "abba" from s in 2 moves: "a<u style="user-select: auto;"><strong style="user-select: auto;">ab</strong></u>b" -&gt; "ab<u style="user-select: auto;"><strong style="user-select: auto;">ab</strong></u>" -&gt; "abba".
- We can obtain "baab" from s in 2 moves: "a<u style="user-select: auto;"><strong style="user-select: auto;">ab</strong></u>b" -&gt; "<u style="user-select: auto;"><strong style="user-select: auto;">ab</strong></u>ab" -&gt; "baab".
Thus, the minimum number of moves needed to make s a palindrome is 2.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "letelt"
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong>
One of the palindromes we can obtain from s in 2 moves is "lettel".
One of the ways we can obtain it is "lete<u style="user-select: auto;"><strong style="user-select: auto;">lt</strong></u>" -&gt; "let<u style="user-select: auto;"><strong style="user-select: auto;">et</strong></u>l" -&gt; "lettel".
Other palindromes such as "tleelt" can also be obtained in 2 moves.
It can be shown that it is not possible to obtain a palindrome in less than 2 moves.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 2000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> consists only of lowercase English letters.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> can be converted to a palindrome using a finite number of moves.</li>
</ul>
</div>