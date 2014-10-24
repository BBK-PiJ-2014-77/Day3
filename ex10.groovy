// read some text as a string
//take value for string length
// loop through the string with each letter on a different line with counter++ for each position.

String Input, Stringaddition, Newstring = "", Oldstring = "", Oldrevstring = "", Newrevstring = "";
int counter = 0;
int stringlength;

println ("Give me a string")
Input = System.console().readLine();
stringlength = Input.length();

counter = 0;
while (counter <= stringlength -1) {
	Stringaddition = Character.toString(Input.charAt(counter));
	if (Stringaddition < "z" && Stringaddition >= "A") { 
		Oldrevstring = Newrevstring;
		Newrevstring = Oldrevstring + Stringaddition;
		println (Newrevstring);
	}
	counter++;
}
stringlength = Newrevstring.length();

counter = stringlength - 1;
while  (counter >= 0) {
	Stringaddition = Character.toString(Newrevstring.charAt(counter)); 
	Oldstring = Newstring; 
	Newstring = Oldstring + Stringaddition;
	println (Newstring);
	counter--;
	}
	
if (Newstring.equals (Newrevstring)) {
	println ("This is a palindrome");
	}
	
	 
