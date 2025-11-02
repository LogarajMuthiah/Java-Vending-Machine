package Basics;

import java.util.Scanner;

public class TheatreBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       boolean[][] seats=new boolean [5][];
       seats[0]=new boolean[8];
       seats[1]=new boolean[8];
       seats[2]=new boolean[8];
       seats[3]=new boolean[14];
       seats[4]=new boolean[14];
       
       try {
       while(true) {
       //Reminding users about seats availability
       System.out.println("Available seats     A: Available -- B:Booked");
       
       for(int i=0;i<seats.length;i++) {
    	   for(int j=0;j<seats[i].length;j++) {
    		   
    		   System.out.print(seats[i][j] ? "B " : "A ");
    	   }
    	   System.out.println();
       }
       
       // Row number
       System.out.println("Enter the row number    "+ "press 0 to exit");
       int row=scanner.nextInt();
       row=row-1;
       if(row<0) break;
    	   
       
       
       
       // Seat number
       System.out.println("Enter the seat number");
       int seat=scanner.nextInt();
       seat=seat-1;
       
       if(row<0||row>seats.length||seat<0||seat>seats[row].length-1) {
    	   System.out.println("Invalid seat");
    	   continue;
       }
       
       if(!seats[row][seat]) {
    	   seats[row][seat]=true;
    	   System.out.println("Seats booked successfully");
       }
       else {
    	   System.out.println("Seats booked already");
       }
    	   
    	   System.out.println("We are anticipating your visit! Grab a 50% offer on snacks :)");
      
    }
       }
       catch(Exception e){
    	    System.out.println(e);
       }
}
}