import java.util.*;

public class rtt {
	public rtt() {
		int counter;
		double srtt;
		double rttvar;
		double rto;
	}
		
		
	public int calculate() {
		int counter = 0;
		double srtt = 10;
		double rttvar = 0;
		double rto = srtt + rttvar * 4;
		System.out.println("rttvar is " + rttvar);
		System.out.println("srtt is " + srtt);
		System.out.println("rto is " + rto);
		while (rto <= 1000) {
			counter++;
			rttvar = 0.125 * (1000 - srtt) + 0.875 * rttvar;
			srtt = 0.75 * srtt + 0.25 * 1000;
			rto = srtt + 4 * rttvar;
			System.out.println("rttvar is " + rttvar);
			System.out.println("srtt is " + srtt);
			System.out.println("rto is " + rto);
		}

		return counter;
	}	


	public static void main(String args[]) {
		rtt tester = new rtt();
		int result = tester.calculate();
		System.out.println(result);
	}
}