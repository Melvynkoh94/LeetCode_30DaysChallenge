package com.medium;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

public class Qn48 {

	public static void main(String[] args) {
		rotate(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
	}
	
	public static void rotate(int[][] matrix) {
        int size = matrix.length;

        int[][] copiedMatrix = new int[size][size];
        for(int x=0; x<size; x++) {
        	for(int y=0; y<size; y++) {
        		copiedMatrix[x][y] = matrix[x][y];
        	}
        }
        Stack<Integer> stack = new Stack<>();              
        //set each column to be result's row
        for(int i=0; i<size; i++) {
        	for(int j=0; j<size; j++) {
        		stack.push(copiedMatrix[j][i]);        		
        	}
        	for(int b=0; b<size; b++) {
        		matrix[i][b] = stack.pop();
        	} 
        }        
        Stream.of(matrix).forEach(arr -> System.out.println(Arrays.toString(arr)));       
    }

}
