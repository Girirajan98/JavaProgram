package org.basicPrograms;

public class AmstrongNumber {
	
	public static void main(String[] args) {
		
	
	
	int n= 1634;
	int num =n;
	int dig=0, rem=0 ,res=0;
	
	// to find the count of digit 
	
	while(num>0) {
		dig++;
		num=num /10;
	}
	
	System.out.println("the sum of digits "+dig);
	
	num=n;
	while (num>0) {
	rem=num%10;
	
	res=(int)(res+Math.pow(rem, dig));
	
	num=num/10;
	}
	
	if (n==res) {
		System.out.println(n+" the Amstrong number");
	} else {
		System.out.println(n+" Non Amstrong number ");
	}
	
	}
	

}
