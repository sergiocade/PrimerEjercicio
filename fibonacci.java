package funciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class fibonacci {
	
	public static int Fibo(int x)
	{	
		if(x==0)
			return 0;
		else
			if(x == 1)
				return 1;
			else
				return Fibo(x-1)+Fibo(x-2);
	}

	public static void main(String[]args) 
	{
		BufferedReader br = new	BufferedReader(new InputStreamReader (System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
	
		try
		{
			int x = Integer.parseInt(br.readLine());
			
			int result = Fibo(x);
			bw.write(result + "\n");
			bw.flush();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}

