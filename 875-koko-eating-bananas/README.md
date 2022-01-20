<h2><a href="https://leetcode.com/problems/koko-eating-bananas/">875. Koko Eating Bananas</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Koko loves to eat bananas. There are <code style="user-select: auto;">n</code> piles of bananas, the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> pile has <code style="user-select: auto;">piles[i]</code> bananas. The guards have gone and will come back in <code style="user-select: auto;">h</code> hours.</p>

<p style="user-select: auto;">Koko can decide her bananas-per-hour eating speed of <code style="user-select: auto;">k</code>. Each hour, she chooses some pile of bananas and eats <code style="user-select: auto;">k</code> bananas from that pile. If the pile has less than <code style="user-select: auto;">k</code> bananas, she eats all of them instead and will not eat any more bananas during this hour.</p>

<p style="user-select: auto;">Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the minimum integer</em> <code style="user-select: auto;">k</code> <em style="user-select: auto;">such that she can eat all the bananas within</em> <code style="user-select: auto;">h</code> <em style="user-select: auto;">hours</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> piles = [3,6,7,11], h = 8
<strong style="user-select: auto;">Output:</strong> 4
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> piles = [30,11,23,4,20], h = 5
<strong style="user-select: auto;">Output:</strong> 30
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> piles = [30,11,23,4,20], h = 6
<strong style="user-select: auto;">Output:</strong> 23
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= piles.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">piles.length &lt;= h &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= piles[i] &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
</ul>
</div>