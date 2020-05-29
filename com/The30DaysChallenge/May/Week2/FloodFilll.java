package com.The30DaysChallenge.May.Week2;

public class FloodFilll {

	public static void main(String[] args) {

	}
	
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int oldColor = image[sr][sc];
        
        if(oldColor == newColor) return image;
        
        floodFillUtil(image, sr, sc, oldColor, newColor);      
        return image;
    }
    
    public void floodFillUtil(int[][] image,int sr, int sc, int oldColor, int newColor){
        
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length) return;
        
        if(image[sr][sc] != oldColor) return;
        
        image[sr][sc] = newColor;
        // System.out.println("(" + sr + "," + sc + ")");
                
        // Left
        floodFillUtil(image, sr, sc-1, oldColor, newColor);         
        // Right
        floodFillUtil(image, sr, sc+1, oldColor, newColor);       
        // Top
        floodFillUtil(image, sr-1, sc, oldColor, newColor);     
        // Bottom
        floodFillUtil(image, sr+1, sc, oldColor, newColor);      
    }

}
