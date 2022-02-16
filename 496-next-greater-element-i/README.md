<h2><a href="https://leetcode.com/problems/next-greater-element-i/">496. Next Greater Element I</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">The <strong style="user-select: auto;">next greater element</strong> of some element <code style="user-select: auto;">x</code> in an array is the <strong style="user-select: auto;">first greater</strong> element that is <strong style="user-select: auto;">to the right</strong> of <code style="user-select: auto;">x</code> in the same array.</p>

<p style="user-select: auto;">You are given two <strong style="user-select: auto;">distinct 0-indexed</strong> integer arrays <code style="user-select: auto;">nums1</code> and <code style="user-select: auto;">nums2</code>, where <code style="user-select: auto;">nums1</code> is a subset of <code style="user-select: auto;">nums2</code>.</p>

<p style="user-select: auto;">For each <code style="user-select: auto;">0 &lt;= i &lt; nums1.length</code>, find the index <code style="user-select: auto;">j</code> such that <code style="user-select: auto;">nums1[i] == nums2[j]</code> and determine the <strong style="user-select: auto;">next greater element</strong> of <code style="user-select: auto;">nums2[j]</code> in <code style="user-select: auto;">nums2</code>. If there is no next greater element, then the answer for this query is <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">an array </em><code style="user-select: auto;">ans</code><em style="user-select: auto;"> of length </em><code style="user-select: auto;">nums1.length</code><em style="user-select: auto;"> such that </em><code style="user-select: auto;">ans[i]</code><em style="user-select: auto;"> is the <strong style="user-select: auto;">next greater element</strong> as described above.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums1 = [4,1,2], nums2 = [1,3,4,2]
<strong style="user-select: auto;">Output:</strong> [-1,3,-1]
<strong style="user-select: auto;">Explanation:</strong> The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,<u style="user-select: auto;">4</u>,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [<u style="user-select: auto;">1</u>,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,<u style="user-select: auto;">2</u>]. There is no next greater element, so the answer is -1.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums1 = [2,4], nums2 = [1,2,3,4]
<strong style="user-select: auto;">Output:</strong> [3,-1]
<strong style="user-select: auto;">Explanation:</strong> The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,<u style="user-select: auto;">2</u>,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,<u style="user-select: auto;">4</u>]. There is no next greater element, so the answer is -1.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums1.length &lt;= nums2.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums1[i], nums2[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;">All integers in <code style="user-select: auto;">nums1</code> and <code style="user-select: auto;">nums2</code> are <strong style="user-select: auto;">unique</strong>.</li>
	<li style="user-select: auto;">All the integers of <code style="user-select: auto;">nums1</code> also appear in <code style="user-select: auto;">nums2</code>.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<strong style="user-select: auto;">Follow up:</strong> Could you find an <code style="user-select: auto;">O(nums1.length + nums2.length)</code> solution?</div>