<h2><a href="https://leetcode.com/problems/maximum-product-of-the-length-of-two-palindromic-subsequences/">2002. Maximum Product of the Length of Two Palindromic Subsequences</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a string <code style="user-select: auto;">s</code>, find two <strong style="user-select: auto;">disjoint palindromic subsequences</strong> of <code style="user-select: auto;">s</code> such that the <strong style="user-select: auto;">product</strong> of their lengths is <strong style="user-select: auto;">maximized</strong>. The two subsequences are <strong style="user-select: auto;">disjoint</strong> if they do not both pick a character at the same index.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">maximum</strong> possible <strong style="user-select: auto;">product</strong> of the lengths of the two palindromic subsequences</em>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">subsequence</strong> is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters. A string is <strong style="user-select: auto;">palindromic</strong> if it reads the same forward and backward.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="example-1" src="https://assets.leetcode.com/uploads/2021/08/24/two-palindromic-subsequences.png" style="width: 550px; height: 124px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "leetcodecom"
<strong style="user-select: auto;">Output:</strong> 9
<strong style="user-select: auto;">Explanation</strong>: An optimal solution is to choose "ete" for the 1<sup style="user-select: auto;">st</sup> subsequence and "cdc" for the 2<sup style="user-select: auto;">nd</sup> subsequence.
The product of their lengths is: 3 * 3 = 9.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "bb"
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation</strong>: An optimal solution is to choose "b" (the first character) for the 1<sup style="user-select: auto;">st</sup> subsequence and "b" (the second character) for the 2<sup style="user-select: auto;">nd</sup> subsequence.
The product of their lengths is: 1 * 1 = 1.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "accbcaxxcxx"
<strong style="user-select: auto;">Output:</strong> 25
<strong style="user-select: auto;">Explanation</strong>: An optimal solution is to choose "accca" for the 1<sup style="user-select: auto;">st</sup> subsequence and "xxcxx" for the 2<sup style="user-select: auto;">nd</sup> subsequence.
The product of their lengths is: 5 * 5 = 25.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= s.length &lt;= 12</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> consists of lowercase English letters only.</li>
</ul>
</div>