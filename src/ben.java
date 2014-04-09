import java.util.*;

public class ben {
	public ben() {
		int counter;
		double rtt;
		double srtt;
		double rto;
	}
		
		
	public int calculate() {
		int counter = 0;
		double rtt = 10;
		double srtt = 0;
		double rto = 2 * srtt;
		while (rto <= 1000) {
			counter++;
			System.out.println("srtt is " + srtt);
			System.out.println("rto is " + rto);
			System.out.println("counter is" + counter);
			srtt = ((100-counter) * rtt + counter * 1000)/100;
			rto = 2 * srtt;
			System.out.println("srtt is " + srtt);
			System.out.println("rto is " + rto);
		}

		return counter;
	}	


	public static void main(String args[]) {
		ben tester = new ben();
		int result = tester.calculate();
		System.out.println(result);
	}
}