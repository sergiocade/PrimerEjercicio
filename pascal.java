package funciones;

import java.io.*;

public class pascal {
	
	public static int Pascal(int n, int k)
	{
		if (k==0 || k==n)
			return 1;
		else
				return Pascal(n-1, k-1)+ Pascal(n-1, k);
	
	}
	public static void main(String[]args) 
	{
		BufferedReader br = new	BufferedReader(new InputStreamReader (System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
	
		try
		{
			int n = Integer.parseInt(br.readLine());
			int k = Integer.parseInt(br.readLine());
			
			int result = Pascal(n,k);
			bw.write(result + "\n");
			bw.flush();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}	

}
