import java.util.Scanner;
public class ex3
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// ask How much the purchase
// ask how much paid
//loop for 50's then 20 then 10 then 5 etc
//print change

String Charge = "", Paid = "";
double c1 = 0.00, p1 = 0.00, p2 = 0.00;
int fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0, fiftyp = 0, twentyp = 0, tenp = 0, fivep = 0, twop = 0, onep = 0;   

System.out.println ("How much charged?");
Charge =  System.console().readLine(); 
c1 = Double.parseDouble(Charge);
System.out.println ("How much paid?");
Paid =  System.console().readLine(); 
p1 = Double.parseDouble(Paid);
p2 = p1 - c1;

while (p2 >= 50) {
	fifty++;
	p2 = p2 - 50.00;
	p2 = Math.round(p2*100);
	p2 = p2/100;
	}
System.out.println (p2);
while (p2 >= 20) {
	twenty++;
	p2 = p2 - 20.00;
	p2 = Math.round(p2*100);
	p2 = p2/100;
	}
System.out.println (p2);
while (p2 >= 10) {
	ten++;
	p2 = p2 - 10.00;
	p2 = Math.round(p2*100);
	p2 = p2/100;
	}
System.out.println (p2);
while (p2 >= 5) {
	five++;
	p2 = p2 - 5.00;
	p2 = Math.round(p2*100);
	p2 = p2/100;
	}
System.out.println (p2);
while (p2 >= 2) {
	two++;
	p2 = p2 - 2.00;
	p2 = Math.round(p2*100);
	p2 = p2/100;
	}
System.out.println (p2);
while (p2 >= 1) {
	one++;
	p2 = p2 - 1.00;
	p2 = Math.round(p2*100);
	p2 = p2/100;
	}
System.out.println (p2);
while (p2 >= 0.5) {
	fiftyp++;
	p2 = p2 - 0.5;
	p2 = Math.round(p2*100);
	p2 = p2/100;
	}
System.out.println (p2);
while (p2 >= 0.2) {
	twentyp++;
	p2 = p2 - 0.2;
	p2 = Math.round(p2*100);
	p2 = p2/100;
	}
System.out.println (p2);
while (p2 >= 0.1) {
	tenp++;
	p2 = p2 - 0.1;
	p2 = Math.round(p2*100);
	p2 = p2/100;
	}
System.out.println (p2);
while (p2 >= 0.05) {
	fivep++;
	p2 = p2 - 0.05;
	p2 = Math.round(p2*100);
	p2 = p2/100;
	}
System.out.println (p2);
while (p2 >= 0.02) {
	twop++;
	p2 = p2 - 0.02;
	p2 = Math.round(p2*100);
	p2 = p2/100;
	}
System.out.println (p2);
while (p2 >= 0.01) {
	onep++;
	p2 = p2 - 0.01;
	p2 = Math.round(p2*100);
	p2 = p2/100;
	}
System.out.println (p2);
	
System.out.println ("Your change in notes is " + fifty + " fifties, " + twenty + " twenties, " + ten + " tens, " + five + " fives.");
System.out.println ("Your change in coins is " + two + " two pound coins, " + one + " one pound coins, " + fiftyp + " fifty pence coins " + twentyp + " twenty pence coins, " + tenp + " ten pencecoins " + fivep + " five pence coins, " + twop + " two pence coins and " + onep + " pennies.");    
	
	
}}

