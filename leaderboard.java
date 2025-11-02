package Basics;

import java.util.Scanner;

public class leaderboard {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students");
		  int marks[]=new int[scanner.nextInt()];
		  int total=0;
		  double average=0;
		  int highestmark;
		  int lowestmark;
		  int aboveaverage=0;
		  int belowaverage=0;
		  
		  for(int i=0;i<marks.length;i++) {
			  marks[i]=scanner.nextInt();
			  total += marks[i];
		  }
		  
		   average= total/marks.length;
		  
		  highestmark=marks[0];
		for(int j=0;j<marks.length;j++) {
			if(marks[j]>highestmark) {
				highestmark=marks[j];
			}
		}
		
		  lowestmark=marks[0];
			for(int j=0;j<marks.length;j++) {
				if(marks[j]<lowestmark) {
					lowestmark=marks[j];
				}
			}
			for(int j=0;j<marks.length;j++) {
				if(marks[j]>average) {
					aboveaverage++;
				}
				else {
					belowaverage++;
				}
			}
			System.out.println("Average Mark"+ "     "+average);
			System.out.println("Highest Mark"+ "     "+highestmark);
			System.out.println("Lowest Mark"+ "     "+lowestmark);
			System.out.println("aboveaverage"+ "     "+aboveaverage);
			System.out.println("belowaverage Mark"+ "     "+belowaverage);
			

	}

}
