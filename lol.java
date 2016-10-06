/*
Name: Francisco Garcia
Student ID: 10159534
Tutorial #: T06
Date: January 28, 2015

This program will take a five digit number from the user keyboard and rearrange each individual digit into the largest integer number.
For example if the user number provided is 48761, the largest integer number is going to be 87641.
Additionally if the user provides a five digit number and it is already the largest integer number possible, the program will print "BINGO"
*/

import java.util.Scanner;
public class A1Part1
{
    public static void main (String [] args)
    {
	Scanner keyboard = new Scanner (System.in);
	System.out.print("Enter a five digit integer number: ");

	/**
	 * The five digit number provided by the user is assigned to the userNumber variable.
	 */
	int userNumber;
	userNumber = keyboard.nextInt();
	System.out.println();
	System.out.println("The number entered is: " +  userNumber);
	System.out.println();

	/**
	 * Each individual digit of the number provided by the user are parsed and stored in the variable parseOneA, parseTwoA, parseThreeA, parseFour and parseFive.
	 * The variables parseOneB, parseTwoB and parseThreeB are used to carry out intermediate calculations.
	 */
	
	int parseOneA, parseOneB;
	parseOneA = userNumber / 10000;
	parseOneB = userNumber - (parseOneA*10000);
	
	int parseTwoA, parseTwoB;
	parseTwoA = parseOneB / 1000;
	parseTwoB = parseOneB - (parseTwoA*1000);

	int parseThreeA, parseThreeB;
	parseThreeA = parseTwoB / 100;
	parseThreeB = parseTwoB - (parseThreeA*100);

	int parseFour, parseFive;
	parseFour = parseThreeB / 10;
	parseFive = parseThreeB - (parseFour*10);

	String comma;
	comma = ", ";
	System.out.print("The digits in " + userNumber + " are: ");
	System.out.println(parseOneA + comma  + parseTwoA + comma  + parseThreeA + comma  + parseFour + comma  +  parseFive);
	System.out.println();

	/**
	 * Each individual digit is then rearranged in descending order and stored in the variables valueOne, valueTwo, valueThree, valueFour and valueFive respectively.
	 */

	int valueOne;
	valueOne = parseOneA;

	int valueTwo;
	valueTwo = -1;
	if (parseTwoA >= valueOne){
	    valueTwo = valueOne;
	    valueOne = parseTwoA;}
	else if (parseTwoA < valueOne){
	    valueTwo = parseTwoA;}

	int valueThree;
	valueThree = -1;
	if (parseThreeA >= valueOne){
	  valueThree = valueTwo;
	  valueTwo = valueOne;
	  valueOne = parseThreeA;}
	else if (parseThreeA >= valueTwo){
	    valueThree = valueTwo;
	    valueTwo = parseThreeA;}
       	else if (parseThreeA < valueTwo){
	    valueThree = parseThreeA;}

	int valueFour;
	valueFour = -1;
	if (parseFour >= valueOne){
	    valueFour = valueThree;
	    valueThree = valueTwo;
	    valueTwo = valueOne;
	    valueOne = parseFour;}
	else if (parseFour >= valueTwo){
	    valueFour = valueThree;
	    valueThree = valueTwo;
	    valueTwo = parseFour;}
	else if (parseFour >= valueThree){
	    valueFour = valueThree;
	    valueThree = parseFour;}
       	else if (parseFour < valueThree){
            valueFour = parseFour;}

	int valueFive;
	valueFive = -1;
	if (parseFive >= valueOne){
	    valueFive = valueFour;
	    valueFour = valueThree;
	    valueThree = valueTwo;
	    valueTwo = valueOne;
	    valueOne = parseFive;}
	else if (parseFive >= valueTwo){
	    valueFive = valueFour;
	    valueFour = valueThree;
	    valueThree = valueTwo;
	    valueTwo = parseFive;}
	else if (parseFive >= valueThree){
	    valueFive = valueFour;
	    valueFour = valueThree;
	    valueThree = parseFive;}
	else if (parseFive >= valueFour){
	    valueFive = valueFour;
	    valueFour = parseFive;}
	else if (parseFive < valueFour){
	    valueFive = parseFive;}
       

	/**
	 * Once the program rearranges the digits into the largest integer number, it is stored in the largestNumber variable.
	 * The program then compares the userNumber variable and the largestNumber variable, and if they are the same it prints BINGO at the end.
	 */

	int largestNumber;
	largestNumber = (valueOne*10000) + (valueTwo*1000) + (valueThree*100) + (valueFour*10) + valueFive;
	System.out.println("The largest number with these digits is: " + largestNumber);
	System.out.println();

	if (userNumber == largestNumber){
	    System.out.println("      ******      *******     *           *      *******       *******  ");
	    System.out.println("      *     *        *        * *         *      *      *     *       * ");
	    System.out.println("      *     *        *        *   *       *      *      *     *       * ");
	    System.out.println("      ******         *        *     *     *      *            *       * ");
	    System.out.println("      *     *        *        *       *   *      *    ***     *       * ");
	    System.out.println("      *     *        *        *         * *      *      *     *       * ");
	    System.out.println("      ******      *******     *           *      ********      *******  ");} 
		
    }
}
      
