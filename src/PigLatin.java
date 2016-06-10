import java.util.Scanner;


public class PigLatin
    {

	public static void main( String[] args )
	{
	   Scanner scan = new Scanner(System.in);
	   
	   
	   System.out.println("Enter the sentence you would like translated");
	   String sentence = scan.nextLine().toLowerCase();
	   
	   String[] words = sentence.split(" ");		//Split the sentence into words and store them into individual cells
	   	   
	   String x = " ";
	  
		for (String s : words)			       //For every individual string in the array
		    {
			//Check every word in the sentence and if it starts with a vowel, execute.
			if(s.startsWith("a") || s.startsWith("e") || s.startsWith("i") || s.startsWith("o") || s.startsWith("u")) 
			    {
				x = s.concat("way");							
			    }
			
			
			// If not, all consonants are placed behind the first vowel and "ay" is added in the end.
			else 
			    {
				
				for(int i = 0; i < s.length(); i++)
				    
				    {
					if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) =='o' || s.charAt(i) == 'u')
					    
					    {
						String cons = s.substring(0, i);		//Stores the letters found before the first vowel into a variable.
						
						String restofSentence = s.substring(i);	       //Stores the rest of the letters into another variable
												
						 x = restofSentence.concat(cons) + "ay";      // combines the two strings
						
						 break;
					    }
				    }
			    }
			
	System.out.print(x);
	System.out.print(" ");
				
		    }
			    
	}
	

    }
