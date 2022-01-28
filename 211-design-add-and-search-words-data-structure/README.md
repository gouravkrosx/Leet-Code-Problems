<h2><a href="https://leetcode.com/problems/design-add-and-search-words-data-structure/">211. Design Add and Search Words Data Structure</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Design a data structure that supports adding new words and finding if a string matches any previously added string.</p>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">WordDictionary</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">WordDictionary()</code>&nbsp;Initializes the object.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">void addWord(word)</code> Adds <code style="user-select: auto;">word</code> to the data structure, it can be matched later.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">bool search(word)</code>&nbsp;Returns <code style="user-select: auto;">true</code> if there is any string in the data structure that matches <code style="user-select: auto;">word</code>&nbsp;or <code style="user-select: auto;">false</code> otherwise. <code style="user-select: auto;">word</code> may contain dots <code style="user-select: auto;">'.'</code> where dots can be matched with any letter.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
[[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
<strong style="user-select: auto;">Output</strong>
[null,null,null,null,false,true,true,true]

<strong style="user-select: auto;">Explanation</strong>
WordDictionary wordDictionary = new WordDictionary();
wordDictionary.addWord("bad");
wordDictionary.addWord("dad");
wordDictionary.addWord("mad");
wordDictionary.search("pad"); // return False
wordDictionary.search("bad"); // return True
wordDictionary.search(".ad"); // return True
wordDictionary.search("b.."); // return True
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= word.length &lt;= 500</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">word</code> in <code style="user-select: auto;">addWord</code> consists lower-case English letters.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">word</code> in <code style="user-select: auto;">search</code> consist of&nbsp; <code style="user-select: auto;">'.'</code> or lower-case English letters.</li>
	<li style="user-select: auto;">At most <code style="user-select: auto;">50000</code>&nbsp;calls will be made to <code style="user-select: auto;">addWord</code>&nbsp;and <code style="user-select: auto;">search</code>.</li>
</ul>
</div>