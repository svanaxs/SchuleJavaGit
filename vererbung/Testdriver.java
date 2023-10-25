package vererbung;


public class Testdriver
{
	
	public static void main(String args[])
	{
		
		Mitarbeiter[] alleMitarbeiter = new Mitarbeiter[10];
		
		alleMitarbeiter[0] = new Arbeiter("Paul", 17.20, 140);
		alleMitarbeiter[1] = new Angestellter("Kurt", 4000, 500);
		alleMitarbeiter[2] = new Praktikanten("Olga", 500);
		alleMitarbeiter[3] = new Chef("Otto", 7000);
		
		for(int i = 0; i<4;i++)
		{
			System.out.println(alleMitarbeiter[i]);
			System.out.println(alleMitarbeiter[i].berechneEntgelt());
			
		}
		
		
	}
	
}