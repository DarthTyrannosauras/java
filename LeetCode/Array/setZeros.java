package com.lc.solutions;

public class setZeros {
	public void setZeroes(int[][] matrix) {
		int[] temp = matrix[0];
		int r=matrix.length, c=temp.length, i1=0;
		System.out.println(r);
		System.out.println(c);
		int[] row = new int[r*c];
		int[] column = new int[r*c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(matrix[i][j]==0) {
					row[i1]=i;
					column[i1++]=j;
					//System.out.println(matrix[i][j] + " " + row[i1-1] + " " +column[i1-1] );
				}
			}
		}
		for(int i=0;i<i1;i++) {
			for(int j=0;j<r;j++) {
				for(int k=0;k<c;k++) {
					matrix[row[i]][k]=0;
					//System.out.println(matrix[i][j] + " " + row[i] );
				}
			}
		}
		for(int i=0;i<i1;i++) {
			for(int j=0;j<r;j++) {
				for(int k=0;k<c;k++) {
					matrix[j][column[i]]=0;
					//System.out.println(matrix[i][j] + " " +column[i] );
				}
			}
		}
	
	}
}
