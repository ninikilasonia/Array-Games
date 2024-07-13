# Array-Games

Games with Arrays
Several sub-tasks experiment with arrays. The sub-tasks are independent and thus may be
solved in any order. The template provides for each sub-task a method whose body is to be
implemented. The signature of the methods must not be modified.
Hints:
You may only use base types as well as Strings and arrays of those, as imports only
packages from java.lang.*.
Introducing auxiliary methods is permitted and could be helpful.
Alternative Sorting
The method otherSort expects as parameters arrays arr1 and arr2. Each value occurs in arr2
only once. All elements of arr2 are also contained in arr1.
We sort the elements in arr1 such that the order of the elements in arr1 is the same as in
arr2. Elements that occur in arr1, but not in arr2, are put at the end of arr1 gepackt, in the
same order.
1. OtherSort: Example No results
Parameter: arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6}
Return value: {2,2,2,1,4,3,3,9,6,7,19}
Pingu Merchant
Penguin Giorgi tries to make a fortune as plancton merchant at the South Pole. For that, he
likes to know the optimal time points when to buy and when to sell plancton. He is lucky in
that he may query from a penguin oracle the prizes of the coming (max. 30) days. We want
to help him to achieve optimal profit.
For that, an array arr is expected consisting of integer prizes of plancton at the respective
day. Our method is meant to return an array with three elements consisting of the buying
and selling days followed by the maximal profit. If no positive gain is possible, all three
elements of the result array should be 0.
1. Pingu Merchant: Two Examples No results
Example 1
Parameter: arr1 = {7, 1, 5, 3, 6, 4}
Return value: {1, 4, 5}
Explanation: The combination of buying on day 1, selling on day 4 maximizes profit to 5
Example 2
Parameter: arr1 = {7, 6, 5, 4, 3, 2, 1}
Return value: {0, 0, 0}
Explanation: No profit possible. Therefore default value returned.
3. Fair Friends Two friends have one set of chocolate slabs each. The sizes of the respective slabs are
provided as arrays of element type int. Since the two are very good friends, they plan to
exchange a single slab such that both overall possess an equal amount of chocolate.
Your method should return an array of length 2. The first and second elements record the
sizes of slabs of the first and second friend, respectively, to achieve this goal.
If there are several possible solutions, you may return any of these.
Fair Friends: Example 1 No results
Parameter: A = {1,1}, B = {2,2}
Return value: {1,2}
Fair Friends: Example 2 No results
Parameter: A = {1,2}, B = {2,3}
Return value: {1,2}
Fair Friends: Example 3 No results
Parameter: A = {2}, B = {1,3}
Return value: {2,3}
Faire Freunde: Beispiel 4 No results
Parameter: A = {1,2,5}, B = {2,4}
Return value: {5,4}
4. The Alps
We receive an array arr to check whether this array is alpine. An alpine array consists a a
sequence of strictly increasing elements to some peak, frome where its elements are strictly
decreasing.
In particular, a alpine array has an ascent of length at least one followed by a descent of
length at least one,
The Alps: All Examples No results
Example 1
Parameter: A = {2,1}
return value: false
(Ascent is missing)
Example 2
Parameter: A = {3, 5, 6, 7, 5, 7, 1}
Return value: false
(During descent, another ascent occurs)
Example 3
Parameter: A = {3, 5, 6, 7, 5, 3, 1}
Return value: true
5. Pingu Friends
Penguins are very social. For that reason, they to like to dwell in equally sized groups. We
receive an array arr and are meant to check whether the penguins in the array can be subdivided into equally sized groups. Thereby, penguins have received a number 0 < x < 100
and only want to form groups with penguins having the same number. Since penguins fear
loneliness, should all groups have at least two members, while at the same time all groups
should have equal size.
The method therefore should return the maximal group size for which such a formation of
groups exists. If no appropriate sub-division into groups exists, the function should return 0.
Pingu Friends: All examples No results
Example 1
Parameter: {1,2,3,4,4,3,2,1}
Return value: 2
Example 2
Parameter: {1,1,1,2,2,2,3,3}
Return value: 0
Example 3
Parameter: {1}
Return value: 0
Example 4
Parameter: {1,1}
Return value: 2
Example 5
Parameter: {1,1,2,2,2,2}
Return value: 2
