import java.io.*;

public class Kurs
{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	double euro,dollar,erg =0;
	String eingabe=null;
	
	
	public Kurs(double dollar)
	{
		this.dollar=dollar;
		gebeEin();
	}
	
	public static void main(String arg[])
	{
		new Kurs(1.1159);
	}
	
	private void gebeEin()
	{
		do
		{
			try
			{
				System.out.print("Euro eingeben bitte: ");
				eingabe=in.readLine();
				
				euro=Double.valueOf(eingabe.replace(',','.'));
				
				if(euro>0)
				{
					erg=euro*dollar;
					System.out.println("Dollarwer = "+erg);
				}
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("Numerischer Wert erforderlich");
			}
			
			catch(IOException e)
			{
				System.out.println("Ein/Ausgabefehler");
			}
			
			catch(NumberFormatException e)
			{
				System.out.println("Numerischer Wert erforderlich");
			}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage() +"Betreuer holen");
			}
		}
		while (euro!=0);
	}
}