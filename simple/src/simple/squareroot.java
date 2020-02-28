package simple;

import java.util.Scanner;

public class squareroot {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		double res;
		System.out.println("enter the value of x:");
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		int square=x*x;
		res=Math.sqrt(x);                          //we can write like this also 
		System.out.println("square root is:"+res);// System.out.println(Math.sqrt(x));
		System.out.println("square of x is:"+square);
		
	}

}
