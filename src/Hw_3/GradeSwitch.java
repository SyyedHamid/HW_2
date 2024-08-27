package Hw_3;

import java.util.*;

public class GradeSwitch {
	{
		System.out.println(" 90-100 A\n 80-89  A-\n 70-79  B\n 60-69  B- \n 50-59  C");
	}
	
	public GradeSwitch (){

	//Setup a Scanner for User Input
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Please Insert The  Number of the Student- ");
	double Input=scan.nextDouble();
	
	// Had to use Casting cuz switch dosen't work for Double
	switch ((int)Input/10) {
	
	case 10:
	case 9: System.out.println("Excellent!");
		System.out.print("This Student got A");
	break;
	case 8: System.out.print("This Student got A-");
	break;
	case 7: System.out.print("This Student got B");
	break;
	case 6: System.out.print("This Student got B-");
	break;
	case 5: System.out.print("This Student got C");
	break;
	default:System.out.print("This Student F");
	}
}
}