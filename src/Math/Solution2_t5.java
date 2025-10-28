package Math;

public class Solution2_t5 {

	// 2000. Reverse Prefix of Word
	// 1
	/*
	 * public String reversePrefix(String word, char ch) { int index = 0; for (int i
	 * = 0; i < word.length(); i++) { if (ch == word.charAt(i)) { index = i; break;
	 * } } if (index == 0) return word;
	 * 
	 * char arr[] = new char[word.length()]; for (int i = 0; i < arr.length; i++) {
	 * if(index>=0) { arr[i]=word.charAt(index); index--; } else {
	 * arr[i]=word.charAt(i); } } return String.valueOf(arr); }
	 */
	// 2
	/*
	 * public String reversePrefix(String word, char ch) { int index =
	 * word.indexOf(ch); if (index == -1) { // Character not found in the word
	 * return word; }
	 * 
	 * StringBuilder prefix = new StringBuilder(word.substring(0, index + 1));
	 * return prefix.reverse().append(word.substring(index + 1)).toString(); }
	 */
	// 2441. Largest Positive Integer That Exists With Its Negative
	// 1

	/*
	 * public int findMaxK(int[] nums) { ArrayList<Integer> arraylist = new
	 * ArrayList<Integer>(); for (int i = 0; i < nums.length; i++) { for (int j = 0;
	 * j < nums.length; j++) { if (nums[i] + nums[j] == 0)
	 * arraylist.add(Math.abs(nums[i])); } } if (arraylist.isEmpty()) return -1;
	 * Collections.sort(arraylist); return arraylist.getLast(); }
	 */
	// 2
	/*
	 * public int findMaxK(int[] nums) { Arrays.sort(nums);
	 * 
	 * int ans = -1; for (int i = nums.length - 1; i >= 0; i--) { if (nums[i] <=
	 * Math.abs(nums[0])) { for (int j = 0; j < nums.length; j++) { if (nums[i] +
	 * nums[j] == 0) { ans = Math.abs(nums[i]); break; } } } } return ans; }
	 */
	// 3
	/*
	 * public int findMaxK(int[] nums) { boolean[] exist = new boolean[2001]; int
	 * res = -1; for (int num : nums) { if (exist[1000 - num]) { res = Math.max(res,
	 * Math.abs(num)); } exist[1000 + num] = true; } return res; }
	 */

	// 165. Compare Version Numbers

	// 1
	/*
	 * public int compareVersion(String version1, String version2) {
	 * 
	 * String arr1[] = version1.split("\\."); String arr2[] = version2.split("\\.");
	 * 
	 * int ans = 0; if (arr1.length <= arr2.length) { String arr01[] = new
	 * String[arr2.length]; for (int i = 0; i < arr01.length; i++) { if (i <
	 * arr1.length) arr01[i] = arr1[i]; else arr01[i] = "0"; } for (int i = 0; i <
	 * arr01.length; i++) { if (Integer.valueOf(arr01[i]) >
	 * Integer.valueOf(arr2[i])) { ans = 1; break; } if (Integer.valueOf(arr01[i]) <
	 * Integer.valueOf(arr2[i])) { ans = -1; break; } } } else { String arr01[] =
	 * new String[arr1.length]; for (int i = 0; i < arr1.length; i++) { if (i <
	 * arr2.length) arr01[i] = arr2[i]; else arr01[i] = "0"; } for (int i = 0; i <
	 * arr01.length; i++) { if (Integer.valueOf(arr01[i]) >
	 * Integer.valueOf(arr1[i])) { ans = -1; break; } if (Integer.valueOf(arr01[i])
	 * < Integer.valueOf(arr1[i])) { ans = 1; break; } } } return ans; }
	 */
	// 2
	/*
	 * public int compareVersion(String version1, String version2) { int i = 0; int
	 * j = 0; // int num1=0; // int num2=0; while (i < version1.length() || j <
	 * version2.length()) { int num1 = 0; int num2 = 0; while (i < version1.length()
	 * && version1.charAt(i) != '.') { num1 = num1 * 10 + (version1.charAt(i) -
	 * '0'); i++; } while (j < version2.length() && version2.charAt(j) != '.') {
	 * num2 = num2 * 10 + (version2.charAt(j) - '0'); j++; } if (num1 < num2) {
	 * return -1; } else if (num1 > num2) { return 1; } i++; j++; } return 0;
	 * 
	 * }
	 */
	// 2331. Evaluate Boolean Binary Tree
	// initial
	/*
	 * public boolean evaluateTree(TreeNode root) { if (root.val == 1) return true;
	 * if (root.val == 0) return false; if (root.val == 2) { boolean left =
	 * evaluateTree(root.left); boolean right = evaluateTree(root.right); if (left
	 * == false && right == false) { return false; } return true; } if(root.val==3)
	 * { boolean left = evaluateTree(root.left); boolean right =
	 * evaluateTree(root.right); if (left == true && right == true) { return true; }
	 * return false; } return false; }
	 */
	// refer
	/*
	 * public boolean helper(TreeNode root) { if(root.val == 0 || root.val == 1) {
	 * return root.val == 1; } else if(root.val == 2) { return helper(root.left) ||
	 * helper(root.right); } else if(root.val == 3) { return helper(root.left) &&
	 * helper(root.right); }
	 * 
	 * return false; } public boolean evaluateTree(TreeNode root) { return
	 * helper(root);}
	 */

	// 2373. Largest Local Values in a Matrix
	/*
	 * public int[][] largestLocal(int[][] grid) { int[][] ans = new
	 * int[grid.length-2][grid[0].length-2]; for (int i = 0; i < ans.length; i++) {
	 * for (int j = 0; j < ans.length; j++) { ans[i][j]= maxValue(grid, i, j); } }
	 * return ans; }
	 * 
	 * public int maxValue(int[][]grid,int i, int j) { int ans = grid[i][j]; for
	 * (int k = i; k < i+3; k++) { for (int k2 = j; k2 < j+3; k2++) {
	 * if(ans<grid[k][k2]) ans = grid[k][k2]; } } return ans; }
	 */

	// 506. Relative Ranks
	/*
	 * public String[] findRelativeRanks(int[] score) { String ans[]=new
	 * String[score.length]; if(score.length==1) { ans[0]= "Gold Medal"; return ans;
	 * } if(score.length==2) { if(score[0]>score[1]) { ans[0]= "Gold Medal";
	 * ans[1]="Silver Medal"; return ans; }else { ans[1]= "Gold Medal";
	 * ans[0]="Silver Medal"; } }
	 * 
	 * }
	 */

	// 3110. Score of a String
	/*
	 * public int scoreOfString(String s) { int ans = 0; for (int i = 0; i <
	 * s.length()-1; i++) { ans+= Math.abs(s.charAt(i)-s.charAt(i+1)); } return ans;
	 * }
	 */
	// 344. Reverse String
	// public void reverseString(char[] s) {
	// 	int index = 0;
	// 	char[] a = new char[s.length];
	// 	for (int i = s.length - 1; i > 0; i--) {
	// 		a[index] = s[i];
	// 		index++;
	// 	}
	// 	s[0] = 'T';
	// 	s = a;
	// 	System.out.println(s);

	// }
	

	// 350. Intersection of Two Arrays II
	/*
	 * public int[] intersect(int[] nums1, int[] nums2) {
	 * 
	 * }
	 */

	// 1550. Three Consecutive Odds
	/*
	 * public boolean threeConsecutiveOdds(int[] arr) { int index=0; for (int i = 0;
	 * i < arr.length; i++) { if(arr[i]%2==1) index++; else index=0; if(index==3)
	 * return true; } return false; }
	 */

	// 1823. Find the Winner of the Circular Game
	// 1.Arr
	/*
	 * public int findTheWinner(int n, int k) { boolean[] arr = new boolean[n]; int
	 * index = 0; int loop = 1; int numberLosser = 0; while (numberLosser < n) {
	 * if(index>n-1) index=0; if(arr[index]==true) loop--; if (arr[index] == false
	 * && loop == k) { loop = 0; arr[index] = true; numberLosser++;
	 * System.out.println(index); } loop++; index++; } return index++; }
	 */
	//2.
	/*
	 * public int findTheWinner(int n, int k) { if(n==1) return 1; return
	 * (findTheWinner(n-1,k)+k-1)%n+1; }
	 */

	//1598. Crawler Log Folder
	//1.
	/*
	 * public int minOperations(String[] logs) { int ans=0; for (String s : logs) {
	 * if(s.equals("../")) ans--; else if (s.equals("./")) continue; else ans++; }
	 * if(ans<0) return 0; return ans; }
	 */
    /*public int minOperations(String[] logs) {
        int res = 0;
        for (String log: logs) {
            res += add(log,res);
        }
        return res;
    }
    private int add(String log, int res) {
        return log.charAt(1) == '.' ? res == 0 ? 0 : -1 : log.charAt(0) == '.' ? 0 : 1;
    }*/
    //3264. Final Array State After K Multiplication Operations I
    //1.
    //1079. Letter Tile Possibilities
    //1.
    /*class Solution {
        public int numTilePossibilities(String tiles) {
            int[] counts = new int[26];
            int[] fac = new int[tiles.length() + 1];
            fac[0] = 1;
            ///calculated Factorials
            for(int i = 1; i < fac.length; i++){
                fac[i] = i * fac[i - 1];
            }
            // check duplicate
            for(int i = 0; i < tiles.length(); i++){
                counts[tiles.charAt(i) - 'A']++;
            }
            int[] lengthCounts = new int[tiles.length() + 1];
            lengthCounts[0] = 1;
            for(int i = 0; i < counts.length; i++){
                if(counts[i] != 0){
                    int[] temp = new int[tiles.length() + 1];
                    for(int j = 0; j < lengthCounts.length && lengthCounts[j] > 0; j++){
                        for(int k = 1; k <= counts[i]; k++){
                            int totalLength = j + k;
                            temp[totalLength] += lengthCounts[j] * fac[totalLength] / (fac[k] * fac[j]);
                        }
                    }
                    for(int j = 0; j < temp.length; j++){
                        lengthCounts[j] += temp[j];
                    }
                }
            }
            int ans = 0;
            for(int i = 1; i < lengthCounts.length; i++){
                ans += lengthCounts[i];
            }
            return ans;
        }
    }*/
	//2043. Simple Bank System
	/* class Bank {
    long[] balance;

    public Bank(long[] balance) {
        this.balance = balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if (!checkAccountId(account1) || !checkAccountId(account2) || !checkAccountBalance(account1, money)) return false;
        balance[account1 - 1] -= money;
        balance[account2 - 1] += money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if (!checkAccountId(account)) return false;
        balance[account - 1] += money;
        return true;
    }

    private boolean checkAccountId(int account) {
        return account >= 1 && account <= balance.length;
    }

    private boolean checkAccountBalance(int account, long money) {
        return balance[account - 1] >= money;
    }
    
    public boolean withdraw(int account, long money) {
        if (!checkAccountId(account) || !checkAccountBalance(account, money)) return false;
        balance[account - 1] -= money;
        return true;
    }
} */

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */

}
