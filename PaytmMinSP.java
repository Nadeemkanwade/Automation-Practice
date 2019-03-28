package MinSPCalculate;

import java.util.Scanner;

public class PaytmMinSP {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Incoming price:");
		float incoming_pr = sc.nextFloat();
		
		System.out.println("Enter Category Commission:");
		float cat_comm = sc.nextFloat();
		
		System.out.println("Enter HSN rate:");
		float hsn = sc.nextFloat();
		
		System.out.println("ENter Threshold Amount :");
		long threshold_amt = sc.nextLong();
		
		System.out.println("Enter Weight Handling Charge:");
		int wc = sc.nextInt();
		
		System.out.println("Enter Pick Pack:");
		int pp = sc.nextInt();
		
		System.out.println("Enter Buymore commission:");
		int buy_comm = sc.nextInt();
		
		float min_sp = (((incoming_pr + wc + pp)*hsn)) / 
				           (1-(((cat_comm + buy_comm )/100)* hsn));
		
		if(min_sp > threshold_amt)
		{
			System.out.println("Min SP is more than Threshold value");
			System.out.println("Enter HSN rate:");
			hsn = sc.nextFloat();
			
			min_sp = (((incoming_pr + wc + pp)*hsn)) / 
			           (1-(((cat_comm + buy_comm )/100)* hsn));
	
			System.out.println("Min SP = "+min_sp);
		}
		else
		{
			System.out.println("Min SP = "+min_sp);
		}
			
	}

}
