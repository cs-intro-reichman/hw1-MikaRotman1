// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	int number1 = Integer.parseInt(args[0]);
	System.out.println(number1/100 + " hundreds," + (number1/10)%10 + " tens, and " + number1%10 + " ones.");
     
	}
}
