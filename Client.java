/*************************************************
Java Assignment 2
Author - Ananth Kadekodi
Date - 8/10/2016
File Name - Client.java
Purpose - Java Program,to test and document (at least) two classes – a Student class and a client program, as follows:
Write a Java class called Student which can be used to represent the details of a Student together with some associated operations. The Student class will have the following information:
(a) 	Title of the student (eg, Mr, Miss, Ms, Mrs etc)
(b) 	A first name (given name)
(c) 	A last name (family name/surname)
(d) 	Student number (ID) – an integer number (of type long)
(e) 	A date of birth (in day/month/year format – three ints)
(f) 	There are two assignments, each marked out of a maximum of 100 marks and equally weighted. The marks for each assignment are recorded separately.
(g) 	There is weekly practical work. The marks for this component are recorded as a total mark obtained (out of a maximum of 10 marks) for all practical work demonstrated during the semester.
(h) 	There is one final examination that is marked out of a maximum of 100 marks and recorded separately.
(i) 	An overall mark (to be calculated within the program)
(j) 	A final grade, which is a string (to be calculated within the program)

Assumption: 
* •	Input: 
o	Input the title as a character
o	Input the first and last name in characters
o	Student ID input in type long
o	Input the day/month/year in integers. Input between 1-31 for days, 1-12 for months and year above 1900
o	Assignment marks, weekly practical marks and final examination mark input in type float. Assignment and final exam marks should be between 0-100 and weekly practical marks should be between 0-10. 
•Output:
o	Output the details of the students, recorded in the array.
o	The average mark in the array, is in the form of float.
o	Number of students who obtained an overall mark, above or below the average. 
o	Distribution of grades within the class
o	Given the student ID, view the details of the student. If student not found, display an error message.
o	Given students first and last name, display all the details of the student.
o	Display student ID in ascending order.
o	Display student surname in ascending order. 

*****************************************************/
package client;
import java.util.Scanner;
import java.util.*;


/**
 *
 * @author Ananth
 */
public class Client { // Declare Variables
    

public static void ProgrammerInformation() { /// Declare the programmer Information
    System.out.println("Student Name: Ananth Kadekodi");
    System.out.println("Student Number: 32920719");
    System.out.println("Mode of Enrolment: External");
    System.out.println("Tutor Name: Dr. Mark Abernethy"); 
}
        
        
public static void main(String[] args) {
        
    ProgrammerInformation(); //calls the method for my information

    student[] list = new student[100]; //create a new array list 
    student student = new student(); // Create a new object student of class student
    Client object = new Client(); // Create a new object of class client

    int choice = 0; //variable for the choise of the menu
    int count = 0;

    Scanner keyboard = new Scanner(System.in); //Scanner class and read in choice

    System.out.println("Enter the Number of Students you want to store: ");//Enter amount of students to be stored
    int number = keyboard.nextInt();

    do {           
        student.displayQuestions(); // Display the menu options
        choice = keyboard.nextInt();   //takes the entered value from the user

        if (choice == 2) { 
           // Record the details of the student
            student.studentdata[count]=new student();     
            student.studentdata[count].enterDetails();
            student.studentNumber=count+1;
            count++;
            System.out.println();

        }
            
        if (choice == 3) { // Menu to print out the student details
            System.out.println("All Student Details");
            System.out.println();
            int i=0;
            while(i<count)
            {
                System.out.println("STUDENT "+ (i+1));
                student.studentdata[i].displayOutput();
                i++;
                System.out.println();
            }
            System.out.println();
            
        }
        if (choice == 4) { // Calculate the average marks of all student
            System.out.println("All Students Average Overall Marks");
            System.out.println("Avg Overall Marks : " +student.calTotalAvgMarks());
            System.out.println();
        }
        
        if (choice == 5){  //Calculate the number of people above the average mark and number below average mark
            System.out.println("Total number of Students above/below Average Overall Marks");
            System.out.println();
            student.calStudentsAvgMarks();
            System.out.println();
        }
            
        
        if (choice == 6) {    //To Display the distribution of grades awarded.
            System.out.println("Grades distribution of Students (HD,D,B,C,P,F) ");
            student.countStudentsgrades();
            System.out.println();
        }

        if (choice == 7) { // Display student details based on student ID
            System.out.println("Student details base on ID");
            System.out.print("Please enter student ID: ");
            System.out.println();
            long findID=keyboard.nextLong();
            student.searchID(findID);
            System.out.println();
        }

        if (choice == 8) {  // // Display student details based on name
            System.out.println("Student details based on Name");
            System.out.println();
            System.out.print("Enter First Name : ");
            String useFirstName=keyboard.next();
            System.out.print("Enter Last Name : ");
            String useLastName=keyboard.next();
            student.searchName(useFirstName,useLastName);
            System.out.println();
        }
        
        if (choice == 9) { // Display the first and second highest mark along with the individual's name 
            
            System.out.println("Top two students with higesht marks");
            System.out.println();
            student.locateTop2();
            System.out.println();
        }
            
             
        if (choice == 10) { // Display the sorted array by student id 
            System.out.println("Student details in ascending order based on ID");
            System.out.println();
            student.sortID();
            System.out.println();  
        }
        
        if (choice == 11){ // Display the sorted array by family name 
            System.out.println("Student details in ascending order based on Last Name");
            System.out.println();
            student.sortlastName();
            System.out.println();
        }
           
        if (choice == 12){
            System.out.println("Standard Deviation of the class");
            System.out.println();
            student.calstdDev();
            System.out.println();
        }
    } while (choice != 1); // End do-while loop
 
    
}// End main
    
}// End of class