<h2><a href="https://leetcode.com/problems/linked-list-random-node/">382. Linked List Random Node</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a singly linked list, return a random node's value from the linked list. Each node must have the <strong style="user-select: auto;">same probability</strong> of being chosen.</p>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">Solution</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">Solution(ListNode head)</code> Initializes the object with the integer array nums.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">int getRandom()</code> Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be choosen.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/16/getrand-linked-list.jpg" style="width: 302px; height: 62px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]
[[[1, 2, 3]], [], [], [], [], []]
<strong style="user-select: auto;">Output</strong>
[null, 1, 3, 2, 2, 3]

<strong style="user-select: auto;">Explanation</strong>
Solution solution = new Solution([1, 2, 3]);
solution.getRandom(); // return 1
solution.getRandom(); // return 3
solution.getRandom(); // return 2
solution.getRandom(); // return 2
solution.getRandom(); // return 3
// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the linked list will be in the range <code style="user-select: auto;">[1, 10<sup style="user-select: auto;">4</sup>]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">4</sup> &lt;= Node.val &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;">At most <code style="user-select: auto;">10<sup style="user-select: auto;">4</sup></code> calls will be made to <code style="user-select: auto;">getRandom</code>.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Follow up:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">What if the linked list is extremely large and its length is unknown to you?</li>
	<li style="user-select: auto;">Could you solve this efficiently without using extra space?</li>
</ul>
</div>