package bioinformatica;
import java.io.BufferedReader;
import java.io.FileReader;

public class SearchMotif {
	
	
	public int ocurrences = Integer.MIN_VALUE;
	public String motif="";
	
	public int countOcurrences(String candidate)
	{
		int counter = 0 ;
		
		try
		{
		FileReader file = new FileReader("sequences.txt");
		BufferedReader br = new BufferedReader(file);
		
		String sequence=br.readLine();
		int length = candidate.length();
		while(sequence != null)
			{
				for(int i = 0 ; i < sequence.length() - length + 1 ; i++)
				{
					if(sequence.subSequence(i, i + 3).equals(candidate))
						counter += 1;
				}
			}
		}
		catch(Exception ex) {}
		
		return counter;
	}

	public void verifycandidate(String motif)
	{
		int temp =countOcurrences(motif);
		
		if (temp>ocurrences )
		{
			this.motif = motif;
			this.ocurrences = temp;
		}
	}
	
	public void  getcombinations(String sebsequence , int size)
	{
		String tempSequence;
		if (size == 1 )
		{
			tempSequence= sebsequence + "A";
			verifycandidate(tempSequence);
			
			tempSequence= sebsequence + "c";
			verifycandidate(tempSequence);
			
			tempSequence= sebsequence + "G";
			verifycandidate(tempSequence);
			
			tempSequence= sebsequence + "T";
			verifycandidate(tempSequence);
			
		}
		else 
		{
			getcombinations(sebsequence + "A", size - 1);
			getcombinations(sebsequence + "C", size - 1);
			getcombinations(sebsequence + "G", size - 1);
			getcombinations(sebsequence + "T", size - 1);
		}
			
	}
}
