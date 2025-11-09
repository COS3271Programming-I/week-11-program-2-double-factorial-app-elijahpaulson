package DoubleFactorialAPP;
import java.util.Scanner;
import java.util.InputMismatchException;
public class DoubleFactorialAPP {
	static Scanner userinput = new Scanner(System.in);
	// make the function that calculates the factorial
	// number has to be >2 to get a factorial
	static int factorial(int num) {
		if (num==0||num==1||num==2) {
			return num;
		}
		int count=0;
		int numb=num;
		while (numb>2) {
			numb=numb-2;
			count++;
		}
		int ans=num;
		for (int i=0;i<count;i++) {
			ans=ans*(num-((i+1)*2));
		}
		return ans;
	}	
	// make the error trapping method that gets the correct input type
	static String inputexception() {
		while (true) {
			try {
				System.out.print("Enter an integer that you would like the double factorial of.");
				int integer=userinput.nextInt();
				int ans=factorial(integer);
				String res="The double factorial of "+integer+" is: "+ans;
				//return the string
				return res;
			}
			catch (InputMismatchException e) {
				System.out.print("Enter the correct input type (integer).\n");
				userinput.nextLine();
			}
		}
	}
	// call the functions and print the results
	public static void main(String[] args) {
		String res=inputexception();
		System.out.println(res);
	}
}
