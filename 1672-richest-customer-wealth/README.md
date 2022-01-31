<h2><a href="https://leetcode.com/problems/richest-customer-wealth/">1672. Richest Customer Wealth</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an <code style="user-select: auto;">m x n</code> integer grid <code style="user-select: auto;">accounts</code> where <code style="user-select: auto;">accounts[i][j]</code> is the amount of money the <code style="user-select: auto;">i​​​​​<sup style="user-select: auto;">​​​​​​th</sup>​​​​</code> customer has in the <code style="user-select: auto;">j​​​​​<sup style="user-select: auto;">​​​​​​th</sup></code>​​​​ bank. Return<em style="user-select: auto;"> the <strong style="user-select: auto;">wealth</strong> that the richest customer has.</em></p>

<p style="user-select: auto;">A customer's <strong style="user-select: auto;">wealth</strong> is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum <strong style="user-select: auto;">wealth</strong>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> accounts = [[1,2,3],[3,2,1]]
<strong style="user-select: auto;">Output:</strong> 6
<strong style="user-select: auto;">Explanation</strong><strong style="user-select: auto;">:</strong>
<code style="user-select: auto;">1st customer has wealth = 1 + 2 + 3 = 6
</code><code style="user-select: auto;">2nd customer has wealth = 3 + 2 + 1 = 6
</code>Both customers are considered the richest with a wealth of 6 each, so return 6.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> accounts = [[1,5],[7,3],[3,5]]
<strong style="user-select: auto;">Output:</strong> 10
<strong style="user-select: auto;">Explanation</strong>: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> accounts = [[2,8,7],[7,1,3],[1,9,5]]
<strong style="user-select: auto;">Output:</strong> 17
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m ==&nbsp;accounts.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n ==&nbsp;accounts[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 50</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= accounts[i][j] &lt;= 100</code></li>
</ul>
</div>