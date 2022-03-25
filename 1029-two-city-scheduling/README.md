<h2><a href="https://leetcode.com/problems/two-city-scheduling/">1029. Two City Scheduling</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">A company is planning to interview <code style="user-select: auto;">2n</code> people. Given the array <code style="user-select: auto;">costs</code> where <code style="user-select: auto;">costs[i] = [aCost<sub style="user-select: auto;">i</sub>, bCost<sub style="user-select: auto;">i</sub>]</code>,&nbsp;the cost of flying the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> person to city <code style="user-select: auto;">a</code> is <code style="user-select: auto;">aCost<sub style="user-select: auto;">i</sub></code>, and the cost of flying the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> person to city <code style="user-select: auto;">b</code> is <code style="user-select: auto;">bCost<sub style="user-select: auto;">i</sub></code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the minimum cost to fly every person to a city</em> such that exactly <code style="user-select: auto;">n</code> people arrive in each city.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> costs = [[10,20],[30,200],[400,50],[30,20]]
<strong style="user-select: auto;">Output:</strong> 110
<strong style="user-select: auto;">Explanation: </strong>
The first person goes to city A for a cost of 10.
The second person goes to city A for a cost of 30.
The third person goes to city B for a cost of 50.
The fourth person goes to city B for a cost of 20.

The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> costs = [[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]]
<strong style="user-select: auto;">Output:</strong> 1859
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> costs = [[515,563],[451,713],[537,709],[343,819],[855,779],[457,60],[650,359],[631,42]]
<strong style="user-select: auto;">Output:</strong> 3086
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 * n == costs.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= costs.length &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">costs.length</code> is even.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= aCost<sub style="user-select: auto;">i</sub>, bCost<sub style="user-select: auto;">i</sub> &lt;= 1000</code></li>
</ul>
</div>