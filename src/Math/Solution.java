package Math;

public class Solution {
	// 621.Task Scheduler
	/*
	 * public int leastInterval(char[] tasks, int n) { int[] freq = new int[26]; for
	 * (char task : tasks) { freq[task - 'A']++; }
	 * 
	 * (Arrays.sort(freq); int chunk = freq[25] - 1; int idle = chunk * n;
	 * 
	 * for (int i = 24; i >= 0; i--) { idle -= Math.min(chunk, freq[i]); }
	 * 
	 * return idle < 0 ? tasks.length : tasks.length + idle;)
	 * 
	 * int freqMax = 0; int numMaxValue = 0; for (int i : freq) { if (i > freqMax) {
	 * freqMax = i; numMaxValue = 1; } else if (i == freqMax) { numMaxValue++; } }
	 * int intervals = (freqMax - 1) * (n + 1) + numMaxValue; return
	 * Math.max(intervals, tasks.length); }
	 */

	// 2864. Maximum Odd Binary Number
	/*
	 * public String maximumOddBinaryNumber(String s) { int numOne = 0; int numZeros
	 * = 0; StringBuffer result = new StringBuffer(); for (char c : s.toCharArray())
	 * { if (c == '1') { result.append(c); numOne++; } else numZeros++; } if (numOne
	 * == 1) { result.delete(0, numOne); for (int i = 0; i < numZeros; i++) {
	 * result.append('0'); }
	 * 
	 * } else { result.deleteCharAt(1); for (int i = 0; i < numZeros; i++) {
	 * result.append('0'); } } return result.append('1').toString(); }
	 */

	// 20. Valid Parentheses
	/*
	 * public boolean isValid(String s) { Stack<Character> stack = new
	 * Stack<Character>(); for (Character c : s.toCharArray()) { if (c == '(' || c
	 * == '[' || c == '{') { stack.push(c); } else { if (stack.isEmpty()) { return
	 * false; } Character topC = stack.peek(); if (topC == '(' && c == ')' || topC
	 * == '[' && c == ']' || topC == '{' && c == '}') { stack.pop(); } else { return
	 * false; } } } return stack.isEmpty(); }
	 */

	// 26. Remove Duplicates from Sorted Array
	/*
	 * public int removeDuplicates(int[] nums) { LinkedHashSet<Integer> hashSet =
	 * new LinkedHashSet<Integer>(); for (int i : nums) { hashSet.add(i);
	 * 
	 * } int index = 0; for (Integer value : hashSet) { nums[index++] = value; } for
	 * (int i : hashSet) { System.out.println(i); } return hashSet.size();
	 * 
	 * }
	 */

	// 206. Reverse Linked List
	/*
	 * public ListNode reverseList(ListNode head) { ListNode result = null; // Khởi
	 * tạo danh sách đảo ngược
	 * 
	 * while (head != null) { ListNode nextNode = head.next; // Lưu trữ phần tử tiếp
	 * theo của danh sách gốc head.next = result; // Thêm phần tử hiện tại vào đầu
	 * danh sách đảo ngược result = head; // Cập nhật đầu danh sách đảo ngược head =
	 * nextNode; // Di chuyển tới phần tử tiếp theo của danh sách gốc }
	 * 
	 * return result; // Trả về danh sách đảo ngược }
	 */
	// 234. Palindrome Linked List
	/*
	 * public boolean isPalindrome(ListNode head) { ListNode listNodeRv = null;
	 * ListNode initialHead = head; while (head!=null) {
	 * 
	 * ListNode current = head.next;
	 * 
	 * head.next=listNodeRv; listNodeRv= head; head =current; } while
	 * (listNodeRv!=null&&initialHead!=null) {
	 * 
	 * if(listNodeRv.val!=initialHead.val) return false; listNodeRv=listNodeRv.next;
	 * initialHead=initialHead.next; } return true; } public static ListNode
	 * deepCopyLinkedList(ListNode originalHead) { if (originalHead == null) {
	 * return null; }
	 * 
	 * ListNode newHead = new ListNode(originalHead.val); ListNode originalCurrent =
	 * originalHead.next; ListNode newCurrent = newHead;
	 * 
	 * while (originalCurrent != null) { newCurrent.next = new
	 * ListNode(originalCurrent.val); originalCurrent = originalCurrent.next;
	 * newCurrent = newCurrent.next; }
	 * 
	 * return newHead; }
	 */

	// 287. Find the Duplicate Number

	/*
	 * public int findDuplicate(int[] nums) { HashSet<Integer> hashSet = new
	 * HashSet<Integer>(); for (int i = 0; i < nums.length; i++) { if
	 * (!hashSet.contains(nums[i])) hashSet.add(nums[i]); else return nums[i]; }
	 * return -1; }
	 */
	/*
	 * public int findDuplicate(int[] nums) { boolean[] taken = new
	 * boolean[nums.length]; for (int num : nums) { if (taken[num]) { return num; }
	 * taken[num] = true; } return 0; }
	 */
	// 442. Find All Duplicates in an Array

	/*
	 * public List<Integer> findDuplicates(int[] nums) { List<Integer> result = new
	 * ArrayList<Integer>(); boolean numsB[] = new boolean[nums.length + 1]; for
	 * (int num : nums) { System.out.println(numsB); if (numsB[num] = true)
	 * result.add(num); numsB[num] = true; } return result;
	 * 
	 * }
	 */

	// 24.Merge Two Sorted Lists

	/*
	 * public ListNode mergeTwoLists(ListNode list1, ListNode list2) { ListNode
	 * dummy = new ListNode(0); // Tạo một nút giả để bắt đầu danh sách kết quả
	 * ListNode current = dummy; // Con trỏ hiện tại cho danh sách kết quả
	 * 
	 * // Duyệt qua cả hai danh sách đầu vào while (list1 != null && list2 != null)
	 * { // Chọn phần tử nhỏ hơn và thêm vào danh sách kết quả if (list1.val <=
	 * list2.val) { current.next = list1; list1 = list1.next; } else { current.next
	 * = list2; list2 = list2.next; } current = current.next; // Di chuyển con trỏ
	 * hiện tại đến phần tử tiếp theo trong danh sách kết quả }
	 * 
	 * // Thêm phần còn lại của danh sách không rỗng vào danh sách kết quả if (list1
	 * != null) { current.next = list1; } else { current.next = list2; }
	 * 
	 * return dummy.next; // Trả về nút đầu tiên của danh sách kết quả (bỏ qua nút
	 * giả) }
	 */

	// 28. Find the Index of the First Occurrence in a String
	/*
	 * public int strStr(String haystack, String needle) { if
	 * (!haystack.contains(needle)) return -1;
	 * 
	 * for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) { if
	 * (haystack.substring(i, j).equals(needle)) { return i; } }
	 * 
	 * return -1; }
	 */

	// 713. Subarray Product Less Than K

	//1
	/*
	 * public int numSubarrayProductLessThanK(int[] nums, int k) {
	 * 
	 * int index = 1; int cout = 0; int result = 0; for (int i : nums) { if (i < k)
	 * result++; if (index < nums.length) { while (i * nums[index] < k) {
	 * 
	 * i *= nums[index++]; System.out.println(i); cout++; result++; if (index >=
	 * nums.length) {
	 * 
	 * break; }
	 * 
	 * } index = index - cout + 1; cout = 0; } }
	 * 
	 * return result; }
	 */
	//2
	/*
	 * public int numSubarrayProductLessThanK(int[] nums, int k) {
	 * 
	 * int result=0; int index=0; for (int i : nums) { if(i<k) result++;
	 * 
	 * int count=0; while(index+1<nums.length) { i*=nums[index+1];
	 * 
	 * 
	 * if (i>=k) break; index++; count++; }
	 * 
	 * index=index-count+1;
	 * 
	 * 
	 * result+=count;
	 * 
	 * } return result; }
	 */
	//3
	/*
	 * public int numSubarrayProductLessThanK(int[] nums, int k) {
	 * 
	 * int sum = 1; int result = 0; int left = 0;
	 * 
	 * for (int right = 0; right < nums.length; right++) {
	 * 
	 * sum *= nums[right];
	 * 
	 * while (sum >= k && left <= right) { sum /= nums[left]; left++; }
	 * 
	 * result += right - left + 1; }
	 * 
	 * return result;
	 * 
	 * }
	 */
	
	//2958. Length of Longest Subarray With at Most K Frequency
	/*
	 * public int maxSubarrayLength(int[] nums, int k) { int ans = 0;
	 * HashMap<Integer, Integer> mp = new HashMap<>(); int l = 0;
	 * 
	 * for (int r = 0; r < nums.length; r++) { mp.put(nums[r],
	 * mp.getOrDefault(nums[r], 0) + 1); while (mp.get(nums[r]) > k) {
	 * mp.put(nums[l], mp.get(nums[l]) - 1); l++; } ans = Math.max(ans, r - l + 1);
	 * }
	 * 
	 * return ans; }
	 */
	//35. Search Insert Position
	/*
	 * public int searchInsert(int[] nums, int target) { int count=0; for (int i :
	 * nums) { if(i==target) return count; if(i>target) return count; count++; }
	 * return count; }
	 */
	//58. Length of Last Word
	//1
	/*
	 * public int lengthOfLastWord(String s) { ArrayList<Integer> results = new
	 * ArrayList<Integer>(); int count = 0; boolean sB[] = new boolean[s.length()];
	 * int index = 0; for (boolean b : sB) { if (s.charAt(index++) != ' ') b = true;
	 * if (b == true) count++; else if (count != 0) { results.add(count); count = 0;
	 * } if (index == s.length()) { if (count != 0) { results.add(count); count = 0;
	 * } } } if (results.isEmpty()) { return 0; } return results.getLast(); }
	 */
	//2
	/*
	 * public int lengthOfLastWord(String s) { String[] s1 = s.split(" ");
	 * 
	 * return s1[s1.length-1].length(); }
	 */

	// 2962. Count Subarrays Where Max Element Appears at Least K Times
	/*
	 * public long countSubarrays(int[] nums, int k) { int result = 0; int count =
	 * 0; int index = 0; int maxValue = nums[0]; for (int i : nums) { if (i >
	 * maxValue) maxValue = i; } for (int i = 0; i < nums.length; i++) { int j =
	 * nums[i]; if (j == maxValue)count++; while (count >= k) {
	 * if(nums[index]==maxValue) count--; index++; result+=nums.length-i; }
	 * 
	 * } return result; }
	 */
	
	// 66. Plus One
	//1
	/*
	 * public int[] plusOne(int[] digits) { boolean check = true; if
	 * (digits[digits.length - 1] != 9) { digits[digits.length - 1]++; return
	 * digits; }
	 * 
	 * for (int i = digits.length - 1; i > 0; i--) {
	 * 
	 * if (digits[i] == 9) { digits[i]= 0; } else { digits[i]++; check = false; } if
	 * (!check) break; } if (check) { if(digits[0]!=9) digits[0]++; else { int[]
	 * newArr = new int[digits.length+1]; newArr[0]=1; newArr[1]=0; for (int i = 2;
	 * i < newArr.length; i++) { newArr[i]= digits[i-1]; } return newArr; } } return
	 * digits; }
	 */
    //2
	/*
	 * public int[] plusOne(int[] digits) { for (int i = digits.length - 1; i >= 0;
	 * i--) { if (digits[i] < 9) { digits[i]++; return digits; } digits[i] = 0; }
	 * 
	 * digits = new int[digits.length + 1]; digits[0] = 1; return digits; }
	 */
	
	//205. Isomorphic Strings
	//1
	/*
	 * public static boolean isIsomorphic(String s, String t) {
	 * if(s.length()!=t.length()) return false; int[] duplicateArr1= new int[200];
	 * int[] duplicateArr2= new int[200]; for (int i = 0, j=0; i < s.length();
	 * i++,j++) { if(duplicateArr1[s.charAt(i)]!=duplicateArr2[t.charAt(j)]) {
	 * return false; } duplicateArr1[s.charAt(i)]=i+1;
	 * duplicateArr2[t.charAt(j)]=j+1;
	 * 
	 * } return true; }
	 */
    //2
	/* 
	public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Character> mapChars = new HashMap<>(26);
        HashSet<Character> setVals = new HashSet<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for(int i=0;i<s.length();i++){
            if(mapChars.containsKey(sChars[i])){
                if(mapChars.get(sChars[i]) != tChars[i])
                    return false;
            } else{
                    if(setVals.contains(tChars[i]))
                        return false;
                    mapChars.put(sChars[i], tChars[i]);           
                    setVals.add(tChars[i]);         
            }               
        }
        return true;
    }
	*/
	//83. Remove Duplicates from Sorted List
	/*
	 * public ListNode deleteDuplicates(ListNode head) { ListNode listNode = head;
	 * while(head!=null&&head.next!=null) { if(head.val==head.next.val) {
	 * head.next=head.next.next; }else { head=head.next; }
	 *
	 * } return listNode; }
	 */
	
	//79. Word Search
	//1
    // Main function to check if the word exists in the maze
	/*
	 * public boolean exist(char[][] maze, String word) { // Iterate through each
	 * cell in the maze for (int i = 0; i < maze.length; i++) { for (int j = 0; j <
	 * maze[0].length; j++) { // If the current cell matches the first character of
	 * the word, start searching if (maze[i][j] == word.charAt(0)) { boolean ans =
	 * search(maze, word, i, j, 0); if (ans) { return ans; // If the word is found,
	 * return true } } } } return false; // If the word is not found in the maze,
	 * return false }
	 * 
	 * // Recursive function to search for the word starting from a given position
	 * in // the maze public static boolean search(char[][] maze, String word, int
	 * row, int col, int idx) { // Base case: If the entire word has been found,
	 * return true if (idx == word.length()) { return true; }
	 * 
	 * // Check for out-of-bounds or mismatched characters if (row < 0 || col < 0 ||
	 * row >= maze.length || col >= maze[0].length || maze[row][col] !=
	 * word.charAt(idx)) { return false; }
	 * 
	 * // Mark the current cell as visited maze[row][col] = '*';
	 * 
	 * // Define the possible directions to move in the maze int[] r = { -1, 1, 0, 0
	 * }; int[] c = { 0, 0, -1, 1 };
	 * 
	 * // Recursively search in all four directions from the current cell for (int i
	 * = 0; i < c.length; i++) { boolean ans = search(maze, word, row + r[i], col +
	 * c[i], idx + 1); if (ans == true) { return ans; // If the word is found,
	 * return true } }
	 * 
	 * // Backtrack: Restore the original character in the maze maze[row][col] =
	 * word.charAt(idx); return false; // If the word is not found starting from the
	 * current cell, return false }
	 */
	// 2
	/*
	 * public boolean exist(char[][] board, String word) { int m = board.length; int
	 * n = board[0].length;
	 * 
	 * boolean[][] visited = new boolean[m][n]; boolean result = false;
	 * 
	 * for (int i = 0; i < m; i++) { for (int j = 0; j < n; j++) { if (board[i][j]
	 * == word.charAt(0)) { result = backtrack(board, word, visited, i, j, 0); if
	 * (result) return true; } } }
	 * 
	 * return false; }
	 * 
	 * private boolean backtrack(char[][] board, String word, boolean[][] visited,
	 * int i, int j, int index) { if (index == word.length()) { return true; }
	 * 
	 * if (i < 0 || i >= board.length || j < 0 || j >= board[0].length ||
	 * visited[i][j] || board[i][j] != word.charAt(index)) { return false; }
	 * 
	 * visited[i][j] = true;
	 * 
	 * if (backtrack(board, word, visited, i + 1, j, index + 1) || backtrack(board,
	 * word, visited, i - 1, j, index + 1) || backtrack(board, word, visited, i, j +
	 * 1, index + 1) || backtrack(board, word, visited, i, j - 1, index + 1)) {
	 * return true; }
	 * 
	 * visited[i][j] = false; return false; }
	 */
    //3
	/*
	 * // Main function to check if the word exists on the board public boolean
	 * exist(char[][] board, String word) { int n = board.length; // Number of rows
	 * in the board int m = board[0].length; // Number of columns in the board
	 * 
	 * boolean[][] visited = new boolean[n][m]; // Array to keep track of visited
	 * cells
	 * 
	 * char[] wordChar = word.toCharArray(); // Convert the word into a character
	 * array
	 * 
	 * // Quick check: If the length of the word exceeds the total number of cells
	 * on // the board, it can't exist if (wordChar.length > n * m) return false;
	 * 
	 * int counts[] = new int[256]; // Array to store counts of each character
	 * 
	 * // Count the occurrence of each character on the board for (int i = 0; i < n;
	 * i++) { for (int j = 0; j < m; j++) { counts[board[i][j]]++; } }
	 * 
	 * // Adjust the order of characters in the wordChar array based on their
	 * frequency // counts to optimize search int len = wordChar.length; for (int i
	 * = 0; i < len / 2; i++) { if (counts[wordChar[i]] > counts[wordChar[len - 1 -
	 * i]]) { for (int j = 0; j < len / 2; j++) { char temp = wordChar[j];
	 * wordChar[j] = wordChar[len - 1 - j]; wordChar[len - 1 - j] = temp; } break; }
	 * } // Decrease counts of characters in the word from the board for (char c :
	 * wordChar) { if (--counts[c] < 0) return false; // If there are more
	 * occurrences of a character in the word than on the board, // return false }
	 * 
	 * // Iterate through each cell in the board and start searching for the word
	 * for (int i = 0; i < n; i++) { for (int j = 0; j < m; j++) { if (visit(board,
	 * wordChar, 0, i, j, n, m, visited)) return true; // If the word is found
	 * starting from this cell, return true } } return false; // If the loop
	 * completes without finding the word, return false }
	 * 
	 * // Helper function to recursively search for the word starting from a given
	 * cell private boolean visit(char[][] board, char[] word, int start, int x, int
	 * y, int n, int m, boolean[][] visited) { // Base case: If all characters in
	 * the word are found, return true if (start == word.length) return true;
	 * 
	 * // Check for out-of-bounds, already visited cells, and character mismatch if
	 * (x < 0 || x >= n || y < 0 || y >= m || visited[x][y]) return false;
	 * 
	 * // If the current character in the word does not match the character on the
	 * // board, return false if (word[start] != board[x][y]) return false;
	 * 
	 * visited[x][y] = true; // Mark the current cell as visited
	 * 
	 * // Recursively search in all four directions from the current cell boolean
	 * found = visit(board, word, start + 1, x + 1, y, n, m, visited) ||
	 * visit(board, word, start + 1, x - 1, y, n, m, visited) || visit(board, word,
	 * start + 1, x, y + 1, n, m, visited) || visit(board, word, start + 1, x, y -
	 * 1, n, m, visited);
	 * 
	 * visited[x][y] = false; // Backtrack: Unmark the current cell as visited
	 * 
	 * return found; // Return whether the word was found starting from the current
	 * cell }
	 */
	
	
    //1614. Maximum Nesting Depth of the Parentheses
	/*
	 * public int maxDepth(String s) { int count=0,max=0; for(int
	 * i=0;i<s.length();i++){ if(s.charAt(i)=='(') count++; max=Math.max(count,max);
	 * if(s.charAt(i)==')') count--; } return max; }
	 */
    
    //1544. Make The String Great
	/*
	 * public String makeGood(String s) { if (s.length() <= 1) return s;
	 * StringBuffer result = new StringBuffer(s); int i = 0; do {
	 * 
	 * if (result.charAt(i) - 32 == (int) result.charAt(i + 1) || result.charAt(i) +
	 * 32 == (int) result.charAt(i + 1)) { result.delete(i, i + 2); i = 0;
	 * 
	 * } else i++; } while (i < result.length() - 1);
	 * 
	 * return result.toString(); }
	 */
	
	//1249. Minimum Remove to Make Valid Parentheses
	//1
	/* 
    public String minRemoveToMakeValid(String s) {
        // Initialize pointers for the start and end of the string
        int startPointer = 0;
        int endPointer = s.length() - 1;

        String result;

        // Convert input string to character array for easier manipulation
        char[] arr = s.toCharArray();
        
        // Counter for open parentheses
        int openParenthesesCount = 0;

        // First pass: mark excess closing parentheses with '*'
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(')
                openParenthesesCount++;
            else if (arr[i] == ')') {
                if (openParenthesesCount == 0)
                    arr[i] = '*'; // Mark excess closing parentheses
                else
                    openParenthesesCount--;
            }
        }

        // Second pass: mark excess opening parentheses from the end
        for (int i = arr.length - 1; i >= 0; i--) {
            if (openParenthesesCount > 0 && arr[i] == '(') {
                arr[i] = '*'; // Mark excess opening parentheses
                openParenthesesCount--;
            }
        }
        
        // Filter out marked characters and store the result in the character array
        int p = 0; // Pointer for updating the character array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*')
                arr[p++] = arr[i];
        }

        // Construct the result string from the filtered character array
        result = new String(arr).substring(0, p);

        return result;
    }
*/
    //
    //1700. Number of Students Unable to Eat Lunch
    //1
	/*
	 * public boolean consistentcy(Stack<Integer> stack) { int check = stack.peek();
	 * for (int i : stack) { if(i!=check) return false; } return true; } public int
	 * countStudents(int[] students, int[] sandwiches) { Stack<Integer> stackStd =
	 * new Stack<Integer>(); int countSw = 0; for (int i : students) {
	 * stackStd.push(i); } while (countSw<sandwiches.length) {
	 * System.out.println(consistentcy(stackStd)); System.out.println(stackStd);
	 * if(stackStd.getFirst()!=sandwiches[countSw]) { if(consistentcy(stackStd)) {
	 * break; } int topEl=stackStd.getFirst(); stackStd.push(topEl);
	 * stackStd.remove(0); } else { countSw++; stackStd.remove(0); } } return
	 * sandwiches.length-countSw; }
	 */
    //2
	/*
	 * public int countStudents(int[] students, int[] sandwiches) { int CSW = 0, SSW
	 * = 0;
	 * 
	 * for (int student : students){ if (student == 1){ SSW++; } else { CSW++; } }
	 * 
	 * for (int sandwiche : sandwiches){ if (sandwiche == 1 && SSW > 0){ SSW--; }
	 * else if (sandwiche == 0 && CSW > 0){ CSW--; } else { return SSW + CSW; } }
	 * return 0; }
	 */
    
    // Bubble sort
	/*
	 * public static void bubbleSort(int[] arr) { int n = arr.length; boolean
	 * swapped; // Traverse through all elements in the array for (int i = 0; i < n
	 * - 1; i++) { swapped = false; // Last i elements are already in place, so we
	 * don't need to check them int j = 0; while (j < n - i - 1) { // Swap if the
	 * element found is greater than the next element if (arr[j] > arr[j + 1]) { //
	 * Swap arr[j] and arr[j+1] int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] =
	 * temp; swapped = true; } j++; } // If no two elements were swapped in the
	 * inner loop, then the array is already sorted if (!swapped) { break; } } }
	 */
    
    // Insertion sort
	/*
	 * public static void insertionSort(int[] arr) { int n = arr.length; for (int i
	 * = 1; i < n; i++) { int key = arr[i]; int j = i - 1; while (j >= 0 && arr[j] >
	 * key) { arr[j + 1] = arr[j]; j--; } arr[j + 1] = key; } }
	 */
    //404. Sum of Left Leaves
    //BFS
	/*
	 * public int sumOfLeftLeaves(TreeNode root) { if (root == null) { return 0; }
	 * 
	 * Queue<Pair<TreeNode, Boolean>> queue = new LinkedList<>(); queue.offer(new
	 * Pair<>(root, false)); // (node, is_left) int totalSum = 0;
	 * 
	 * while (!queue.isEmpty()) { Pair<TreeNode, Boolean> pair = queue.poll();
	 * TreeNode node = pair.getKey(); boolean isLeft = pair.getValue();
	 * 
	 * if (isLeft && node.left == null && node.right == null) { totalSum +=
	 * node.val; }
	 * 
	 * if (node.left != null) { queue.offer(new Pair<>(node.left, true)); } if
	 * (node.right != null) { queue.offer(new Pair<>(node.right, false)); } }
	 * 
	 * return totalSum; }
	 */
    //DFS
	/*
	 * public int sumOfLeftLeaves(TreeNode root) { return dfs(root, false); }
	 * 
	 * private int dfs(TreeNode node, boolean isLeft) { if (node == null) { return
	 * 0; } if (node.left == null && node.right == null) { // Leaf node return
	 * isLeft ? node.val : 0; } int leftSum = dfs(node.left, true); // Traverse left
	 * child int rightSum = dfs(node.right, false); // Traverse right child return
	 * leftSum + rightSum; }
	 */

	// 100. Same Tree
	// 1
	/*
	 * public boolean isSameTree(TreeNode p, TreeNode q) { if (p == null && q !=
	 * null || q == null && p != null) return false; if (p == null && q == null)
	 * return true; if (p.val != q.val) return false; if (!isSameTree(p.left,
	 * q.left)) return false; if (!isSameTree(p.right, q.right)) return false;
	 * return true; }
	 */
	// 2

	/*
	 * public boolean isSameTree(TreeNode p, TreeNode q) { if (p == null || q ==
	 * null) { return p == q; }
	 * 
	 * return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right,
	 * q.right); }
	 */
        
    //2073. Time Needed to Buy Tickets
    //1
	/*
	 * public int timeRequiredToBuy(int[] tickets, int k) { int ans = 0; while
	 * (tickets[k] != 0) { for (int i = 0; i < tickets.length; i++) { if (tickets[i]
	 * != 0) { tickets[i]--; ans++; } if (tickets[k] == 0) break; } } return ans; }
	 */
    //2
	/*
	 * public int timeRequiredToBuy(int[] tickets, int k) { int ans=0; for (int i =
	 * 0; i < tickets.length; i++) { if(i<k) { if(tickets[i]>tickets[k])
	 * ans+=tickets[k]; else ans+=tickets[i]; } if(i>k) { if(tickets[i]>=tickets[k])
	 * ans+=(tickets[k]-1); else ans+=tickets[i]; } if(i==k) ans+=tickets[k]; }
	 * return ans; }
	 */
    
    //129. Sum Root to Leaf Numbers
    //1
	/*
	 * List<Integer> list = new ArrayList<Integer>();
	 * 
	 * public int sumNumbers(TreeNode root) {
	 * 
	 * sumABrach(root, 0); int ans = 0; for (Integer integer : list) { ans +=
	 * integer; } return ans;
	 * 
	 * }
	 * 
	 * public void sumABrach(TreeNode root, int value) { if (root.left == null &&
	 * root.right == null) { list.add(value * 10 + root.val); } if (root.left !=
	 * null) { sumABrach(root.left, value * 10 + root.val); } if (root.right !=
	 * null) { sumABrach(root.right, value * 10 + root.val); } }
	 */
    //2
	/*
	 * public int sumNumbers(TreeNode root) { return helper(root,0); }
	 * 
	 * public int helper(TreeNode node,int sum){ if(node==null) return 0;
	 * 
	 * int res=sum*10+node.val;
	 * 
	 * if(node.left==null&&node.right==null){ return res; }
	 * 
	 * int leftSum=helper(node.left,res); int rightSum=helper(node.right,res);
	 * 
	 * return leftSum+rightSum; }
	 */
    
    //463. Island Perimeter
    //1
	/*
	 * public int islandPerimeter(int[][] grid) { int ans = 0; for (int i = 0; i <
	 * grid.length; i++) { for (int j = 0; j < grid[0].length; j++) { if (grid[i][j]
	 * == 1) { ans += 4; if (i + 1 < grid.length) { if (grid[i + 1][j] == 1) {
	 * ans--; } } if (i - 1 >= 0) { if (grid[i - 1][j] == 1) { ans--; } } if (j + 1
	 * < grid[0].length) { if (grid[i][j + 1] == 1) { ans--; } } if (j - 1 >= 0) {
	 * if (grid[i][j - 1] == 1) { ans--; } } } } } return ans; }
	 */
   
    //1137. N-th Tribonacci Number
    //1 Iterative Approach (Dynamic Programming)
	/*
	 * public int tribonacci(int n) { int[] arr = new int[3]; arr[0] = 0; arr[1] =
	 * 1; arr[2] = 1; if (n == 0) return arr[0]; if (n == 1) return arr[1]; if (n ==
	 * 2) return arr[2]; do { int temp = arr[0] + arr[1] + arr[2]; n--; arr[0] =
	 * arr[1]; arr[1] = arr[2]; arr[2] = temp; } while (n > 2); return arr[2]; }
	 */
    //2 Recursive Approach
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }
    //3 Dynamic Programming (Memoization)
	/*
	 * public int tribonacci(int n) { Map<Integer, Integer> memo = new HashMap<>();
	 * return helper(n, memo); }
	 * 
	 * private int helper(int n, Map<Integer, Integer> memo) { if
	 * (memo.containsKey(n)) { return memo.get(n); }
	 * 
	 * int result; if (n == 0) { result = 0; } else if (n == 1 || n == 2) { result =
	 * 1; } else { result = helper(n - 1, memo) + helper(n - 2, memo) + helper(n -
	 * 3, memo); }
	 * 
	 * memo.put(n, result); return result; }
	 */
    //4 Space-Optimized Iterative Approach😎:
	/*
	 * public int tribonacci(int n) { if (n == 0) { return 0; } else if (n == 1 || n
	 * == 2) { return 1; }
	 * 
	 * int a = 0, b = 1, c = 1; int nextTrib;
	 * 
	 * for (int i = 3; i <= n; i++) { nextTrib = a + b + c; a = b; b = c; c =
	 * nextTrib; }
	 * 
	 * return c; }
	 */
    

}	