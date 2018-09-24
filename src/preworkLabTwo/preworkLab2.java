package preworkLabTwo;


import java.util.Scanner;
public class preworkLab2 {


    private static Scanner scanner;

	public static void main(String[] args) {

        int month1;
         int month2;
        int day1;
        int day2;
        int year1;
         int year2;
        
         scanner = new Scanner(System.in);


        System.out.println("Enter first calendar date (MM DD YYYY):");


         month1 = scanner.nextInt();
         day1 = scanner.nextInt();
         year1 = scanner.nextInt();
         


         System.out.println("Enter second calendar date (MM DD YYYY):");


         month2 = scanner.nextInt();
         day2 = scanner.nextInt();
         year2 = scanner.nextInt();
        



        int date1 = (year1 * 365 + month1 * 30) + day1;
         int date2 = (year2 * 365 + month2 * 30) + day2;
         

         int durationdifference = date2 - date1;
         




        int year = durationdifference / 356;
         int month = (durationdifference % 365) / 30;
        int day = (durationdifference % 365) % 30;
         
System.out.println("Difference is: " + year + " year(s)," + " " + month + " month(s) and" + " " + day + " day(s).");
        
     }
 }
