//works out length of string
//counts through from end noting place of decimal and removing commas
//turns it into an integer
//divides by 2
//puts back decimal at the correct place
//re inserts commas

String Input, Stringaddition, Newstring = "", Oldstring = "", Oldrevstring = "", Newrevstring = "";
int counter = 0, value = 0, decimal = 0;
int stringlength;

println ("Give me a string")
Input = System.console().readLine();
stringlength = Input.length();

counter = 0;
while (counter <= stringlength -1) {
	Stringaddition = Character.toString(Input.charAt(counter));
	if (Stringaddition > "0" && Stringaddition <= "9") { 
		Oldrevstring = Newrevstring;
		Newrevstring = Oldrevstring + Stringaddition;
		println (Newrevstring);
	}
	if (Stringaddition.equals( ".") ){
		decimal = stringlength - (counter+1);
		println (decimal);
	}
	counter++;
}

value = Integer.parseInt(Newrevstring);
value = value/2;
String Halfstring = Integer.toString(value);
println (Halfstring);
int newstringlength = Halfstring.length();
counter = 0;
boolean added = false;

while (counter <= newstringlength -1 ) {
	if (counter == (newstringlength - decimal) && added == false ) {
	Stringaddition = ".";
	Oldstring = Newstring;
	Newstring = Oldstring + Stringaddition;
	added = true;
	}
	else {
	Stringaddition = Character.toString(Halfstring.charAt(counter));
		Oldstring = Newstring;
		Newstring = Oldstring + Stringaddition;
		println (Newstring);
	counter++;
	println (counter);
	}
}

	
	



