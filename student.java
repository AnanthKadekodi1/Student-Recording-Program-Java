/*************************************************
Java Assignment 2
Author - Ananth Kadekodi
Date - 8/10/2016
File Name - student.java
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

/**
 *
 * @author Ananth
 */
public class student {
    //The instance vriables of students (this includes their title, first name, family name, 
    // student ID, date of bith, first and second assignment marks, marks of weekly practical works and final exam. 
    //Default constructor
private String title;
private String firstname;
private String familyname;
private int studentid;
private int day;
private int month;
private int year;
private float ass1mark;
private float ass2mark;
private float pracmark;
private float finalmark;
student[] studentdata = new student[100]; 

 //those private instance variables are for the calculation of (first and
 //second assignment mark, mark of weekly practical work and exam mark, final 
// mark and overall mark)

private float ass1markpercentage;
private float ass2markpercentage;
private float pracmarkPercentage;
private float exampercentage;
private String finalgrade;
private float overallmark = 0;

//those private instance variables are to count the the marks
private double Average;
double studentNumber;
private String Grade;



// Setter variables
public student(String title, String firstname, String familyname, int studentid, int day, int month, int year, float ass1mark, String G, float ass2mark, float pracmark, float finalmark) {

    this.title = title;
    this.firstname = firstname;
    this.familyname = familyname;
    this.studentid = studentid;
    this.day = day;
    this.month = month;
    this.year = year;
    this.ass1mark = ass1mark;
    this.ass2mark = ass2mark;
    this.pracmark = pracmark;
    this.finalmark = finalmark;
    this.finalgrade = finalgrade;
    this.Grade = G;
    this.Average = Average;
   
}

//This Method is to display  (title, first name, family name, Student ID, date of birth in day month and year, first and second assignment mark, mark of weekly practical work and final exam)
public student() {

    title = "";
    firstname = "";
    familyname = "";
    studentid = 0;
    day = 0;
    month = 0;
    year = 0;
    ass1mark = 0;
    ass2mark = 0;
    pracmark = 0;
    finalmark = 0;
    Average = 0;
    studentNumber = 0;
    Grade = "D";
    
}

//The methods starting with Get...(), are to return the (title, first name, family name, Student ID, date of birth in day month and year, first and second assignment mark, mark of weekly practical work and final exam and the marks N, P, C, D & HD)
public String getTitle() {
    return title;
}

public String getfirstName() {
    return firstname;
}

public String getfamilyName() {
    return familyname;
}

public int getstudentID() {
    return studentid;
}

public int getDay() {
    return day;
}

public int getMonth() {
    return month;
}

public int getYear() {
    return year;
}

public float getass1Mark() {
    return ass1mark;
}

public float getass2Mark() {
    return ass2mark;
}

public float getpracMark() {
    return pracmark;
}

public float getfinalMark() {
    return finalmark;
}

public String getfinalGrade() {
    return finalgrade;
}


public float getoverallMark() {
    return overallmark;
}

public String getGrade()
{
    return Grade;
}

public double getAverage()
{
    return Average;
}


//The methods starting with Set...(), are to set the (title, first name, family name, Student ID, date of birth in day month and year, first and second assignment mark, mark of weekly practical work and final exam and the marks N, P, C, D & HD)
public void setTitle(String title) {
    this.title = title;
}

public void setfirstName(String firstname) {
    this.firstname = firstname;
}

public void setfamilyName(String familyname) {
    this.familyname = familyname;
}

public void setstudentID(int studentid) {
    this.studentid = studentid;
}

public void setDay(int day) {
    this.day = day;
}

public void setMonth(int month) {
    this.month = month;
}

public void setYear(int year) {
    this.year = year;
}

public void setass1Mark(float ass1mark) {
    this.ass1mark = ass1mark;
}

public void setass2Mark(float ass2mark) {
    this.ass2mark = ass2mark;
}

public void setpracMark(float pracmark) {
    this.pracmark = pracmark;
}

public void setfinalMark(float finalmark) {
    this.finalmark = finalmark;
}

public void setfinalGrade(String finalgrade) {
    this.finalgrade = finalgrade;
}

public void setoverallmark(float overallmark) {
    this.overallmark = overallmark;
}

public boolean equals(student OtherStudent) {
    return (this.firstname.equalsIgnoreCase(OtherStudent.firstname)) && (this.familyname.equalsIgnoreCase(OtherStudent.familyname));
}

public void setGrade(String G)
{
    this.Grade = G;
}

public void setAverage(double Average)
{
    this.Average = Average;
}


// Method to register student details
public void enterDetails(){
    Scanner keyboard = new Scanner(System.in);

    System.out.println("\ntitle of the student (eg, Mr, Miss, Ms, Mrs etc): ");
    title = keyboard.nextLine();

    System.out.println("First name (given name)");
    firstname = keyboard.nextLine();

    System.out.println("A last name (family name/surname)");
    familyname = keyboard.nextLine();

    System.out.println("Student number (ID):");
    studentid = keyboard.nextInt();

    System.out.println("Enter the day of birth(1-31): ");
    day = keyboard.nextInt();

    System.out.println("Enter the month of birth (1-12): ");
    month = keyboard.nextInt();

    System.out.println("Enter The year of birth: ");
    year = keyboard.nextInt();

    System.out.println("Students First Assignment Mark (0 - 100): ");
    ass1mark = keyboard.nextFloat();

    System.out.println("Students Second Assignment Mark (0 - 100): ");
    ass2mark = keyboard.nextFloat();

    System.out.println("Enter the mark of Student weekly practical work (0-10) ");
    pracmark = keyboard.nextFloat();

    System.out.println("Please Enter the Marks for the final Exam(0 - 100): ");
    finalmark = keyboard.nextFloat();


}
    
//this method is for the calculation of (first and second assignment mark, mark of weekly practical work and exam mark, final mark and overall mark)
public float overallMarking() {
    ass1markpercentage = ((ass1mark / 100) * 20); // calculate mark of assessment 1 out of 20%
    ass2markpercentage = ((ass2mark / 100) * 20); // calculate mark of assessment 2 out of 20%
    pracmarkPercentage = ((pracmark / 10) * 10); // calculate mark of prac mark out of 10%
    exampercentage = ((finalmark / 100) * 50); // calculate mark of exam out of 50%
    overallmark = ass1markpercentage + ass2markpercentage + pracmarkPercentage + exampercentage; //calcualtion of the overall mark
    return overallmark;
}

//this function arranges determines and set the grade
public void gradeCalculations() {

    if(overallmark < 50){ // If loop to determine the grade
        Grade = "F";
    }
    else if(overallmark < 60)
    {
        Grade="P";
    }
    else if(overallmark < 70)
    {
        Grade="C";
    }
    else if(overallmark < 80)
    {
        Grade="D";
    }
    else if(overallmark <= 100)
    {
        Grade="HD";
    }
    setGrade(Grade); // set the grade
}

// Method to calculate average marks
public double calTotalAvgMarks()
{
    double sum = 0;
    double AverageNum = 0;
    for (int p = 0; p < studentNumber; p++) {   //This is to take the Average OverallMarks of all students

        sum = (sum + studentdata[p].overallMarking()); 
    }
    AverageNum = (sum/studentNumber); // Calculate average marks
    return AverageNum;
}

// Method to calculate the number of students above and below the average
public void calStudentsAvgMarks()
{
    int above = 0;
        int below = 0; // Above and below variable to calculate the number of students above and below the average
        double sum = 0;
        double AverageNum = 0;

        for (int p = 0; p < studentNumber; p++) {  

            sum = (sum + studentdata[p].overallMarking());
        }
        AverageNum = (sum/studentNumber);

        for(int b=0; b < studentNumber; b++){

        if ((studentdata[b].overallMarking()) > AverageNum) {
            above++;
       }
        else if ((studentdata[b].overallMarking()) < AverageNum) {
            below++;
       }
    }

    System.out.println("The count of numbers above average is " + above);
    System.out.println("The count of number equal to average is " + (studentNumber - below - above));
    System.out.println("The count of numbers below average is " + below);
    
    
}




// Method to calculate student grades
public void countStudentsgrades(){ 
    calTotalAvgMarks();
    int i=0,noHD=0,noD=0,noB=0,noC=0,noP=0,noF=0;

      while(i<studentNumber) // Use if- loop to register the number of particular grades of students. 
      {
          if(studentdata[i].getGrade()=="HD")
            {
                noHD++;
            }
          else if(studentdata[i].getGrade()=="D")
            {
                noD++;
            }
          else if(studentdata[i].getGrade()=="B")
            {
                noB++;
            }
          else if(studentdata[i].getGrade()=="C")
            {
                noC++;
            }
          else if(studentdata[i].getGrade()=="P")
            {
                noP++;
            }
          else
            {
                noF++;
            }
            i++;
      }
    System.out.println("Number of Students with HD [High Distinction] = "+noHD);
    System.out.println("Number of Students with D [Distinction] = "+noD);
    System.out.println("Number of Students with B = "+noB);
    System.out.println("Number of Students with C = "+noC);
    System.out.println("Number of Students with P [Pass] = "+noP);
    System.out.println("Number of Students with F [Fail] = "+noF);
    }

            
 // Method to serch for student given their student ID
public void searchID(long findID)
{
    boolean Found = false;
    // to find with the student ID Number details of the student.
    for (int i = 0; i < studentNumber; i++) {
        if (findID == studentdata[i].getstudentID()) {

            studentdata[i].displayOutput();
            Found = true;
            break;
        } else {
            System.out.println("Student not found");
        }
    }
}

// Method to search for student given their name
public void searchName(String firstName, String lastName)
{
    boolean Found = false;
        //To find the name of the student it loops till the limit of studentnumbers are achieved.
        for (int i = 0; i < studentNumber; i++) {
            if (studentdata[i].getfirstName().equalsIgnoreCase(firstName)&&studentdata[i].getfamilyName().equalsIgnoreCase(lastName))
            {
                studentdata[i].displayOutput();
                Found = true;
                break;
            } else {
                System.out.println("Invalid entry");
            }
        }
}
          
// Method to locate the top two performing students
public void locateTop2()
{
    int i=0;boolean found=false;
    int top1index=0,top2index=0;
    double top1mark=0,top2mark=0,currentStudentMark=0;
    while(i<studentNumber)
    {
        currentStudentMark=studentdata[i].getoverallMark();
        if(currentStudentMark>top1mark)
        {
            top1mark=currentStudentMark;
            top1index=i;
        }
        else if(currentStudentMark>top2mark)
        {
            top1mark=currentStudentMark;
            top2index=i;
        }
        i++;
        }
        System.out.println("Top-1 Student");
        System.out.println("Name : "+studentdata[top1index].getTitle()+" "+studentdata[top1index].getfirstName()+" "+studentdata[top1index].getfamilyName());
        System.out.println("Overall Mark : "+studentdata[top1index].getoverallMark());
            
        System.out.println("Top-2 Student");
        System.out.println("Name : "+studentdata[top2index].getTitle()+" "+studentdata[top2index].getfirstName()+" "+studentdata[top2index].getfamilyName());
        System.out.println("Overall Mark : "+studentdata[top2index].getoverallMark());  
    }
    
// Method to sort students by their ID in ascending order
public void sortID()
{
     int i=0,j=0;int tempid=0,tempindex=0;
        int sortID[][]=new int[100][100];
        while(i<studentNumber)
        {
            sortID[i][0]=(int)studentdata[i].getstudentID();
            sortID[i][1]=i;
            i++;
        }   
        for(i=0;i<studentNumber;i++)
        {
            for(j=1;j<(studentNumber-i);j++)  // selection sort method use to swap variables
            {
                if(sortID[j-1][0] > sortID[j][0])
                {
                    tempid=sortID[j-1][0];
                    tempindex=sortID[j-1][1];
                    sortID[j-1][0]=sortID[j][0];
                    sortID[j-1][1]=sortID[j][1];
                    sortID[j][0]=tempid;
                    sortID[j][1]=tempindex; 
                }
            }
        }
    
        i=0;
        while(i<studentNumber)
        {
            System.out.println();
            studentdata[sortID[i][1]].displayOutput();
            i++;
        }
}

// Method to sort students by their last name in ascending order
public void sortlastName()
{

    int i;
    String t;
    String str1[] = new String [100];
    String str2[] = new String [100];
    for(i = 1; i<studentNumber; i++){

        for(int j=0; j< studentNumber-1;j++){
        str1[j] = studentdata[j].getfamilyName();
        str2[j] = studentdata[j+1].getfamilyName();
            if(str1[j].compareTo(str2[j])<0){ // swapping method use to sort variables
                t = str1[j];
                str1[j] = str2[j];
                str2[j] = t;      
            }
        System.out.println(str2[j]);
        System.out.println(str1[j]);     
    }
           
}
    System.out.println("The ascending order of students surnames are as follows");
    for(i=0; i < studentNumber; i++)
    {
        System.out.println(studentdata[i].getfamilyName());
        studentdata[i].displayOutput();
    }
  }
    

//Method to display the menu options
public void displayQuestions() {

    System.out.println("\n Welcome to the Menu to perform one of the following operations (You must enter a number between 1-7):");
    System.out.println("(1) To quit.");
    System.out.println("(2) Add information about a student.");
    System.out.println("(3) Output the details of all students.");
    System.out.println("(4) Display the average of all students.");
    System.out.println("(5) Display the number of students who obtained an overall mark above and below the average mark");
    System.out.println("(6) Display the distribution of grades.");
    System.out.println("(7) Enter the studentID to view all the details of the student.");
    System.out.println("(8) Enter the student's name to view all the detaisl.");
    System.out.println("(9) Display the students with the highest and second highest overall mark.");
    System.out.println("(10) Display studentID in ascending order.");
    System.out.println("(11) Display student surnames in alphabetical order.");
    System.out.println("(12) Display the Standard Deviation. ");
    System.out.println("\n__________________________________________");
}

//This function displays the details of the student with before calculated marks.
public void displayOutput() {

    System.out.println("\nName: " + getTitle() + " " + getfirstName() + " " + getfamilyName());
    System.out.println("Student ID: " + getstudentID());
    System.out.println("Date of Birth: " + getDay() + "/" + getMonth() + "/" + getYear());
    System.out.println("Assignment 1 Marks: " + getass1Mark());
    System.out.println("Assignment 2 Marks: " + getass2Mark());
    System.out.println("Weekly Practical Marks: " + getpracMark());
    System.out.println("Final Exam Marks: " + getfinalMark());
    System.out.println("Final Marks: " + overallMarking());
    gradeCalculations();
    System.out.println("Final Grade: " + Grade);
}


public void calstdDev()
{
    double sd = 0;
    int i;
    double AverageNum = 0;
    
    double sum = 0;
    for (int p = 0; p < studentNumber; p++) {   //This is to take the Average OverallMarks of all students

        sum = (sum + studentdata[p].overallMarking()); 
    }
    AverageNum = (sum/studentNumber); // Calculate average marks
    
    
    
     for(i=0; i< studentNumber; i++)
     {
         sd+= ((studentdata[i].overallMarking() - AverageNum)*(studentdata[i].overallMarking() - AverageNum))/(studentNumber - 1);
     }
    
     double stdDev = Math.sqrt(sd);
     System.out.println("The standard deviation is: " + stdDev);
}

}// End of class
    
    
    
    
