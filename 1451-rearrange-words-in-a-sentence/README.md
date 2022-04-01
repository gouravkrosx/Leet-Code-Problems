<h2><a href="https://leetcode.com/problems/rearrange-words-in-a-sentence/">1451. Rearrange Words in a Sentence</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a sentence&nbsp;<code style="user-select: auto;">text</code> (A&nbsp;<em style="user-select: auto;">sentence</em>&nbsp;is a string of space-separated words) in the following format:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">First letter is in upper case.</li>
	<li style="user-select: auto;">Each word in <code style="user-select: auto;">text</code> are separated by a single space.</li>
</ul>

<p style="user-select: auto;">Your task is to rearrange the words in text such that&nbsp;all words are rearranged in an increasing order of their lengths. If two words have the same length, arrange them in their original order.</p>

<p style="user-select: auto;">Return the new text&nbsp;following the format shown above.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> text = "Leetcode is cool"
<strong style="user-select: auto;">Output:</strong> "Is cool leetcode"
<strong style="user-select: auto;">Explanation: </strong>There are 3 words, "Leetcode" of length 8, "is" of length 2 and "cool" of length 4.
Output is ordered by length and the new first word starts with capital letter.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> text = "Keep calm and code on"
<strong style="user-select: auto;">Output:</strong> "On and keep calm code"
<strong style="user-select: auto;">Explanation: </strong>Output is ordered as follows:
"On" 2 letters.
"and" 3 letters.
"keep" 4 letters in case of tie order by position in original text.
"calm" 4 letters.
"code" 4 letters.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> text = "To be or not to be"
<strong style="user-select: auto;">Output:</strong> "To be or to be not"
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">text</code> begins with a capital letter and then contains lowercase letters and single space between words.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= text.length &lt;= 10^5</code></li>
</ul>
</div>