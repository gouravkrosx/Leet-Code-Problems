<h2><a href="https://leetcode.com/problems/stone-game-iv/">1510. Stone Game IV</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Alice and Bob take turns playing a game, with Alice starting first.</p>

<p style="user-select: auto;">Initially, there are <code style="user-select: auto;">n</code> stones in a pile. On each player's turn, that player makes a <em style="user-select: auto;">move</em> consisting of removing <strong style="user-select: auto;">any</strong> non-zero <strong style="user-select: auto;">square number</strong> of stones in the pile.</p>

<p style="user-select: auto;">Also, if a player cannot make a move, he/she loses the game.</p>

<p style="user-select: auto;">Given a positive integer <code style="user-select: auto;">n</code>, return <code style="user-select: auto;">true</code> if and only if Alice wins the game otherwise return <code style="user-select: auto;">false</code>, assuming both players play optimally.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 1
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation: </strong>Alice can remove 1 stone winning the game because Bob doesn't have any moves.</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 2
<strong style="user-select: auto;">Output:</strong> false
<strong style="user-select: auto;">Explanation: </strong>Alice can only remove 1 stone, after that Bob removes the last one winning the game (2 -&gt; 1 -&gt; 0).
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 4
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> n is already a perfect square, Alice can win with one move, removing 4 stones (4 -&gt; 0).
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>