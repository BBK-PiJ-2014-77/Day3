//ask for a string
//ask for a letter

//step through looking for that letter

String Input = "", Letter = "";
int counter = 0;
int stringlength = 0, letternumber = 0;
char letter;

println ("Give me a string")
Input = System.console().readLine();
stringlength = Input.length();

println ("Give me a letter")
Letter = System.console().readLine();
letter = Letter.charAt(0);


while  (counter < stringlength) {
	if ( letter == Input.charAt(counter)) {
	letternumber++;
	}
	counter++
	}
println ("There are " + letternumber + " " + Letter + "'s");
