// read some text as a string
//take value for string length
// loop through the string with each letter on a different line with counter++ for each position.

String Input;
int counter = 0;
int stringlength;

println ("Give me a string")
Input = System.console().readLine();
stringlength = Input.length();

while  (counter < stringlength) {
	print ( Input.charAt(counter));
	print (" ");
	counter++
	}
	 
