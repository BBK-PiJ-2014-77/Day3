import java.util.Scanner;
public class ex1
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// accept to numbers as doubles
// print a list of options 1-4 
double n1 = 0.0, n2 = 0.0, answer = 0.0;
String Number1 = "", Number2 = "", operator = "";
System.out.println ("first number");
Number1 =  System.console().readLine(); 
n1 = Double.parseDouble(Number1);
System.out.println ("second number");
Number2 =  System.console().readLine(); 
n2 = Double.parseDouble(Number2);
System.out.println ("What operation? +,-,/,*");
operator = System.console().readLine(); 

		if (operator.equals("+")) {
			answer = n1 + n2;
		}
		else if (operator.equals("-")) {
			answer = n1 - n2;
		}
		else if (operator.equals("/")) {
			answer = n1 / n2;
		}
		else if (operator.equals("*")) { 
			answer = n1 * n2;
		}

			
System.out.println (answer);
}}

