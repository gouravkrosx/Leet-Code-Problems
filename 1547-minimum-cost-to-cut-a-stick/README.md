<h2><a href="https://leetcode.com/problems/minimum-cost-to-cut-a-stick/">1547. Minimum Cost to Cut a Stick</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a wooden stick of length <code style="user-select: auto;">n</code> units. The stick is labelled from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">n</code>. For example, a stick of length <strong style="user-select: auto;">6</strong> is labelled as follows:</p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/07/21/statement.jpg" style="width: 521px; height: 111px; user-select: auto;">
<p style="user-select: auto;">Given an integer array <code style="user-select: auto;">cuts</code> where <code style="user-select: auto;">cuts[i]</code> denotes a position you should perform a cut at.</p>

<p style="user-select: auto;">You should perform the cuts in order, you can change the order of the cuts as you wish.</p>

<p style="user-select: auto;">The cost of one cut is the length of the stick to be cut, the total cost is the sum of costs of all cuts. When you cut a stick, it will be split into two smaller sticks (i.e. the sum of their lengths is the length of the stick before the cut). Please refer to the first example for a better explanation.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the minimum total cost</em> of the cuts.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/07/23/e1.jpg" style="width: 350px; height: 284px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 7, cuts = [1,3,4,5]
<strong style="user-select: auto;">Output:</strong> 16
<strong style="user-select: auto;">Explanation:</strong> Using cuts order = [1, 3, 4, 5] as in the input leads to the following scenario:
<img alt="" src="https://assets.leetcode.com/uploads/2020/07/21/e11.jpg" style="width: 350px; height: 284px; user-select: auto;">
The first cut is done to a rod of length 7 so the cost is 7. The second cut is done to a rod of length 6 (i.e. the second part of the first cut), the third is done to a rod of length 4 and the last cut is to a rod of length 3. The total cost is 7 + 6 + 4 + 3 = 20.
Rearranging the cuts to be [3, 5, 1, 4] for example will lead to a scenario with total cost = 16 (as shown in the example photo 7 + 4 + 3 + 2 = 16).</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 9, cuts = [5,6,1,4,2]
<strong style="user-select: auto;">Output:</strong> 22
<strong style="user-select: auto;">Explanation:</strong> If you try the given cuts ordering the cost will be 25.
There are much ordering with total cost &lt;= 25, for example, the order [4, 6, 5, 2, 1] has total cost = 22 which is the minimum possible.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= n &lt;= 10<sup style="user-select: auto;">6</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= cuts.length &lt;= min(n - 1, 100)</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= cuts[i] &lt;= n - 1</code></li>
	<li style="user-select: auto;">All the integers in <code style="user-select: auto;">cuts</code> array are <strong style="user-select: auto;">distinct</strong>.</li>
</ul>
</div>