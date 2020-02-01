import java.util.Scanner;

//To do:
// Confirm program exits after "string too long"

//Done:
//Take in a word
//Have "Please enter String>" on output
//Check its length
//Reject if too long
//Check it is made up letters
//Make sure capital letters taken care of alphabet check
//Reverse word


public class Palindrome

{
	public static void main(String[] args)
	
	{
		//String alphabet;
		//alphabet = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("Please enter string>");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		int wordLength = word.length();
		String wordlower = word.toLowerCase();
		String reverse = "";
		String palindromeSuccess = "String is a palindrome";
		String palindromeFail = "String is not a palindrome";
		
		
		
		// Check if the length of the word is less than 10 characters long:
		if (wordLength > 10)
			{
			System.out.println("String too long");
			}
		
		
		
		
		// if the word is of ok length, check that all the characters can be found in the alphabet:
		else if (wordlower.matches("[a-z]+"))
			
		
			
			// In which case construct a string of the word in reverse:
			{
				for (int i = word.length() - 1; i >= 0; i-- )
					
					{
					reverse = reverse + word.charAt(i);
					}
				
					// Compare our word to the reversed word, character by character.
					// If we find a single disagreement then we print that it is not
					// a palindrome and terminate the program with an empty return statement.
					// If we never find a disagreement then must have a palindrome and so
					// following the disagreement check is simply the message that you have
					// a palindrome.
					
					for (int i = 0; i <= wordLength - 1; i++)
						
						{
						int word_ch = (int) wordlower.charAt(i);
						int reverse_ch = (int) reverse.charAt(i);
							
							
						if (word_ch != reverse_ch)
							{
							System.out.println(palindromeFail);
							return;
							}
							
							
						}
					System.out.println(palindromeSuccess);
					System.out.println(reverse);
					return;
					
			}
		
		
		// The case for if we find a character that is not in the alphabet
		else
			{
			System.out.println("Invalid input");
			}
		
	}
	
}
