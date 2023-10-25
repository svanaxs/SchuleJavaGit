package einstieg;
import java.io.*;



public class Testdriver
{
	
	//static main Methode zum Starten der Logik / des Prozesses
	public static void main(String arg[])
	{
		//Typ Bezeichnung = Wert;
		int zahl = 5;
		int zahler = 0;
		
		
		Adresse wue = new Adresse ("Hauptstraße", 97070, "Wuerzburg");
		Adresse berlin = new Adresse("Astraße" , 83424, "Berlin");
		Adresse frankfurt = new Adresse("Bstraße" , 52424, "Frankfurt");
		
		
		
		Personal karl = new Personal("Karl", "21.06.1965", 1500.62, new Adresse ("Hauptstraße", 97070, "Wuerzburg"));
		Personal sandra= new Personal("Sandra", "13.03.2000", 500, wue);
		
		Personal[] mitarbeiter = new Personal[50];
		mitarbeiter[zahler++] = karl;
		mitarbeiter[zahler++] = sandra;
		mitarbeiter[zahler++] = new Personal("bogus", "01.01.1950", 2000.23, wue);
		mitarbeiter[zahler++] = new Personal("binted", "31.12.2022", 8900.928, wue);
		
		
		System.out.println("============================================================================");
		
		for(int i = 0; i < mitarbeiter.length; i++)
		{
			if(mitarbeiter[i] != null)
			{
				System.out.println(mitarbeiter[i]);
			}
			
		}
		System.out.println("============================================================================");
		/*
		mitarbeiter[1].setAdresse(berlin);
		mitarbeiter[2].setAdresse(berlin);
		
		for(int i = 0; i < mitarbeiter.length; i++)
		{
			if(mitarbeiter[i] != null)
			{
				System.out.println(mitarbeiter[i]);
			}
			
		}
		System.out.println("============================================================================");
		
		
		mitarbeiter[1].setAdresse(wue);
		mitarbeiter[2].setAdresse(frankfurt);
		
		for(int i = 0; i < mitarbeiter.length; i++)
		{
			if(mitarbeiter[i] != null)
			{
				System.out.println(mitarbeiter[i]);
			}
			
		}
		System.out.println("============================================================================");
		*/
		while(true)
		{
			double gehalt = 0;
			String name = null;
			String datum = null;
			String strasse = null;
			int plz = 0;
			String ort = null;
			String eingabe=null;
			
			System.out.println("Neuen Mitarbeiter anlegen");
			// ===========================================================
			System.out.println("Name: ");
			try
			{
				BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
				
				eingabe = in.readLine();
				name = eingabe;
			}
			catch(Exception e)
			{
				System.err.println("Fehler");
			}
			// ===========================================================
			System.out.println("Geburtsdatum: ");
			try
			{
				BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
				
				eingabe = in.readLine();
				datum = eingabe;
			}
			catch(Exception e)
			{
				System.err.println("Fehler");
			}
			// ===========================================================
			System.out.println("Gehalt: ");
			try
			{
				BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
				
				eingabe = in.readLine();
				gehalt = Double.parseDouble(eingabe);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Numerischer Wert erforderlich");
			}
			catch(NumberFormatException e)
			{
				System.out.println("Numerischer Wert erforderlich");
			}
			catch(Exception e)
			{
				System.err.println("Fehler");
			}
			// ===========================================================
			System.out.println("Straße: ");
			try
			{
				BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
				
				eingabe = in.readLine();
				strasse = eingabe;
			}
			catch(Exception e)
			{
				System.err.println("Fehler");
			}
			// ===========================================================
			System.out.println("Plz: ");
			try
			{
				BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
				
				eingabe = in.readLine();
				plz = Integer.parseInt(eingabe);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Numerischer Wert erforderlich");
			}
			catch(NumberFormatException e)
			{
				System.out.println("Numerischer Wert erforderlich");
			}
			catch(Exception e)
			{
				System.err.println("Fehler");
			}
			// ===========================================================
			System.out.println("Ort: ");
			try
			{
				BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
				
				eingabe = in.readLine();
				ort = eingabe;
			}
			catch(Exception e)
			{
				System.err.println("Fehler");
			}
			// ===========================================================
			mitarbeiter[zahler++] = new Personal(name, datum, gehalt, new Adresse(strasse,plz,ort));
			
			System.out.println("============================================================================");
			for(int i = 0; i < mitarbeiter.length; i++)
			{
				if(mitarbeiter[i] != null)
				{
					System.out.println(mitarbeiter[i]);
				}
				
			}
			System.out.println("============================================================================");	
		}
		
		
		
	}

}