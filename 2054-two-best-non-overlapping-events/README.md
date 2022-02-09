<h2><a href="https://leetcode.com/problems/two-best-non-overlapping-events/">2054. Two Best Non-Overlapping Events</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> 2D integer array of <code style="user-select: auto;">events</code> where <code style="user-select: auto;">events[i] = [startTime<sub style="user-select: auto;">i</sub>, endTime<sub style="user-select: auto;">i</sub>, value<sub style="user-select: auto;">i</sub>]</code>. The <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> event starts at <code style="user-select: auto;">startTime<sub style="user-select: auto;">i</sub></code><sub style="user-select: auto;"> </sub>and ends at <code style="user-select: auto;">endTime<sub style="user-select: auto;">i</sub></code>, and if you attend this event, you will receive a value of <code style="user-select: auto;">value<sub style="user-select: auto;">i</sub></code>. You can choose <strong style="user-select: auto;">at most</strong> <strong style="user-select: auto;">two</strong> <strong style="user-select: auto;">non-overlapping</strong> events to attend such that the sum of their values is <strong style="user-select: auto;">maximized</strong>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">this <strong style="user-select: auto;">maximum</strong> sum.</em></p>

<p style="user-select: auto;">Note that the start time and end time is <strong style="user-select: auto;">inclusive</strong>: that is, you cannot attend two events where one of them starts and the other ends at the same time. More specifically, if you attend an event with end time <code style="user-select: auto;">t</code>, the next event must start at or after <code style="user-select: auto;">t + 1</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/09/21/picture5.png" style="width: 400px; height: 75px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> events = [[1,3,2],[4,5,2],[2,4,3]]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation: </strong>Choose the green events, 0 and 1 for a sum of 2 + 2 = 4.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="Example 1 Diagram" src="https://assets.leetcode.com/uploads/2021/09/21/picture1.png" style="width: 400px; height: 77px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> events = [[1,3,2],[4,5,2],[1,5,5]]
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation: </strong>Choose event 2 for a sum of 5.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/09/21/picture3.png" style="width: 400px; height: 66px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> events = [[1,5,3],[1,5,1],[6,6,5]]
<strong style="user-select: auto;">Output:</strong> 8
<strong style="user-select: auto;">Explanation: </strong>Choose events 0 and 2 for a sum of 3 + 5 = 8.</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= events.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">events[i].length == 3</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= startTime<sub style="user-select: auto;">i</sub> &lt;= endTime<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= value<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">6</sup></code></li>
</ul>
</div>