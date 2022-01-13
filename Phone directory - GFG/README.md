# Phone directory
## Hard 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a list of contacts <strong style="user-select: auto;">contact[]</strong>&nbsp;of length <strong style="user-select: auto;">n</strong>&nbsp;where each contact is a string which exist in a phone directory and a query string <strong style="user-select: auto;">s</strong>. The task is to implement a search query for the phone directory. Run a search query for each prefix <strong style="user-select: auto;">p</strong> of the query string <strong style="user-select: auto;">s&nbsp;</strong>(<em style="user-select: auto;">i.e.</em> from&nbsp; index 1 to |s|) that prints all the distinct contacts which have the same prefix as p&nbsp;in <strong style="user-select: auto;">lexicographical increasing&nbsp;order</strong>.&nbsp;Please refer the explanation part for better understanding.</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note: </strong>If there is no match between query and contacts, print "0".</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> 
n = 3
contact[] = {"geeikistest", "geeksforgeeks", 
"geeksfortest"}
s = "geeips"
<strong style="user-select: auto;">Output:</strong>
geeikistest geeksforgeeks geeksfortest
geeikistest geeksforgeeks geeksfortest
geeikistest geeksforgeeks geeksfortest
geeikistest
0
0
<strong style="user-select: auto;">Explaination:</strong> By running the search query on 
contact list for "g" we get: "geeikistest", 
"geeksforgeeks" and "geeksfortest".
By running the search query on contact list 
for "ge" we get: "geeikistest" "geeksforgeeks"
and "geeksfortest".
By running the search query on contact list 
for "gee" we get: "geeikistest" "geeksforgeeks"
and "geeksfortest".
By running the search query on contact list 
for "geei" we get: "geeikistest".
No results found for "geeip", so print "0". 
No results found for "geeips", so print "0".</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
Youd do not need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">displayContacts()</strong> which takes <strong style="user-select: auto;">n, contact[ ] </strong>and<strong style="user-select: auto;"> s</strong> as input parameters and returns a list of list of strings for required prefixes. If some prefix has no matching contact return&nbsp;"0" on that list.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(|s| * n * max|contact[i]|)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(n * max|contact[i]|)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤&nbsp;n ≤&nbsp;50<br style="user-select: auto;">
1 ≤ |contact[i]| ≤&nbsp;50<br style="user-select: auto;">
1 ≤&nbsp;|s| ≤&nbsp;6&nbsp;</span></p>
 <p style="user-select: auto;"></p>
            </div>