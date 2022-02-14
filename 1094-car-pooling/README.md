<h2><a href="https://leetcode.com/problems/car-pooling/">1094. Car Pooling</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There is a car with <code style="user-select: auto;">capacity</code> empty seats. The vehicle only drives east (i.e., it cannot turn around and drive west).</p>

<p style="user-select: auto;">You are given the integer <code style="user-select: auto;">capacity</code> and an array <code style="user-select: auto;">trips</code> where <code style="user-select: auto;">trips[i] = [numPassengers<sub style="user-select: auto;">i</sub>, from<sub style="user-select: auto;">i</sub>, to<sub style="user-select: auto;">i</sub>]</code> indicates that the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> trip has <code style="user-select: auto;">numPassengers<sub style="user-select: auto;">i</sub></code> passengers and the locations to pick them up and drop them off are <code style="user-select: auto;">from<sub style="user-select: auto;">i</sub></code> and <code style="user-select: auto;">to<sub style="user-select: auto;">i</sub></code> respectively. The locations are given as the number of kilometers due east from the car's initial location.</p>

<p style="user-select: auto;">Return <code style="user-select: auto;">true</code><em style="user-select: auto;"> if it is possible to pick up and drop off all passengers for all the given trips, or </em><code style="user-select: auto;">false</code><em style="user-select: auto;"> otherwise</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> trips = [[2,1,5],[3,3,7]], capacity = 4
<strong style="user-select: auto;">Output:</strong> false
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> trips = [[2,1,5],[3,3,7]], capacity = 5
<strong style="user-select: auto;">Output:</strong> true
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= trips.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">trips[i].length == 3</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= numPassengers<sub style="user-select: auto;">i</sub> &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= from<sub style="user-select: auto;">i</sub> &lt; to<sub style="user-select: auto;">i</sub> &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= capacity &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>