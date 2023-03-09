/**
 * this class tests the RationalNumber class and the compareTo method
 * @author Fanni
 * @version 1.0
 * CS131
 * Project 2
 */
public class ApplicationNumber
{
	//main method
	public static void main(String[] args)
	{
		//create 3 new RationalNumber objects
		RationalNumber num1 = new RationalNumber(6,7);
		RationalNumber num2 = new RationalNumber(1111,111119);
		RationalNumber num3 = new RationalNumber(1112,111119);
		
		//tests compareTo method
		System.out.println("The difference between " + num1.toString()
		+ " and " + num2.toString() + " is less than 0.0001: "
		+ (num1.compareTo(num2)==0));
		System.out.println("The difference between " + num2.toString()
		+ " and " + num3.toString() + " is less than 0.0001: "
		+ (num2.compareTo(num3)==0));
		
	}//end main
}//end class
