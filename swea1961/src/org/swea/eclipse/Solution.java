package org.swea.eclipse;


import java.util.*;

public class Solution {
	
	public static int[][] rotate (int[][] arr) {
		
		int[][] result=new int[arr.length][arr.length];
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				result[i][j]=arr[arr.length-j-1][i];
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for (int tc=1; tc<=T; tc++) {
			int N=sc.nextInt();
			
			int arr[][]=new int[N][N];
			
			for (int i=0; i<N; i++) 
				for (int j=0; j<N; j++)
					arr[i][j]=sc.nextInt();
			
			int[][] ret1=rotate(arr);
			int[][] ret2=rotate(ret1);
			int[][] ret3=rotate(ret2);
			
			System.out.printf("#%d\n", tc);
			
			for (int i=0; i<arr.length; i++) {
				
				for (int j=0; j<arr.length; j++) {
					System.out.printf("%d", ret1[i][j]);
				}
				System.out.printf(" ");
				
				for (int j=0; j<arr.length; j++) {
					System.out.printf("%d", ret2[i][j]);
				}
				System.out.printf(" ");
				
				for (int j=0; j<arr.length; j++) {
					System.out.printf("%d", ret3[i][j]);
				}
				System.out.printf("\n");
			}
			
		}
	}
}
