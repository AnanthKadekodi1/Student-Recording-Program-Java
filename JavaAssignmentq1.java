/*************************************************
Java Assignment 1 Part 2
Author - Ananth Kadekodi
Date - 12/9/2016
File Name - JavaAssignmentq1.java
Purpose - Create a program to process the data gathered for a show.
Input/Output Assumptions - 1) The output should show the total number of people called in integers.
*                          2) The output should show the total number of people who watched the show in integers.
*                          3) The output should show the percentage of people who watch the show regularly in percentage. 
*                          4) The output should also present the information as a table. The table should be broken into three parts. It should show the percentage of 
*                             male and female viewers under 30, percentage of male and female viewers over 30 and the total percentage of male and female viewers. 
*                          5) The sum of percentage of the last column should be 100%.
*                          6) The age entered of the person should be between 1 and 110.
*                          7) The person's gender should be able to be read, if inputted in either upper/lower case.
*                          8) The input data is to be validated and an error message is to be generated, if data is out of range. 
*****************************************************/
package javaassignmentq1;
import java.util.Scanner; // Import the scanner class

public class JavaAssignmentq1 {

    // Declaraion of all the variables 
    int age = 0; //person age
    int regularwatchers;
    int totalcalls; // total number of call
    int yesovr30M = 0, yesovr30F = 0, yesudr30M = 0, yesudr30F = 0; // age over 30 Male/Female who said yes
    int noovr30M = 0, noovr30F = 0, noudr30M = 0, noudr30F = 0; //age under 30 Male/Female who said no
    int callTotal = 0; // total callers
    int watchersTotal = 0; // Total watchers
    float pcttotalWatchers = 0; // percentage of total watchers
    float pctudr30M = 0, pctudr30F = 0, pctovr30M = 0, pctovr30F = 0, pctTotalFemale = 0, pctTotalMale = 0; //Percentage values
    float pcttotalOvr30 = 0, pcttotalUdr30 = 0, pctTotal = 0; //Percentage totals
   
    char gender;
    char show;
    char choice;
    char details = 'Y'; 
    
    
    
    public static void main(String[] args) {
            

        JavaAssignmentq1 object = new JavaAssignmentq1(); // Create Object

        //List of objects
        object.studentInfo(); // Print student information
        System.out.println("");
        
        while (object.details == 'Y'){
            object.getInfo(); // Gather participant information
            object.calculateTotal(); // Calculate the values to printed in the table
        }           
        object.printTotals(); // Print the values in the table
    }

    public void studentInfo(){ // Print student information

        System.out.println("Student Name: Ananth Kadekodi");
        System.out.println("Student Number: 32920719");
        System.out.println("Mode of Enrolment: External");
        System.out.println("Tutor Name: Dr. Mark Abernethy");
        System.out.println("Tutorial Attendance: External");
        
    } // End of studentInfo
    
    
    public void getInfo(){  // Collect user input and store data
            
        Scanner keyboard = new Scanner(System.in); //Create object to read user data
        
        System.out.println("Please enter your age between 1 - 110");
        age = keyboard.nextInt();
        while((age < 1) || (age > 110)){
            System.out.println("Error please input a valid age");
            System.out.println("");
            System.out.println("Please enter your age between 1 - 110");
            age = keyboard.nextInt();
        }
       
        System.out.println("Please enter this person's gender (M/F)");
        gender = keyboard.next().charAt(0);
        gender = Character.toUpperCase(gender); // Convert all inputted character to upper case
        
        while((gender != 'M') && (gender != 'F')){
            System.out.println("Error please input a valid gender");
            System.out.println("");
            System.out.println("Please enter this person's gender (M/F)");
            gender = keyboard.next().charAt(0);
            gender = Character.toUpperCase(gender); // Convert all inputted character to upper case 
        }
    
        
        System.out.println("Please enter whether this person watches the show regularly (Y/N");
        show = keyboard.next().charAt(0);
        show = Character.toUpperCase(show); // Convert show to upper case
        
     
        while((show != 'Y') && (show != 'N')){
            System.out.println("Error - input invalid");
            System.out.println("");
            System.out.println("Please enter whether this person watches the show regularly (Y/N");
            show = keyboard.next().charAt(0);
            show = Character.toUpperCase(show); // Convert show to upper case
        }
      
        System.out.println("Do you want to enter another person's details (Y/N)?");
        details = keyboard.next().charAt(0);
        details = Character.toUpperCase(details);
        
        while((details != 'Y') && (details != 'N')){
            System.out.println("Error - Invalid input");
            System.out.println("");
            System.out.println("Do you want to enter another person's details (Y/N)?");
            details = keyboard.next().charAt(0);
            details = Character.toUpperCase(details);
        }

        // Calculate data and tally up individual points
        if((age >= 30) && (gender == 'M') && (show == 'Y')){
            yesovr30M++;
        } else if ((age >= 30) && (gender == 'F') && (show == 'Y')){
            yesovr30F++;
        } else if (( age < 30) && (gender == 'M') && (show == 'Y')){
            yesudr30M++;
        } else if ((age < 30) && (gender == 'F') && (show == 'Y')){
            yesudr30F++;
        } else if ((age >= 30) && (gender == 'M') && (show == 'N')){
            noovr30M++;
        } else if ((age >= 30) && (gender == 'F') && (show == 'N')){
            noovr30F++;
        } else if ((age < 30) && (gender == 'M') && (show == 'N')){
            noudr30M++;
        } else if ((age < 30) && (gender == 'F') && (show == 'N')){
            noudr30F++;
        }// end of if else statements

    }// End of getInfo
    
    
    public void calculateTotal(){   //Calculate total data, using the above calculated values
        callTotal = yesovr30M + yesovr30F + yesudr30M + yesudr30F + noovr30M + noovr30F + noudr30M + noudr30F; // Calculate total number of callers
        watchersTotal = yesovr30M + yesovr30F + yesudr30M + yesudr30F; // Calculate total number of watchers
        pcttotalWatchers = ((watchersTotal * 100) / callTotal); // Calculate percentage of total watchers
        
        if(watchersTotal > 0){
            pctudr30M = ((yesudr30M * 100) / watchersTotal); //Percentage of watchers under 30 M
            pctudr30F = ((yesudr30F * 100) / watchersTotal); //Percentage of watchers under 30 F
            pctovr30M = ((yesovr30M * 100) / watchersTotal); //Percentage of watchers over 30 M
            pctovr30F = ((yesovr30F * 100) / watchersTotal); //Percentage of watchers over 30 F
            pctTotalFemale = Math.round(pctudr30F + pctovr30F); // Total Female percentage
            pctTotalMale = Math.round(pctovr30M + pctudr30M); // Total male percentage
            pcttotalOvr30 = Math.round(pctovr30M + pctovr30F); // Percentage total over 30
            pcttotalUdr30 = Math.round(pctudr30M + pctudr30F); // Percentage total under 30
            pctTotal = Math.round(pctTotalFemale + pctTotalMale); //Percentage overall total            
        }else{
            System.out.println("No individual watched the show");
        }
    }// End of calculateTotal
    
    public void printTotals(){ //Function to print out the results calculated
        System.out.println("The total number of people called = " +callTotal);
        System.out.println("The number of people who watch the show regularly = " +watchersTotal);
        System.out.println("The percentage of people who watch the show regularly = " +pcttotalWatchers+ "%");
        System.out.println("");
        
        // Defining string variables that make up the table. 
        String heading1 = "Distribution of viewers who watch the show regularly";
        String divider1 = "------------------------------------------------------------------------------------";
        String heading2 = "Gender";
        String heading3 = "% Under 30";
        String heading4 = "% 30 or over";
        String heading5 = "% Total";
        String heading6 = "Female";
        String heading7 = "Male";
        String heading8 = "Total";
        
        // Print commands to display the table
        System.out.println("");
        System.out.printf("%-15s %n", heading1); // Print the main heading
        System.out.printf("%-15s %15s %15s %15s %n", heading2, heading3, heading4, heading5); // Print the four headings
        System.out.println(divider1); 
        System.out.printf("%-15s %15s %15s %15s %n", heading6, +pctudr30F, +pctovr30F, +pctTotalFemale);
        System.out.printf("%-15s %15s %15s %15s %n", heading7, +pctudr30M, +pctovr30M, +pctTotalMale);
        System.out.println(divider1);
        System.out.printf("%-15s %15s %15s %15s %n", heading8, +pcttotalUdr30, +pcttotalOvr30, +pctTotal);
       
    }// End of printTotal 
}// End of main
    
