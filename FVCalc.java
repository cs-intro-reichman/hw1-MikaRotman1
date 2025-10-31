// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	int currentValue = 100;
	double rate = 10;
	int n = 2;
    double futureValue = currentValue * Math.pow(1+ rate,n) / 100;
	System.out.println("After " + n+  " years, $" + currentValue +" saved at "+ rate+"% will yield $"+ (int)futureValue);
	}
}