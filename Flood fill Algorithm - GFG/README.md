# Flood fill Algorithm
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">An&nbsp;<code style="user-select: auto;">image</code>&nbsp;is represented by a 2-D array of integers, each integer representing the pixel value of the image.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a coordinate&nbsp;<strong style="user-select: auto;"><code style="user-select: auto;">(sr, sc)</code></strong>&nbsp;representing the starting pixel (row and column) of the flood fill, and a pixel value&nbsp;<code style="user-select: auto;">newColor</code>, "flood fill" the image.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">To perform a <strong style="user-select: auto;">"flood fill"</strong>, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the <strong style="user-select: auto;">same color</strong> as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the <strong style="user-select: auto;">same color</strong> as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>image = {{1,1,1},{1,1,0},{1,0,1}},
sr = 1, sc = 1, newColor = 2.
<strong style="user-select: auto;">Output: </strong>{{2,2,2},{2,2,0},{2,0,1}}
<strong style="user-select: auto;">Explanation: </strong></span><span style="font-size: 18px; user-select: auto;">From the center of the image 
(with position (sr, sc) = (1, 1)), all 
pixels connected by a path of the same color
as the starting pixel are colored with the new 
color.Note the bottom corner is not colored 2, 
because it is not 4-directionally connected to 
the starting pixel.</span>
</pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read or print anyhting. Your task is to complete the function&nbsp;<strong style="user-select: auto;">floodFill()&nbsp;</strong>which takes image, sr, sc and newColor as input paramater and returns the image after flood filling.</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Compelxity:&nbsp;</strong>O(n*m)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Space Complexity:&nbsp;</strong>O(n*m)</span><br style="user-select: auto;">
&nbsp;</p>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= n &lt;= m &lt;= 100<br style="user-select: auto;">
0 &lt;= pixel values &lt;= 10</span></div>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">0 &lt;= sr &lt;= (n-1)</span></div>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">0 &lt;= sc &lt;= (m-1)</span></div>
 <p style="user-select: auto;"></p>
            </div>