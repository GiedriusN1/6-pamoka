import java.math.BigInteger;

public class SachmatuLenta 
{

	public static void main(String[] args) 
	{
		BigInteger vienas, du, next, grudu;
 	        int langeliu =  64;
	        du = new BigInteger("2");
		vienas = new BigInteger("1");
		next  = new BigInteger("1"); // keliant laipsniu, nereikia siu eiluciu
		grudu = new BigInteger("1"); //
		
       // grudu =  du.pow(langeliu);
       // grudu = grudu.subtract(vienas); 
	   
	   for (int i = 1; i < langeliu; i++) {
		   next = next.multiply(du);
		   grudu = grudu.add(next);
	   }
	
	  System.out.printf("\n" + "Sachmatu lentoje bus " + grudu + " grudu");	
		
 
  }
 }

//18446744073709551615
//18446744073709551615
