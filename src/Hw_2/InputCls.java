package Hw_2;

import java.util.Scanner;

public class InputCls {
	
	private String mlksrl="1000111";
	private String eggsrl="1000122";
	private String ricsrl="1000144";
	private String dalsrl="1000166";
	private String sltsrl="1000155";
	
	
	private String line1= ("---------------------------------------------------------------------------------------------------");
	private String top1= ("===================================Walmart Supercenter ============================================");
	private String phn= ("================================Phone Number: 347-323-6567 ========================================");
	private String addrs= ("=================================16605 HILLSIDE AVENUE ============================================");
	private String thnk= ("============================Thank You for Visiting Us================================================");
	private String fedbck= ("======================Give Us Feedback on @survey.walmart.com========================================");
	
	private String itemnm= ("Item Serial Number \t Iteam Name \t Iteam Price\t Item Quantity \t Total Iteam Price");
	private double sales_Tax=6.5;
	private double milktotl;
	private double eggstotl;
	private double ricetol;
	private double daltotl;
	private double salttotl;
	private double totlwt;
	private double Alltotlal;
	
	//create block and using /n,/t
	{
		System.out.println ();
		System.out.println ();
		System.out.println ("\tPrices List of the Items\t");
		System.out.println ("\t------------------------\t");
		System.out.println("\tMilk Price is - $10.30 \n\tEggs is -       $15.70\n\tRice Price is - $22.50\n\tDal Price is -  $10.50\n\tSalt Price is - $11.30");
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	public InputCls () {
		
		
		
			Scanner scan= new Scanner(System.in);

			System.out.println();
			//milk price
			System.out.print("Please Enter the Milk Price- ");
			double mp=scan.nextDouble ();
			//Milk Quantity
			System.out.print("Please Enter the Milk Quantity- ");
			int mq=scan.nextInt ();
			//Eggs price
			System.out.print("Please Enter the Eggs Price- ");
			double ep=scan.nextDouble();
			//Egg Quantity
			System.out.print("Please Enter the Eggs Quantity- ");
			int eq=scan.nextInt ();
			System.out.print("Please Enter the Rice Price- ");
			double rp=scan.nextDouble();
			//Rice Quantity
			System.out.print("Please Enter the Rice Quantity- ");
			int rq=scan.nextInt ();
			System.out.print("Please Enter the Dal Price- ");
			double dp=scan.nextDouble();
			//Dal Quantity
			System.out.print("Please Enter the Dal Quantity- ");
			int dq=scan.nextInt ();
			System.out.print("Please Enter the Salt Price- ");
			double sp=scan.nextDouble();
			//Salt Quantity
			System.out.print("Please Enter the Salt Quantity- ");
			int sq=scan.nextInt ();
		//Create object for Prices Class
			Prices pr= new Prices(mp, ep, rp, dp, sp);
			// //Create object for product Class
			Products_Quantity pq= new Products_Quantity (mq, eq, rq, dq, sq);
			
			
			
			
			//calculation
			totlwt=(mp*mq)+(ep*eq)+(rp*rq)+(dp*dq)+(sp*sq);
			Alltotlal=totlwt+totlwt*(sales_Tax/100);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			//print a gloable variable
			System.out.println(top1);
			System.out.println(phn);
			System.out.println(addrs);
			System.out.println();
			System.out.println(itemnm);
			System.out.println(line1);
			System.out.println(mlksrl+"                  "+"MILK"+"            "+mp+"             "+mq+"               "+mp*mq);
			System.out.println(eggsrl+"                  "+"EGGS"+"            "+ep+"             "+eq+"               "+ep*eq);
			System.out.println(ricsrl+"                  "+"RICE"+"            "+rp+"             "+rq+"               "+rp*rq);
			System.out.println(dalsrl+"                  "+"DAAL"+"            "+dp+"             "+dq+"               "+dp*dq);
			System.out.println(sltsrl+"                  "+"SALT"+"            "+sp+"             "+sq+"               "+sp*sq);
			System.out.println(line1);
			System.out.println("Total Including 6.5% Tax -                                                "+Alltotlal);
			System.out.println();
			System.out.println();
			System.out.println(thnk);
			System.out.println(fedbck);
			//Close Scanner
			scan.close();

}
}