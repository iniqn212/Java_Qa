package com.qa.java.exercises;
public class LoopsExercises {

	public static void main(String[] args) {
		
		// While loop
		
		int no = 1;
		while (no <= 10) {
			
			System.out.println(no);
			no++;
		}
		
		//do - while
		//Different between while and do-while 
		// if condition false , do-while execute once
		
		int noTwo = 11;
		do {
			System.out.println(noTwo);
			noTwo++;
		}while(noTwo <= 10);
			
		
		// for loop
		
		for(int b = 1; b <= 10; b++){
			if(b == 5)
			break;
			
			System.out.println(b);
		}
		
		//Nested Loops
		
		for(int i = 1; i <=3; i++) {
			for(int j = 1; j<=3; j++) {
				System.out.println(i + " " + j);
			}
		}
	}

}
