package Basics;
import java.util.Scanner;

public class StudentMarks {
	
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  int marks[]=new int[5];
		 int total=0;
		 double average=0;
		 int highestmark;
		 
		 for(int i=0;i<marks.length;i++) {
			// System.out.print(marks.length);
			 marks[i]=scanner.nextInt();
			 total += marks[i];
		 }
		 highestmark=marks[0];
		 for(int j=0;j<marks.length;j++) {
			 if(marks[j]>highestmark) {
				 highestmark=marks[j];
			 }
		 }
		 average=total/marks.length;
		 System.out.println(average+"  "+highestmark);
		 
		
		 
		 
	}

}
