package primerproyrvto;

import java.util.Scanner;

public class primer {

    public static void main(String[]args)
    {
         Scanner leer = new Scanner(System.in);
         int v[] = new int[10];
         int mayor=0,cont=0,cont10=0,cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,cont6=0,cont7=0
        		 ,cont8=0,cont9=0;
     
         
         for ( int x = 0; x < 10; x++)
            {
                System.out.println(" digite el numero");
                v[x]=leer.nextInt();
            } 
         if (v[0] == v[1]||v[0] == v[2]||v[0] == v[3]||v[0] == v[4]||v[0] == 
        		 v[5]||v[0] == v[6]||v[0] == v[7]||v[0] == v[8]||v[0] == v[9]||v[0] == v[10] )	 
         {
        	 cont++;
         }else if (v[1] == v[2]||v[1] == v[3]||v[1] == v[4]||v[1] ==  v[5]||v[1]
        		 == v[6]||v[1] == v[7]||v[1] == v[8]||v[1] == v[9]||v[1] == v[10] )	 
         	{
         		cont1++;
         	}
         	else if (v[2] == v[3]||v[2] == v[4]||v[2] == v[5]||v[2] == v[6]||v[2] == 
        		 v[7]||v[2] == v[8]||v[2] == v[9]||v[2] == v[10] )	 
         		{
         			cont2++;
         		}
         	else if (v[3] == v[4]||v[3] == v[5]||v[3] == v[6]||v[3] == v[7]||v[3] ==
        		 v[8]||v[3] == v[9]||v[3] == v[10] )	 
         		{
         			cont3++;
         		}
         	else if (v[4] == v[5]||v[4] == v[6]||v[4] == v[7]||v[4] == v[8]||v[4] == v[9]||v[4] == v[10] )	 
         		{
         			cont4++;
         		}
         	else if (v[5] == v[6]||v[5] == v[7]||v[5] == v[8]||v[5] == v[9]||v[5] == v[10]  )	 
         		{
        	 		cont5++;
         		}	
         	else if (v[6] == v[7]||v[6] == v[8]||v[6] == v[9]||v[6] == v[10])	 
         			{
         				cont6++;
         			}
         	else if (v[7] == v[8]||v[7] == v[9]||v[7] == v[10])	 
         		{
         		cont7++;
         		}
         	else if (v[8] == v[9]||v[8] == v[10])	 
         		{
         		cont8++;
         		}	
         	else if (v[9] == v[10])	 
         		{
         		cont9++;
         		}
         
         	if(cont > cont1 ||cont > cont2||cont > cont3||cont > cont4||cont > cont5||cont > cont6
        		 ||cont > cont7||cont > cont8||cont > cont9)
        	 {
        	 	mayor = cont;
        	 	System.out.println("el que mas se repite : " + v[0]);
        	 }else {
        		 if(cont1 > cont2||cont1 > cont3||cont1 > cont4||cont1 > cont5||cont1 > cont6
                		 ||cont1 > cont7||cont1 > cont8||cont1 > cont9)
                	 {
                	 	mayor = cont1;
                	 	System.out.println("el que mas se repite : " + v[1]);
                	 }else 
                	 {
                		 if(cont2 > cont3||cont2 > cont4||cont2 > cont5||cont2 > cont6
                        		 ||cont2 > cont7||cont2 > cont8||cont2 > cont9)
                        	 {
                        	 	mayor = cont2;
                        	 	System.out.println("el que mas se repite : " + v[2]);
                        	 }else 
                        	 {
                        		 if(cont3 > cont4||cont3 > cont5||cont3 > cont6
                                		 ||cont3 > cont7||cont3> cont8||cont3 > cont9)
                                	 {
                                	 	mayor = cont2;
                                	 	System.out.println("el que mas se repite : " + v[3]);
                                	 }
                        		 else 
                            	 {
                            		 if(cont4 > cont5||cont4 > cont6 ||cont4 > cont7||
                            				 cont4> cont8||cont4 > cont9)
                                    	 {
                                    	 	mayor = cont4;
                                    	 	System.out.println("el que mas se repite : " + v[4]);
                                    	 }
                            		 else 
                                	 {
                                		 if(cont5 > cont6 ||cont5 > cont7||
                                				 cont5> cont8||cont5 > cont9)
                                        	 {
                                        	 	mayor = cont5;
                                        	 	System.out.println("el que mas se repite : " + v[5]);
                                        	 }
                                		 else 
                                    	 {
                                    		 if(cont6 > cont7||cont6> cont8||cont6 > cont9)
                                            	 {
                                            	 	mayor = cont6;
                                            	 	System.out.println("el que mas se repite : " + v[6]);
                                            	 } 
                                    		 else 
                                        	 {
                                        		 if(cont7> cont8||cont7 > cont9)
                                                	 {
                                                	 	mayor = cont7;
                                                	 	System.out.println("el que mas se repite : " + v[7]);
                                                	 } 
                                        		 else 
                                            	 {
                                            		 if(cont8 > cont9)
                                                    	 {
                                                    	 	mayor = cont8;
                                                    	 	System.out.println("el que mas se repite : " + v[8]);
                                                    	 } 
                                	 
                                            	 }
                            	 
                            	 
                            	 
                            	 
                                        	 }
        	 
                                    	 }
         
        
   
                                	 }
                            	 
                            	 }

                        	 }

                	 }
        	 
        	 }
         }

}