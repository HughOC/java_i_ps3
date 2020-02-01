import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.*;


// To Do:
//Include uppercase letters

public class Letters
{
	public static void main( String[] args )
	{
		BufferedReader reader = null;
		if (args.length != 1)
		{
			System.out.println("Usage: java WordCount File");
			System.exit( 1 );
		}
		try
		{
			reader = new BufferedReader( new FileReader( args[0]) );
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("Error opening file '" + args[0] + "'");
		}
		
		boolean done = false;
		String inputLine = null;
		
		while (!done)
		{
			try
			{
				inputLine = reader.readLine();
			}
			catch( IOException ioe)
			{
				System.out.println("I/O error");
				System.exit(3);
			}
			if(inputLine == null)
			{
				done = true;
			}
			else
			{
				StringTokenizer tokenizer= new StringTokenizer( inputLine);
				while (tokenizer.hasMoreTokens())
				{
					String word = tokenizer.nextToken();
					char[] wordarray = word.toCharArray();
					int nchars = wordarray.length;
					int element;
					//Take each member of the alphabet:
					for (char alphabet = 'a'; alphabet <= 'z'; alphabet++)
					{
						//compare all the elements of text file to one letter of alphabet:
						int count = 0;
						String alphaString = String.valueOf(alphabet);
						String alphaUpperString = alphaString.toUpperCase();
						char alphaUpperChar = alphaUpperString.charAt(0);
						//System.out.println(alphaUpperChar);
						for (element = 0; element <= nchars - 1; element++)
						{
							
									
							if ( wordarray[element] == alphabet || wordarray[element] == alphaUpperChar  )
								count++;
						}
						String letter;
						letter = String.valueOf(alphabet);
						System.out.println(letter + "  " + count );
						
					}
					
				}
			}
			
		}
		
		try
		{
			reader.close();
		}
		catch (IOException ioe)
		{
			System.out.println("Error opening file '" + args[0] + "'");
			System.exit(4);
		}
		
		
		
	
	}
}