<h2><a href="https://leetcode.com/problems/maximum-points-in-an-archery-competition/">2212. Maximum Points in an Archery Competition</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Alice and Bob are opponents in an archery competition. The competition has set the following rules:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">Alice first shoots <code style="user-select: auto;">numArrows</code> arrows and then Bob shoots <code style="user-select: auto;">numArrows</code> arrows.</li>
	<li style="user-select: auto;">The points are then calculated as follows:
	<ol style="user-select: auto;">
		<li style="user-select: auto;">The target has integer scoring sections ranging from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">11</code> <strong style="user-select: auto;">inclusive</strong>.</li>
		<li style="user-select: auto;">For <strong style="user-select: auto;">each</strong> section of the target with score <code style="user-select: auto;">k</code> (in between <code style="user-select: auto;">0</code> to <code style="user-select: auto;">11</code>), say Alice and Bob have shot <code style="user-select: auto;">a<sub style="user-select: auto;">k</sub></code> and <code style="user-select: auto;">b<sub style="user-select: auto;">k</sub></code> arrows on that section respectively. If <code style="user-select: auto;">a<sub style="user-select: auto;">k</sub> &gt;= b<sub style="user-select: auto;">k</sub></code>, then Alice takes <code style="user-select: auto;">k</code> points. If <code style="user-select: auto;">a<sub style="user-select: auto;">k</sub> &lt; b<sub style="user-select: auto;">k</sub></code>, then Bob takes <code style="user-select: auto;">k</code> points.</li>
		<li style="user-select: auto;">However, if <code style="user-select: auto;">a<sub style="user-select: auto;">k</sub> == b<sub style="user-select: auto;">k</sub> == 0</code>, then <strong style="user-select: auto;">nobody</strong> takes <code style="user-select: auto;">k</code> points.</li>
	</ol>
	</li>
</ol>

<ul style="user-select: auto;">
	<li style="user-select: auto;">
	<p style="user-select: auto;">For example, if Alice and Bob both shot <code style="user-select: auto;">2</code> arrows on the section with score <code style="user-select: auto;">11</code>, then Alice takes <code style="user-select: auto;">11</code> points. On the other hand, if Alice shot <code style="user-select: auto;">0</code> arrows on the section with score <code style="user-select: auto;">11</code> and Bob shot <code style="user-select: auto;">2</code> arrows on that same section, then Bob takes <code style="user-select: auto;">11</code> points.</p>
	</li>
</ul>

<p style="user-select: auto;">You are given the integer <code style="user-select: auto;">numArrows</code> and an integer array <code style="user-select: auto;">aliceArrows</code> of size <code style="user-select: auto;">12</code>, which represents the number of arrows Alice shot on each scoring section from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">11</code>. Now, Bob wants to <strong style="user-select: auto;">maximize</strong> the total number of points he can obtain.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the array </em><code style="user-select: auto;">bobArrows</code><em style="user-select: auto;"> which represents the number of arrows Bob shot on <strong style="user-select: auto;">each</strong> scoring section from </em><code style="user-select: auto;">0</code><em style="user-select: auto;"> to </em><code style="user-select: auto;">11</code>. The sum of the values in <code style="user-select: auto;">bobArrows</code> should equal <code style="user-select: auto;">numArrows</code>.</p>

<p style="user-select: auto;">If there are multiple ways for Bob to earn the maximum total points, return <strong style="user-select: auto;">any</strong> one of them.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/02/24/ex1.jpg" style="width: 600px; height: 120px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> numArrows = 9, aliceArrows = [1,1,0,1,0,0,2,1,0,1,2,0]
<strong style="user-select: auto;">Output:</strong> [0,0,0,0,1,1,0,0,1,2,3,1]
<strong style="user-select: auto;">Explanation:</strong> The table above shows how the competition is scored. 
Bob earns a total point of 4 + 5 + 8 + 9 + 10 + 11 = 47.
It can be shown that Bob cannot obtain a score higher than 47 points.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/02/24/ex2new.jpg" style="width: 600px; height: 117px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> numArrows = 3, aliceArrows = [0,0,1,0,0,0,0,0,0,0,0,2]
<strong style="user-select: auto;">Output:</strong> [0,0,0,0,0,0,0,0,1,1,1,0]
<strong style="user-select: auto;">Explanation:</strong> The table above shows how the competition is scored.
Bob earns a total point of 8 + 9 + 10 = 27.
It can be shown that Bob cannot obtain a score higher than 27 points.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= numArrows &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">aliceArrows.length == bobArrows.length == 12</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= aliceArrows[i], bobArrows[i] &lt;= numArrows</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">sum(aliceArrows[i]) == numArrows</code></li>
</ul>
</div>