package com.The30DaysChallenge.May.Week4;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntervalListIntersections {

	public static void main(String[] args) {
		/*
		 *  Input: A = [[0,2],[5,10],[13,23],[24,25]], B = [[1,5],[8,12],[15,24],[25,26]]
		 *	Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
		 */
		int[][] A = new int[][] {{0,2},{5,10},{13,23},{24,25}};
		int[][] B = new int[][] {{1,5},{8,12},{15,24},{25,26}};
		Stream.of(intervalIntersection(A, B)).forEach((x) -> System.out.println(Arrays.toString(x)));
	}
	
	public static int[][] intervalIntersection(int[][] A, int[][] B) {
	       int[][] resultArrAll = new int[A.length*B.length][2];
			int index = 0;
			for(int i=0; i<A.length; i++) {
				for(int j=0; j<B.length; j++) {
					int[] tempArr = new int[2];
					int A_start = A[i][0];
					int A_end = A[i][1];

					//check if out of bound, skip
					if(A_end < B[j][0]) continue;		
					
					tempArr[0] = (A_start >= B[j][0]) ? A_start : B[j][0];				
					tempArr[1] = (A_end >= B[j][1]) ? B[j][1]  : A_end;
					// if both are still 0, meaning nothing added, skip
					if((tempArr[0] == 0 && tempArr[1] == 0) || tempArr[0] > tempArr[1]) continue;
					else {
						resultArrAll[index] = tempArr;
					}
					index++;
				}
			}
			int[][] resultArr = new int[index][2];
			int resultIndex = 0;
			for(int[] arr : resultArrAll) { //remove all [0,0]
				if(arr[0] == 0 && arr[1] == 0) continue;
				resultArr[resultIndex] = arr;
				resultIndex++;
			}

			return resultArr;
	    }

}
