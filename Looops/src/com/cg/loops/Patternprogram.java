package com.cg.loops;

public class Patternprogram {

	public static void main(String[] args) {
		int rows,columns;
		for( rows=5;rows>0;rows--)
		{
			for( columns=0;columns<rows;columns++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
