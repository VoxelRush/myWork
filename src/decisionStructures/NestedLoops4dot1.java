package decisionStructures;

import java.util.Scanner;

public class NestedLoops4dot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		int maxDivisors =0;
		for(int k=1;k<=1000;k++) 
		{	int divisors = 0;
		
			for(int j = 1; j<=k/2;j++)
			{ if(k%j==0) 
			 {
				 divisors++;
			}
	if(divisors > maxDivisors) {
		maxDivisors = divisors;
		number = k;
	}
		 System.out.println(maxDivisors);

}}}}

