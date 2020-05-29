package com.The30DaysChallenge.May.Week2;

public class FindtheTownJudge {

	public static void main(String[] args) {
		System.out.println(findJudge(3, new int[][] {{1,3},{2,3},{3,1}}));

	}
	
	public static int findJudge(int N, int[][] trust) {
	       
        // If you get trusted, add 1
        // If you trust someone else, minus 1
        // To be judge, you have N-1 points
        
        int[] points = new int[N];
        
        for(int[] array : trust){
            points[array[0]-1]--;
            points[array[1]-1]++;
        }
        
        for(int i=0; i<points.length; i++){
            if(points[i] == N-1) return (i+1);
        }
        
        return -1;
        
    }    

}
