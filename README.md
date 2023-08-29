# AlgorithmTutorial/算法教程

The project is a tutorial for algorithms and data structures. It is written in Java. The project is tested on Windows./这是用java写的算法和数据结构教程。这个项目在Windows上测试。 

## How do algorithms work?/算法实现思路
sortedArraysIntersection:

Description: Given two sorted arrays, this function finds their intersection.

Approach: Use two pointers, one for each array. Compare the elements at the pointers. If they are equal, add the element to the result and move both pointers. If one element is smaller, move its pointer. Repeat until either array is fully traversed.

unsortedArraysIntersection:

Description: Given two unsorted arrays, this function finds their intersection.

Approach: Convert one of the arrays into a set for efficient lookups. Iterate through the other array, checking if each element is in the set. If yes, add it to the result and remove it from the set.

twoSum:

Description: Given an array of integers and a target, this function finds two numbers that add up to the target.

Approach: Use a hash map to store each number's index. Iterate through the array, calculate the complement needed to reach the target, and check if it exists in the map. If found, return the indices.

findDuplicate:

Description: Given an array, this function finds the element that appears twice.

Approach: Use a set to track unique elements. Iterate through the array, checking if each element is already in the set. If yes, return the element as it's the duplicate.

longestCommonPrefix:

Description: Given an array of strings, this function finds the longest common prefix.

Approach: Initialize the prefix with the first string. Iterate through the rest of the strings, repeatedly trimming the prefix until it matches the beginning of each string. If the prefix becomes empty, there's no common prefix.

maxProfit:

Description: Given an array of stock prices, this function calculates the maximum profit from buying and selling stocks.

Approach: Iterate through the prices, and whenever the price increases from the previous day, add the difference to the maximum profit.

rotateM1, rotateM2, rotateM3:

Description: These functions rotate an array to the right by k steps using different methods.

Approach:
rotateM1: Use a reverse method by reversing all elements, then reversing the first k elements, and finally reversing the remaining elements.
rotateM2: Create a new array and place elements in their rotated positions based on the modulus of (i + k) % n.
rotateM3: Use cyclic replacement, where you repeatedly move each element to its correct position based on the step size k.

removeDuplicates:

Description: Given a sorted array, this function removes duplicate elements and returns the new length.

Approach: Iterate through the array and compare each element with the previous one. If it's different, store it in the next available position in the array.

plusOne:

Description: Given an array representing a number, this function adds one to the number and returns the new array.

Approach: Start from the last digit and keep adding one. If the digit becomes 10, set it to 0 and continue with the carry. If the entire array becomes 10s, create a new array with an extra digit for the carry.

removeNthFromEnd:

Description: Given a ListNode and an integer n, this function removes the n-th node from the end of the list and returns the modified list.

Approach: Use two pointers, first and second, with a gap of n+1 between them. Move first n+1 steps ahead. Then, move both pointers until first reaches the end. The second pointer will be at the n-th node from the end. Adjust the pointers to remove the target node.

sumOfTwoLists:

Description: Given two sorted ListNode representing numbers, this function returns a ListNode that represents the sum of the two numbers.

Approach: Create a dummy ListNode to keep track of the resulting linked list. Traverse both input linked lists in parallel, adding their values along with any carry. Attach the sum of each position to the resulting list, considering cases where one list is longer than the other.

hasCycle:

Description: Given a ListNode, this function checks whether it contains a cycle.

Approach: Use the "Floyd's Tortoise and Hare" algorithm. Initialize two pointers, slow and fast, both starting from the head. Move slow by one step and fast by two steps. If there's a cycle, they will eventually meet. If there's no cycle, fast will reach the end of the list.

LengthOfLongestSubstringM1:

Description: Given a string s, this function finds the length of the longest substring without repeating characters using a HashMap.

Approach: Use a sliding window approach. Initialize a start pointer and a map to store characters and their indices. Iterate through the string with the end pointer. If the character is already in the map, move the start pointer to the next index after the last occurrence of the character. Update the maximum length based on the difference between end and start. Store the character's index in the map regardless.

lengthOfLongestSubstringM2:

Description: This function finds the length of the longest substring without repeating characters using a sliding window approach with a HashSet.

Approach: Initialize a sliding window defined by i and rk (right pointer). Iterate through the string with the i pointer. While moving the rk pointer, keep adding characters to a HashSet. If a character is already in the HashSet, remove the character at i from the HashSet and increment i. Update the maximum length based on the difference between rk and i.

findDepthOfTree:

Description: This method calculates the depth (height) of a binary tree.

Approach: It's a recursive method that calculates the depth of the left and right subtrees and returns the maximum of the two depths plus one (to account for the current node).

invertTree:

Description: This method inverts a binary tree by swapping the left and right children of each node.

Approach: It's a recursive method that performs a depth-first traversal of the tree. For each node, it swaps its left and right children and then recursively inverts the left and right subtrees.

printTree:

Description: This method prints the values of the binary tree in pre-order traversal (root-left-right).

Approach: It's a recursive method that prints the value of the current node, then recursively prints the left subtree and the right subtree.

sortedArraysIntersection（有序数组的交集）:

描述： 给定两个有序数组，此函数找到它们的交集。

思路： 使用两个指针，一个指向每个数组。比较指针处的元素。如果它们相等，将元素添加到结果中，并移动两个指针。如果一个元素较小，移动其对应的指针。重复这个过程，直到有一个数组被完全遍历。

unsortedArraysIntersection（无序数组的交集）:

描述： 给定两个无序数组，此函数找到它们的交集。

思路： 将其中一个数组转换成集合，以提高查找效率。遍历另一个数组，检查每个元素是否在集合中。如果是，将元素添加到结果中并从集合中移除。

twoSum（两数之和）:

描述： 给定一个整数数组和一个目标值，此函数找到两个数，使其和等于目标值。

思路： 使用哈希映射来存储每个数字及其索引。遍历数组，计算需要达到目标值的补数，并检查补数是否在映射中存在。如果存在，返回两个数字的索引。

findDuplicate（查找重复元素）:

描述： 给定一个数组，此函数找到出现两次的元素。

思路： 使用集合来跟踪唯一元素。遍历数组，检查每个元素是否已经在集合中。如果是，返回这个元素，因为它是重复的。

longestCommonPrefix（最长公共前缀）:

描述： 给定一个字符串数组，此函数找到最长的公共前缀。

思路： 将前缀初始化为第一个字符串。遍历剩余的字符串，重复地修剪前缀，直到它匹配每个字符串的开头。如果前缀变为空，则没有公共前缀。

maxProfit（买卖股票的最佳时机 II）:

描述： 给定一个股票价格数组，此函数计算通过买卖股票获得的最大利润。

思路： 遍历价格数组，当价格增加时，将差值加到最大利润中。

rotateM1、rotateM2、rotateM3（旋转数组）:

描述： 这些函数使用不同方法将数组向右旋转 k 步。

思路：
rotateM1： 使用翻转方法，先翻转所有元素，然后翻转前 k 个元素，最后翻转剩余元素。
rotateM2： 创建一个新数组，根据 (i + k) % n 的模将元素放置到旋转后的位置。
rotateM3： 使用循环替换，重复地将每个元素移动到正确的位置，步长为 k。

removeDuplicates（删除排序数组中的重复项）:

描述： 给定一个排序数组，此函数删除重复元素并返回新的长度。

思路： 遍历数组，将每个元素与前一个元素进行比较。如果不同，将元素存储在下一个可用位置中。

plusOne（加一）:

描述： 给定表示数字的数组，此函数将数字加一并返回新数组。

思路： 从最后一位开始，不断地加一。如果数字变为 10，将其设置为 0 并继续处理进位。如果整个数组都变为 10，则创建一个带有额外位数的新数组。

removeNthFromEnd（删除链表的倒数第N个节点）:

描述： 给定一个链表和一个整数 n，此函数删除链表倒数第 n 个节点并返回修改后的链表。

思路： 使用两个指针，first 和 second，它们之间有一个间隔为 n+1。将 first 移动 n+1 步。然后，同时移动这两个指针，直到 first 到达末尾。此时，second 指针将指向倒数第 n 个节点。调整指针以删除目标节点。

sumOfTwoLists（两数相加）:

描述： 给定两个表示数字的排序链表，此函数返回一个表示两个数字相加的链表。

思路： 创建一个虚拟链表来记录结果链表。并行遍历两个输入链表，同时将它们的值与进位相加。将每个位置的和附加到结果链表中，考虑其中一个链表较长的情况。

hasCycle（环形链表判断）:

描述： 给定一个链表，此函数检查是否存在环。

思路： 使用 "弗洛伊德的乌龟和兔子" 算法。初始化两个指针，slow 和 fast，都从链表头开始。slow 每次移动一步，fast 每次移动两步。如果存在环，它们最终会相遇。如果没有环，fast 将到达链表末尾。

LengthOfLongestSubstringM1（无重复字符的最长子串）:

描述： 给定一个字符串 s，此函数使用 HashMap 找到无重复字符的最长子串的长度。

思路： 使用滑动窗口方法。初始化一个 start 指针和一个 map 以存储字符和其索引。使用 end 指针遍历字符串。如果字符已经在 map 中，将 start 指针移动到该字符上一次出现的索引的下一个位置。根据 end 和 start 的差异更新最大长度。不管如何，将字符的索引存储在 map 中。

lengthOfLongestSubstringM2（无重复字符的最长子串）:

描述： 此函数使用滑动窗口方法和 HashSet 找到无重复字符的最长子串的长度。

思路： 初始化滑动窗口，由 i 和 rk（右指针）定义。使用 i 指针遍历字符串。在移动 rk 指针时，将字符添加到 HashSet 中。如果字符已经在 HashSet 中，从 HashSet 中删除 i 处的字符，并增加 i。根据 rk 和 i 之间的差异更新最大长度。

findDepthOfTree（计算二叉树的深度）：

描述：此方法计算二叉树的深度（高度）。

思路：这是一个递归方法，它计算左子树和右子树的深度，并返回两者深度的最大值加一（以考虑当前节点）。

invertTree（翻转二叉树）：

描述：此方法通过交换每个节点的左右子节点来翻转二叉树。

思路：这是一个递归方法，它执行深度优先遍历树。对于每个节点，它交换其左右子节点，然后递归地翻转左右子树。

printTree（打印二叉树）：

描述：此方法以前序遍历（根-左-右）的方式打印二叉树的值。

思路：这是一个递归方法，它首先打印当前节点的值，然后递归地打印左子树和右子树。

## My email address: tolja@tolja.dev