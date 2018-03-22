package primerproyrvto;

import java.util.Scanner;

public class segundo {
	
	 public static void main(String[] args) 
	    {
	Scanner leer = new Scanner (System.in);
    int n,cont=0,low=100000,high
=0;
    double p=0;
    do
    {
        cont=cont+1;
        System.out.println("Digite el " + cont + " numero");
        n=leer.nextInt();
        if(n<0)
        {
            System.out.println("El numero que digito es incorrecto");
            cont=cont-1;    
        }
        if(n>high)
        {
        	high=n;             
        }
        if(n<low)
        {
        	low=n;
        }
        p=p+n;  
    }while(cont!=10);
     p=n/10;
     System.out.println("numero mayor es el:"+high);
     System.out.println("numero menor es el:"+low);
     System.out.println("el promedio es:"+p);
 
	    }
}
