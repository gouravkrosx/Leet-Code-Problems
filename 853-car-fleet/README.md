<h2><a href="https://leetcode.com/problems/car-fleet/">853. Car Fleet</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There are <code style="user-select: auto;">n</code> cars going to the same destination along a one-lane road. The destination is <code style="user-select: auto;">target</code> miles away.</p>

<p style="user-select: auto;">You are given two integer array <code style="user-select: auto;">position</code> and <code style="user-select: auto;">speed</code>, both of length <code style="user-select: auto;">n</code>, where <code style="user-select: auto;">position[i]</code> is the position of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> car and <code style="user-select: auto;">speed[i]</code> is the speed of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> car (in miles per hour).</p>

<p style="user-select: auto;">A car can never pass another car ahead of it, but it can catch up to it&nbsp;and drive bumper to bumper <strong style="user-select: auto;">at the same speed</strong>. The faster car will <strong style="user-select: auto;">slow down</strong> to match the slower car's speed. The distance between these two cars is ignored (i.e., they are assumed to have the same position).</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">car fleet</strong> is some non-empty set of cars driving at the same position and same speed. Note that a single car is also a car fleet.</p>

<p style="user-select: auto;">If a car catches up to a car fleet right at the destination point, it will still be considered as one car fleet.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">number of car fleets</strong> that will arrive at the destination</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong>
The cars starting at 10 (speed 2) and 8 (speed 4) become a fleet, meeting each other at 12.
The car starting at 0 does not catch up to any other car, so it is a fleet by itself.
The cars starting at 5 (speed 1) and 3 (speed 3) become a fleet, meeting each other at 6. The fleet moves at speed 1 until it reaches target.
Note that no other cars meet these fleets before the destination, so the answer is 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> target = 10, position = [3], speed = [3]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> There is only one car, hence there is only one fleet.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> target = 100, position = [0,2,4], speed = [4,2,1]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong>
The cars starting at 0 (speed 4) and 2 (speed 2) become a fleet, meeting each other at 4. The fleet moves at speed 2.
Then, the fleet (speed 2) and the car starting at 4 (speed 1) become one fleet, meeting each other at 6. The fleet moves at speed 1 until it reaches target.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == position.length == speed.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt; target &lt;= 10<sup style="user-select: auto;">6</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= position[i] &lt; target</code></li>
	<li style="user-select: auto;">All the values of <code style="user-select: auto;">position</code> are <strong style="user-select: auto;">unique</strong>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt; speed[i] &lt;= 10<sup style="user-select: auto;">6</sup></code></li>
</ul>
</div>