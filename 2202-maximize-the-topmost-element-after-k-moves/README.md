<h2><a href="https://leetcode.com/problems/maximize-the-topmost-element-after-k-moves/">2202. Maximize the Topmost Element After K Moves</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">nums</code> representing the contents of a <b style="user-select: auto;">pile</b>, where <code style="user-select: auto;">nums[0]</code> is the topmost element of the pile.</p>

<p style="user-select: auto;">In one move, you can perform <strong style="user-select: auto;">either</strong> of the following:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">If the pile is not empty, <strong style="user-select: auto;">remove</strong> the topmost element of the pile.</li>
	<li style="user-select: auto;">If there are one or more removed elements, <strong style="user-select: auto;">add</strong> any one of them back onto the pile. This element becomes the new topmost element.</li>
</ul>

<p style="user-select: auto;">You are also given an integer <code style="user-select: auto;">k</code>, which denotes the total number of moves to be made.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">maximum value</strong> of the topmost element of the pile possible after <strong style="user-select: auto;">exactly</strong></em> <code style="user-select: auto;">k</code> <em style="user-select: auto;">moves</em>. In case it is not possible to obtain a non-empty pile after <code style="user-select: auto;">k</code> moves, return <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [5,2,2,4,0,6], k = 4
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong>
One of the ways we can end with 5 at the top of the pile after 4 moves is as follows:
- Step 1: Remove the topmost element = 5. The pile becomes [2,2,4,0,6].
- Step 2: Remove the topmost element = 2. The pile becomes [2,4,0,6].
- Step 3: Remove the topmost element = 2. The pile becomes [4,0,6].
- Step 4: Add 5 back onto the pile. The pile becomes [5,4,0,6].
Note that this is not the only way to end with 5 at the top of the pile. It can be shown that 5 is the largest answer possible after 4 moves.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2], k = 1
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation:</strong> 
In the first move, our only option is to pop the topmost element of the pile.
Since it is not possible to obtain a non-empty pile after one move, we return -1.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums[i], k &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
</ul>
</div>