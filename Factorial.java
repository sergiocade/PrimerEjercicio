package funciones;
import java.io.*;
public class Factorial {

	public static int Fact(int n)
	{	
		if(n == 1)
			return 1;
		else
			return n* Fact(n-1);
	}
	
	public static void main (String[]args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try
		{
			int n = Integer.parseInt(br.readLine());
			
			int result= Fact(n) ;
			bw.write(result + "\n");
			bw.flush();
			
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}