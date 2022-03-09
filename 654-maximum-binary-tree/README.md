<h2><a href="https://leetcode.com/problems/maximum-binary-tree/">654. Maximum Binary Tree</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an integer array <code style="user-select: auto;">nums</code> with no duplicates. A <strong style="user-select: auto;">maximum binary tree</strong> can be built recursively from <code style="user-select: auto;">nums</code> using the following algorithm:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">Create a root node whose value is the maximum value in <code style="user-select: auto;">nums</code>.</li>
	<li style="user-select: auto;">Recursively build the left subtree on the <strong style="user-select: auto;">subarray prefix</strong> to the <strong style="user-select: auto;">left</strong> of the maximum value.</li>
	<li style="user-select: auto;">Recursively build the right subtree on the <strong style="user-select: auto;">subarray suffix</strong> to the <strong style="user-select: auto;">right</strong> of the maximum value.</li>
</ol>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">maximum binary tree</strong> built from </em><code style="user-select: auto;">nums</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/12/24/tree1.jpg" style="width: 302px; height: 421px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [3,2,1,6,0,5]
<strong style="user-select: auto;">Output:</strong> [6,3,5,null,2,0,null,null,1]
<strong style="user-select: auto;">Explanation:</strong> The recursive calls are as follow:
- The largest value in [3,2,1,6,0,5] is 6. Left prefix is [3,2,1] and right suffix is [0,5].
    - The largest value in [3,2,1] is 3. Left prefix is [] and right suffix is [2,1].
        - Empty array, so no child.
        - The largest value in [2,1] is 2. Left prefix is [] and right suffix is [1].
            - Empty array, so no child.
            - Only one element, so child is a node with value 1.
    - The largest value in [0,5] is 5. Left prefix is [0] and right suffix is [].
        - Only one element, so child is a node with value 0.
        - Empty array, so no child.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/12/24/tree2.jpg" style="width: 182px; height: 301px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [3,2,1]
<strong style="user-select: auto;">Output:</strong> [3,null,2,null,1]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums[i] &lt;= 1000</code></li>
	<li style="user-select: auto;">All integers in <code style="user-select: auto;">nums</code> are <strong style="user-select: auto;">unique</strong>.</li>
</ul>
</div>