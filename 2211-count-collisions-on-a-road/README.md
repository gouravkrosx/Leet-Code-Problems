<h2><a href="https://leetcode.com/problems/count-collisions-on-a-road/">2211. Count Collisions on a Road</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There are <code style="user-select: auto;">n</code> cars on an infinitely long road. The cars are numbered from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">n - 1</code> from left to right and each car is present at a <strong style="user-select: auto;">unique</strong> point.</p>

<p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> string <code style="user-select: auto;">directions</code> of length <code style="user-select: auto;">n</code>. <code style="user-select: auto;">directions[i]</code> can be either <code style="user-select: auto;">'L'</code>, <code style="user-select: auto;">'R'</code>, or <code style="user-select: auto;">'S'</code> denoting whether the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> car is moving towards the <strong style="user-select: auto;">left</strong>, towards the <strong style="user-select: auto;">right</strong>, or <strong style="user-select: auto;">staying</strong> at its current point respectively. Each moving car has the <strong style="user-select: auto;">same speed</strong>.</p>

<p style="user-select: auto;">The number of collisions can be calculated as follows:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">When two cars moving in <strong style="user-select: auto;">opposite</strong> directions collide with each other, the number of collisions increases by <code style="user-select: auto;">2</code>.</li>
	<li style="user-select: auto;">When a moving car collides with a stationary car, the number of collisions increases by <code style="user-select: auto;">1</code>.</li>
</ul>

<p style="user-select: auto;">After a collision, the cars involved can no longer move and will stay at the point where they collided. Other than that, cars cannot change their state or direction of motion.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">total number of collisions</strong> that will happen on the road</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> directions = "RLRSLL"
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong>
The collisions that will happen on the road are:
- Cars 0 and 1 will collide with each other. Since they are moving in opposite directions, the number of collisions becomes 0 + 2 = 2.
- Cars 2 and 3 will collide with each other. Since car 3 is stationary, the number of collisions becomes 2 + 1 = 3.
- Cars 3 and 4 will collide with each other. Since car 3 is stationary, the number of collisions becomes 3 + 1 = 4.
- Cars 4 and 5 will collide with each other. After car 4 collides with car 3, it will stay at the point of collision and get hit by car 5. The number of collisions becomes 4 + 1 = 5.
Thus, the total number of collisions that will happen on the road is 5. 
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> directions = "LLRR"
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong>
No cars will collide with each other. Thus, the total number of collisions that will happen on the road is 0.</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= directions.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">directions[i]</code> is either <code style="user-select: auto;">'L'</code>, <code style="user-select: auto;">'R'</code>, or <code style="user-select: auto;">'S'</code>.</li>
</ul>
</div>