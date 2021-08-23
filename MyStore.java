import java.util.Scanner;
import java.util.*;
import java.text.*;
public class MyStore {
	public static void main(String[] args) {
		Receipt r=new Receipt();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Product name:");
		String pn=sc.next();
		System.out.print("Enter Product id:");
	    String pid=sc.next();
	    System.out.print("Enter transaction id:");
	    long tid=sc.nextLong();
	    System.out.print("Enter Product price:");
	    double pp=sc.nextDouble();
	    System.out.print("Enter how many units purchased:");
	    int nou=sc.nextInt();
	    System.out.print("Enter amount of money paid:");
	    double acp=sc.nextDouble();
	    Date dNow = new Date( );
	      
	    SimpleDateFormat ft1 = new SimpleDateFormat ("dd/MM/yyyy");
	    System.out.println("------------------------------------------------------------------------");
		System.out.println("                                MY STORE                                ");
		System.out.println("                     123 MG RD BANGALORE KA IN 560001                   ");
		System.out.println("                              STORE #:22222                             ");
		System.out.println("                      THANK YOU FOR YOUR SHOPPING                       ");
		System.out.println("                           TRANSACTION #: "+tid+"                            ");
		System.out.println("                              Date: "+ft1.format(dNow)+"                          ");
		System.out.println("------------------------------------------------------------------------");
		
		Receipt rr=new Receipt(pn,pid,tid,pp,nou,acp);
		rr.calculate();
	}
	

}
