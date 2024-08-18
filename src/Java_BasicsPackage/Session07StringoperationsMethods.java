package Java_BasicsPackage;

import java.net.MulticastSocket;

public class Session07StringoperationsMethods {

	public static void main(String[] args) {

		/*
		 * Strings are collection of characters. in java, strings are treated as a object.
		 */
		
		
		// ChatAt method:- iska use characters ki position ko find karne k liye kiya jata hai.
		
		String s="Hello java"; //H=0, e=1, l=2,l=3,o=4, space=5, j=6,a=7,v=8,a=9  space between the alphabets is also counted as a character
		 System.out.println(s.charAt(9));
		
		 //-------------------------to know the size of the character
		 System.out.println(s.length());
		 
		 //----------------------to lowercase
	System.out.println(s.toLowerCase());
	
	//------------------------------to Uppercase
	System.out.println(s.toUpperCase());
	
	//--------------------replace method:- iska use ld character ko new character se change karne k liye kiya jata hai. ya to sequence of character ko change karne k liye kiya jata hai.
	System.out.println(s.replace('a', 'i'));//used to replace character
	System.out.println(s.replace("java", "python"));// used to replce character sequence
	
	//Index of method:- used to identify the index of the character
	System.out.println(s.indexOf('j'));
	
	//substring method: iska use hum kisi ki character k aage k value ko  print karwane k liye use karte hai.
	System.out.println(s.substring(4));
	
	//isEmpty method: used to identy that the string is empty or not
	System.out.println(s.isEmpty());
	
	//print middle values of the character
	System.out.println(s.substring(1, 5));
	
	//contains method:- iska use islye hota hai taaki pata chal sake ki specifies values characer me availbel hai ki nahi
	System.out.println(s.contains("java"));
	
	
	
	
	
	
		
	}

}
