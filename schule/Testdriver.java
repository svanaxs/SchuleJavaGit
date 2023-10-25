package schule;
import java.util.Scanner;

public class Testdriver
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int eingabe;
		Menschen[] alleMenschen = new Menschen[50];
		alleMenschen[0] = new Lehrer("Olaf",60,"Mathe");
		alleMenschen[1] = new Schueller("Max", 12,10);
		System.out.println("Hallo");
		System.out.println(alleMenschen[0]);
		System.out.println(alleMenschen[1]);
		
		
		
		
		while(true)
		{
			System.out.println("(1)Lehrer (2)Schüler");
			int count = 0;
			eingabe = sc.nextInt();
			System.out.println(eingabe);
			
			if(eingabe == 1)
			{
				System.out.println("Alter: ");
				int alter = sc.nextInt();
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Fach: ");
				String fach = sc.nextLine();
				
				alleMenschen[count] = new Lehrer(name, alter, fach);
				System.out.println(alleMenschen[count]);
			}
			
			if(eingabe == 2)
			{
				System.out.println("Alter: ");
				int alter = sc.nextInt();
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Klasse: ");
				int klasse = sc.nextInt();
				alleMenschen[count] = new Schueller(name, alter, klasse);
				System.out.println(alleMenschen[count]);
				
			}
			
			eingabe = 0;
			count++;
		}
		
	}

}