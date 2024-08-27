package Hw_3;

import java.util.Scanner;

public class ifels {
	
	
	{
		System.out.println(" 93-100 A\n 90-92  A-\n 87-99  B+\n 83-86  B \n 80-82  B-\n 77-79  C+\n 73-76  C\n 70-72  C-\n 67-69  D+ \n 64-66  D");
	}
	
	public ifels (){
		// Setup a Scanner 
		Scanner scan=new Scanner(System.in);
		System.out.print("Please Insert Number- ");
		double Input=scan.nextDouble();
		if(Input>=93 && Input<=100) {
			System.out.print("This Student got A");}
			else if (Input>=90 && Input<=92) {
				System.out.print("This Student got A-");}
		
			else if (Input>=87 && Input<=89) {
				System.out.print("This Student got B+");}
			else if (Input>=83 && Input<=86) {
				System.out.print("This Student got B");}
			else if (Input>=80 && Input<=82) {
				System.out.print("This Student got B-");}
			else if (Input>=77 && Input<=79) {
				System.out.print("This Student got C+");}
			else if (Input>=73 && Input<=76) {
				System.out.print("This Student got C");}
			else if (Input>=70 && Input<=72) {
				System.out.print("This Student got C-");}
			else if (Input>=67 && Input<=69) {
				System.out.print("This Student got D+");}
			else if (Input>=64 && Input<=66) {
				System.out.print("This Student got D");}
			else {
				System.out.print("This Student got F");
			}
		scan.close();
		}
	
		

}

