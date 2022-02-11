<h2><a href="https://leetcode.com/problems/cheapest-flights-within-k-stops/">787. Cheapest Flights Within K Stops</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There are <code style="user-select: auto;">n</code> cities connected by some number of flights. You are given an array <code style="user-select: auto;">flights</code> where <code style="user-select: auto;">flights[i] = [from<sub style="user-select: auto;">i</sub>, to<sub style="user-select: auto;">i</sub>, price<sub style="user-select: auto;">i</sub>]</code> indicates that there is a flight from city <code style="user-select: auto;">from<sub style="user-select: auto;">i</sub></code> to city <code style="user-select: auto;">to<sub style="user-select: auto;">i</sub></code> with cost <code style="user-select: auto;">price<sub style="user-select: auto;">i</sub></code>.</p>

<p style="user-select: auto;">You are also given three integers <code style="user-select: auto;">src</code>, <code style="user-select: auto;">dst</code>, and <code style="user-select: auto;">k</code>, return <em style="user-select: auto;"><strong style="user-select: auto;">the cheapest price</strong> from </em><code style="user-select: auto;">src</code><em style="user-select: auto;"> to </em><code style="user-select: auto;">dst</code><em style="user-select: auto;"> with at most </em><code style="user-select: auto;">k</code><em style="user-select: auto;"> stops. </em>If there is no such route, return<em style="user-select: auto;"> </em><code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/02/16/995.png" style="height: 360px; width: 492px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
<strong style="user-select: auto;">Output:</strong> 200
<strong style="user-select: auto;">Explanation:</strong> The graph is shown.
The cheapest price from city <code style="user-select: auto;">0</code> to city <code style="user-select: auto;">2</code> with at most 1 stop costs 200, as marked red in the picture.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/02/16/995.png" style="height: 360px; width: 492px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0
<strong style="user-select: auto;">Output:</strong> 500
<strong style="user-select: auto;">Explanation:</strong> The graph is shown.
The cheapest price from city <code style="user-select: auto;">0</code> to city <code style="user-select: auto;">2</code> with at most 0 stop costs 500, as marked blue in the picture.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= flights.length &lt;= (n * (n - 1) / 2)</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">flights[i].length == 3</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= from<sub style="user-select: auto;">i</sub>, to<sub style="user-select: auto;">i</sub> &lt; n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">from<sub style="user-select: auto;">i</sub> != to<sub style="user-select: auto;">i</sub></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= price<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;">There will not be any multiple flights between two cities.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= src, dst, k &lt; n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">src != dst</code></li>
</ul>
</div>