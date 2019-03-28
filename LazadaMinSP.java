package MinSPCalculate;

import java.util.Scanner;

public class LazadaMinSP 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter PO or Incoming price:");
		float po_value = sc.nextFloat();
		
		System.out.println("Enter weight handling charge:");
		int wc = sc.nextInt();
		
		System.out.println("Enter Pick Pack:");
		int pp = sc.nextInt();
		
		System.out.println("Enter category commission rate:");
		float cat_comm = sc.nextFloat();
		
		double min_sp = (((po_value) * 1.13) + pp + wc) /
				 (0.75 - (cat_comm/100));
		
		min_sp = min_sp / 17.69;
		
		System.out.println("Min SP = "+min_sp);
	}
}
