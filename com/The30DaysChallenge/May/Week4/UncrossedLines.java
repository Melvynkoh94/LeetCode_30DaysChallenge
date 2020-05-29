package com.The30DaysChallenge.May.Week4;

public class UncrossedLines {

	public static void main(String[] args) {
		
		System.out.println(maxUncrossedLines(new int[] {2,5,1,2,5}, new int[] {10,5,2,1,5,2}));

	}
	
	public static int maxUncrossedLines(int[] A, int[] B) {
        
        int lenA = A.length;
        int lenB = B.length;
        int[][] dp = new int[lenA + 1][lenB + 1];
        for (int i = 1; i <= lenA; i++){
            for (int j = 1; j <= lenB; j++){
                if (A[i - 1] == B[j - 1]){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[lenA][lenB];
        
    }

}
