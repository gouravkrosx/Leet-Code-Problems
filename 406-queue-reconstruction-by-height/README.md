<h2><a href="https://leetcode.com/problems/queue-reconstruction-by-height/">406. Queue Reconstruction by Height</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an array of people, <code style="user-select: auto;">people</code>, which are the attributes of some people in a queue (not necessarily in order). Each <code style="user-select: auto;">people[i] = [h<sub style="user-select: auto;">i</sub>, k<sub style="user-select: auto;">i</sub>]</code> represents the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> person of height <code style="user-select: auto;">h<sub style="user-select: auto;">i</sub></code> with <strong style="user-select: auto;">exactly</strong> <code style="user-select: auto;">k<sub style="user-select: auto;">i</sub></code> other people in front who have a height greater than or equal to <code style="user-select: auto;">h<sub style="user-select: auto;">i</sub></code>.</p>

<p style="user-select: auto;">Reconstruct and return <em style="user-select: auto;">the queue that is represented by the input array </em><code style="user-select: auto;">people</code>. The returned queue should be formatted as an array <code style="user-select: auto;">queue</code>, where <code style="user-select: auto;">queue[j] = [h<sub style="user-select: auto;">j</sub>, k<sub style="user-select: auto;">j</sub>]</code> is the attributes of the <code style="user-select: auto;">j<sup style="user-select: auto;">th</sup></code> person in the queue (<code style="user-select: auto;">queue[0]</code> is the person at the front of the queue).</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> people = [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
<strong style="user-select: auto;">Output:</strong> [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]
<strong style="user-select: auto;">Explanation:</strong>
Person 0 has height 5 with no other people taller or the same height in front.
Person 1 has height 7 with no other people taller or the same height in front.
Person 2 has height 5 with two persons taller or the same height in front, which is person 0 and 1.
Person 3 has height 6 with one person taller or the same height in front, which is person 1.
Person 4 has height 4 with four people taller or the same height in front, which are people 0, 1, 2, and 3.
Person 5 has height 7 with one person taller or the same height in front, which is person 1.
Hence [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]] is the reconstructed queue.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> people = [[6,0],[5,0],[4,0],[3,2],[2,2],[1,4]]
<strong style="user-select: auto;">Output:</strong> [[4,0],[5,0],[2,2],[3,2],[1,4],[6,0]]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= people.length &lt;= 2000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= h<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">6</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= k<sub style="user-select: auto;">i</sub> &lt; people.length</code></li>
	<li style="user-select: auto;">It is guaranteed that the queue can be reconstructed.</li>
</ul>
</div>