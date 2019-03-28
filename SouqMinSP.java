package MinSPCalculate;

import java.util.Scanner;

public class SouqMinSP 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter PO or Incoming price:");
		float po_value = sc.nextFloat();
		
		System.out.println("Enter weight Handling charge:");
		int wc = sc.nextInt();
		
		System.out.println("Enter Pick pack:");
		int pp = sc.nextInt();
		
		System.out.println("Enter category commission rate:");
		float cat_comm = sc.nextFloat();
		
		if(po_value < 600)
		{
			double min_sp = (po_value + wc + pp) / 0.63;
			
			min_sp = min_sp / 19.7 ;
			System.out.println("Min SP = "+min_sp);

		}
		else
		{
			double min_sp = (po_value + wc + pp) / 
				     (1 - ( cat_comm + 10 + 7) / 100);
			
			min_sp = min_sp / 19.7 ;
			
			System.out.println("Min SP = "+min_sp);
		}
		
		
	}
}
