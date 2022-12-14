package uqu.edu.sa;

/*
 * Programming Assignment 1
 * 
 * An interactive program that performs simple operations 
 * on numbers and characters.
 *
 * CS11211
 *
 */

/*
* After the completion of this assignment, students should be able to: 
*	Declare variables and constants 
*	Declare a variable of type String
*	Declare a constant of type String
*	Use assignment statements 
*	Write simple arithmetic expressions
*	Write simple boolean expressions
*	Perform type casting 
*	Read inputs from the keyboard
* 	Print/display formatted messages on the console  
*/


//write an import statement to include the Scanner class


/*
 * Program Class Defintion
 */
public class App {

    // declare a constant named "PROGRAM" of type String and give it the value:
    // "Simple Operations Program"

    
    /*** computeSum method ***/
    /*
     * computeSum that computes the sum of num1,num2,num3 and returns the result. 
     * For example, if num1=2.0,num2=10.0,num3=1.0, the result is 13
    */
    
    public static int computeSum (double num1, double num2, double num3){

        // declare a variable named "result" of type integer and initialze it to 0

	    // compute the product of the three variables (num1, num2, num3) 
	    // and store the value in the variable "result"

        // Hint: you may want to perform type casting from double to integer before storing 
        // the value of the sum operation to the variable "result"
      
        // write a print statement to display the result's value 

	    return result; 
    }

    /*** computeAverage method ***/
    /*
     * computeAverage that computes the average value of num1,num2,num3 and returns the result. 
     * For example, if num1=2.0,num2=10.0,num3=1.0, the result is 4.3
    */
    
    public static double computeAverage (double num1, double num2, double num3){

        // declare a variable named "result" of type double and initialze it to 0

	    // compute the average of the three variables (num1, num2, num3) 
	    // and store the value in the variable "result"
        
      
        // write a print statement to display the result's value 

	    return result; 
    }

    /*** computeProduct method ***/
    /*
     * computeProduct that computes the product value of num1,num2,num3 and returns the result. 
     * For example, if num1=2.0,num2=10.0,num3=1.0, the result is 20
    */

    public static int computeProduct (double num1, double num2, double num3){

        // declare a variable named "result" of type integer and initialze it to 0

	    // compute the product of the three variables and store the value in the variable "result"
        // Hint: you may want to perform type casting from double to integer before storing 
        // the value of the product operation to the variable result
      
        // write a print statement to display the result's value 

	    return result; 
    }

    /*** compareDate method ***/
    /*
     * compareDate returns true if a given date is before December 12, 2022. 
     * For example, if year= 2021, month= 12 , and day= 12, the method returns false
    */
    public static boolean compareDate (int year, int month, int day){

        // declare a variable named "result" of type boolean and initialze it to false

        // compare the value of year, month, and day with the date Decemeber 12, 2022
        // and store the value in the variable "result"

        
        // write a print statement to display the following message, if the user has 
        // entered year: 2021, month = 12, and day = 12
        // "Is 12/12/2021 before 12/12/2022? true"
        

        return result; 
    }

    /*** convertCharToAscii method ***/
    /*
     * convertCharToAscii that converts a char value to its Ascii code and returns the value
     * For example, if character is 'A', then the method returns the value 65
    */
    public static int convertCharToAscii (char ch){

        // declare a variable named "result" of type integer and initialze it to 0

	    // convert ch to its ascii code value and store the value in "result"
      
        // write a print statement to display the value of the two variables "ch" and "result"
        // For example, assuming that ch has the value 'A' , 
	    // then the program should display the following message
        // The ASCII code of 'A' is 65

	    // Hint: type casting is a must here! 

	    return result; 
    }

    /*** compareChar method ***/
    /*
     * compareChar that compares two characters and returns true if they are equal; otherwise false.
     * For example, if ch1 = 'A' and ch2 ='B', then it returns flase
     * Also, if ch1 ='C' and ch2 = 'C', then it returns true
    */

    public static boolean compareChar (char ch1, char ch2){

        // declare a variable named equalChar of type boolean and initialze it to false

	    // compare the two characters and store the comparison result in the variable "equalChar"
      
        // write a print statement to display the values of the two characters and the result of the comparison
        // For example, assuming that ch1 has the value 'A' and ch2 has the value 'B', 
	    // then the program should display the following message
        // Is 'A' and 'B' equal? false
	    // Hint: note the single qoute (') character has to be printed in the console
	    // you may want to use one the escape characters to do so  

	    return equalChar; 
    }

    /*
     * main()
     *
     * Program execution begins with this method.
     */
    public static void main(String[] args) {


        // write a print statment to display the value of the constant "PROGRAM" 



        // declare a variable named "user" of type String 


        // declare a Scanner varaible to read the user inputs

    
        // Prompt users to enter his/her name and store it in "user"

	
        // write a print statment to display the following 
        // "Hello" and the user's name
        // Example: if the user's name is Ali
        // then the display message is: Hello Ali



        // declare three variables named n1, n2, and n3 of type double
        
	    // declare/use a/the Scanner varaible(s) to read the user inputs
    
        // Prompt users to enter three numbers in n1, n2, and n3


        // declare three variables named year, month, and day of type integer
        
	    // declare/use a/the Scanner varaible(s) to read the user inputs
    
        // Prompt users to enter a date, and save the input in
        // the variables year, month, and day 

	
	    // declare two variables named ch1 and ch2 of type char
        
	    // and initialize them to any values of your choice 




        /**** Do NOT change the following code lines ****/
        computeSum (n1, n2, n3);
        computeAverage (n1, n2, n3);
        computeProduct (n1, n2, n3);
        compareDate (year, month, day);
        convertCharToAscii (ch1);
        compareChar (ch1, ch2);

        
    }
}