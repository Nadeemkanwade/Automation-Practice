package MinSPCalculate;

import java.util.Scanner;

public class LimeroadMinSP
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter PO or Incoming price:");
		float po_value = sc.nextFloat();
		
		System.out.println("Enter HSN rate:");
		float hsn = sc.nextFloat();
		
		System.out.println("Enter Pick Pack:");
		int pp = sc.nextInt();
		
		System.out.println("Enter category commission rate:");
		float cat_comm = sc.nextFloat();
		
		System.out.println("Enter Buymore commission:");
		int buy_comm = sc.nextInt();
		
		float min_sp = (po_value + pp) * hsn /
				 (1 - (((cat_comm + buy_comm)/100) * hsn));
		
		System.out.println("Min SP = "+min_sp);
	}
}
