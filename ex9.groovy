// read some text as a string
//take value for string length
// loop through the string with each letter on a different line with counter++ for each position.

String Input, Stringaddition, Newstring = "", Oldstring = "", Outputstring = "";
int counter = 0;
int stringlength;

println ("Give me a string")
Input = System.console().readLine();
stringlength = Input.length();
counter = stringlength - 1;

while  (counter >= 0) {
	Stringaddition = Character.toString(Input.charAt(counter));
	Oldstring = Newstring; 
	Newstring = Oldstring + Stringaddition;
	println (Newstring);
	counter--;
	}
	
Outputstring = Input + Newstring;

println (Outputstring);
	
	 
