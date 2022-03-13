<h2><a href="https://leetcode.com/problems/word-break-ii/">140. Word Break II</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a string <code style="user-select: auto;">s</code> and a dictionary of strings <code style="user-select: auto;">wordDict</code>, add spaces in <code style="user-select: auto;">s</code> to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in <strong style="user-select: auto;">any order</strong>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note</strong> that the same word in the dictionary may be reused multiple times in the segmentation.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
<strong style="user-select: auto;">Output:</strong> ["cats and dog","cat sand dog"]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
<strong style="user-select: auto;">Output:</strong> ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
<strong style="user-select: auto;">Explanation:</strong> Note that you are allowed to reuse a dictionary word.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
<strong style="user-select: auto;">Output:</strong> []
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 20</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= wordDict.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= wordDict[i].length &lt;= 10</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> and <code style="user-select: auto;">wordDict[i]</code> consist of only lowercase English letters.</li>
	<li style="user-select: auto;">All the strings of <code style="user-select: auto;">wordDict</code> are <strong style="user-select: auto;">unique</strong>.</li>
</ul>
</div>