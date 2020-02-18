import java.math.BigInteger;

public class SachmatuLenta 
{

	public static void main(String[] args) 
	{
		BigInteger vienas, du, grudu;
 	    int langeliu =  64;
	    du = new BigInteger("2");
		vienas = new BigInteger("1");
        grudu =  du.pow(langeliu);
        BigInteger rez = grudu.subtract(vienas); 
	
	  System.out.print(rez);	
		
 
  }
 }
