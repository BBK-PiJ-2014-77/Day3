import java.util.Scanner;
public class ex3b
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// ask How much the purchase
// ask how much paid
//loop for 50's then 20 then 10 then 5 etc
//print change

String Charge = "", Paid = "";
Double c1 = 0.00, p1 = 0.00, p2 = 0.00;
int fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0, fiftyp = 0, twentyp = 0, tenp = 0, fivep = 0, twop = 0, onep = 0, currency = 0;   

//println ("How much charged?");
//Charge =  System.console().readLine(); 
//c1 = Double.parseDouble(Charge);
//println ("How much paid?");
//Paid =  System.console().readLine(); 
//p1 = Double.parseDouble(Paid);
//p2 = p1 - c1;



//fifty = changegiven( p2, 50.00);
//twenty = changegiven( p2, 20.00);
//ten = changegiven( p2, 10.00);
//five = changegiven( p2, 5.00);
//two = changegiven( p2, 2.00);
//one = changegiven( p2, 1.00);
//fiftyp = changegiven( p2, 0.5);
//twentyp= changegiven( p2, 0.2);
//tenp = changegiven( p2, 0.1);
//fivep = changegiven( p2, 0.05);
//twop = changegiven( p2, 0.02);
//onep = changegiven( p2, 0.02);
	
System.out.println ("Your change in notes is " + fifty + " fifties, " + twenty + " twenties, " + ten + " tens, " + five + " fives.");
System.out.println ("Your change in coins is " + two + " two pound coins, " + one + " one pound coins, " + fiftyp + " fifty pence coins " + twentyp + " twenty pence coins, " + tenp + " ten pencecoins " + fivep + " five pence coins, " + twop + " two pence coins and " + onep + " pennies.");    
} private static int changegiven(Double change, double currency) {
	int counter;
	while (change >= currency) {
		counter++;
		change = change - currency;
		change = Math.round(change*100);
		change = change/100;
	}
	return counter;
}

	
	
}

