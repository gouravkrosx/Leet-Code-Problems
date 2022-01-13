<h2><a href="https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/">452. Minimum Number of Arrows to Burst Balloons</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array <code style="user-select: auto;">points</code> where <code style="user-select: auto;">points[i] = [x<sub style="user-select: auto;">start</sub>, x<sub style="user-select: auto;">end</sub>]</code> denotes a balloon whose <strong style="user-select: auto;">horizontal diameter</strong> stretches between <code style="user-select: auto;">x<sub style="user-select: auto;">start</sub></code> and <code style="user-select: auto;">x<sub style="user-select: auto;">end</sub></code>. You do not know the exact y-coordinates of the balloons.</p>

<p style="user-select: auto;">Arrows can be shot up <strong style="user-select: auto;">directly vertically</strong> (in the positive y-direction) from different points along the x-axis. A balloon with <code style="user-select: auto;">x<sub style="user-select: auto;">start</sub></code> and <code style="user-select: auto;">x<sub style="user-select: auto;">end</sub></code> is <strong style="user-select: auto;">burst</strong> by an arrow shot at <code style="user-select: auto;">x</code> if <code style="user-select: auto;">x<sub style="user-select: auto;">start</sub> &lt;= x &lt;= x<sub style="user-select: auto;">end</sub></code>. There is <strong style="user-select: auto;">no limit</strong> to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.</p>

<p style="user-select: auto;">Given the array <code style="user-select: auto;">points</code>, return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum</strong> number of arrows that must be shot to burst all balloons</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> points = [[10,16],[2,8],[1,6],[7,12]]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
- Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> points = [[1,2],[3,4],[5,6],[7,8]]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong> One arrow needs to be shot for each balloon for a total of 4 arrows.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> points = [[1,2],[2,3],[3,4],[4,5]]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 2, bursting the balloons [1,2] and [2,3].
- Shoot an arrow at x = 4, bursting the balloons [3,4] and [4,5].
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= points.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">points[i].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-2<sup style="user-select: auto;">31</sup> &lt;= x<sub style="user-select: auto;">start</sub> &lt; x<sub style="user-select: auto;">end</sub> &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
</ul>
</div>