package funciones;
import java.io.*;
public class multiplicacion {

	public static int mult (int n, int x)
	{
		if (x==1)
			return n;
		else
			return n + mult(n, x-1);
	}
	
	public static int Fact(int n)
	{	
		if(n == 1)
			return 1;
		else
			return n* Fact(n-1);
	}
	
		
	public static void main (String[]args)
	{
		BufferedReader br = new	BufferedReader(new InputStreamReader (System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
	
		try
		{
			int n = Integer.parseInt(br.readLine());
			int x = Integer.parseInt(br.readLine());
			
			int result = mult(n,x);
			bw.write(result + "\n");
			bw.flush();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}