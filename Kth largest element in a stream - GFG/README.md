# Kth largest element in a stream
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an input stream <strong style="user-select: auto;">arr[] </strong>of <strong style="user-select: auto;">n</strong> integers. Find the <strong style="user-select: auto;">K</strong><sup style="user-select: auto;">th</sup> largest element for each element in the stream and if the&nbsp;<strong style="user-select: auto;">K<sup style="user-select: auto;">th</sup></strong>&nbsp;element doesn't exist, return <strong style="user-select: auto;">-1</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong></span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">k = </strong>4, <strong style="user-select: auto;">n = </strong>6</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">arr[] = </strong>{1, 2, 3, 4, 5, 6}</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong></span>
<span style="font-size: 18px; user-select: auto;">-1 -1 -1 1 2 3</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:</strong></span>
<span style="font-size: 18px; user-select: auto;">k = 4
For 1, the 4th largest element doesn't
exist so we print -1.
For 2, the 4th largest element doesn't
exist so we print -1.
For 3, the 4th largest element doesn't
exist so we print -1.
For 4, the 4th largest element is 1.
For 5, the 4th largest element is 2.
for 6, the 4th largest element is 3.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong></span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">k = </strong>1, <strong style="user-select: auto;">n = </strong>2</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">arr[] = </strong>{3, 4}</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong></span>
<span style="font-size: 18px; user-select: auto;">3 4 
<strong style="user-select: auto;">Explanation:</strong> 
For the 1st and 2nd element the 1st largest 
element is itself.</span></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">kthLargest()</strong> which takes 2 Integers k, and n and also an array arr[] of size n as input and returns the k<sup style="user-select: auto;">th </sup>largest element in the stream.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(nlogk)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(n)</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1 ≤ k ≤ n ≤ 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 ≤ arr[i] ≤ 10<sup style="user-select: auto;">5</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>