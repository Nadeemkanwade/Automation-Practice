package MinSPCalculate;

import java.util.Scanner;

public class AmazonUK_MinSP 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter PO or Incoming price:");
		float po_value = sc.nextFloat();
		
		System.out.println("Enter weight Handling charge:");
		int wc = sc.nextInt();
		
		System.out.println("Enter pick pack:");
		int pp = sc.nextInt();
		
		System.out.println("Enter category commission:");
		float cat_comm = sc.nextFloat();
		
		double min_sp = (po_value + pp + wc ) /
                (0.75 - ((cat_comm / 100) + 0.07 ));
		
		min_sp = min_sp / 94.337;
		
		System.out.println("Min SP = "+min_sp);
	}
}
