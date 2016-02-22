/*
Name: Alexander Georgiadis (RezTech)
Date Started: 2/22/2016
Description: This is a simple program which generates a number and then asks for the customer to re-enter it to be used with RTPWJ (Ready To Program With Java).
*/

import java.awt.*;
import hsa.Console;

public class RandomNumber_Educational
{
    static Console c;
    static Console d; //This is the seccond console, which will be used later on for displaying the number
    static int randomNumber; //Make this number publicly available to all methods

    public static void main (String[] args)
    {
	randomNumber = generateNumber (); //Assign the return value of the randomNumber array to the randomNumber int
	printNumber (); //Print the number into console "c"
	guessNumber (); //Ask the user to input the number from console "c" into console "d"
    }


    public static int generateNumber ()
    {
	double localRandomNumber = (100 * Math.random ()); //Generates a random double value between 0-100 (100*.001 = 0 - 100*.999 = 100)
	return (int) localRandomNumber; //Round our double into an int, and return it
    }


    public static void printNumber ()
    {
	c = new Console (); //Open console "C"
	c.println (randomNumber); //Prints the value of our random number into console "c"
    }


    public static void guessNumber ()
    {
	//Variables
	String respondedNumber, actualNumber = Integer.toString (randomNumber); //Converts our actual number into a String for easy comparison

	//Prompt
	d = new Console (); //Opens console "d"
	d.println ("Please enter the number that you see in the other console!"); //Prompt the user to enter the number from console "c"
	respondedNumber = d.readString (); //Record that assumed number in a String

	//Test
	if (respondedNumber.equals (actualNumber)) //Check to see if the number entered is the same as the number displayed
	{
	    d.println ("Congrats, you guessed the correct number!");
	}

	else //Just incase they got the number incorrect, it will default to this. This is because they either got it correct, or incorrect
	{
	    d.println ("Shucks, you must have mistyped something! Better luck next time.");
	}
    }
}
