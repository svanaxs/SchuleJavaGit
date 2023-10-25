package einstieg;


	
	//Klassendefinition
	public class Personal
	{
		//Instanzattribut => besitzt jedes objekt individuell
		private String name;
		private String gebDat;
		private double gehalt;
		private int personalnummer;
		//Klassenattribut => besitzen alle Objekte 1x für die Klasse gemeinsam
		private static int anzahl;
		private Adresse adresse;
		
		
		
		//Konstruktor => Erzeugung von Objekten / Instanzen
	
		public Personal() //ohne Parameter sog. Standardkonstruktor
		{

			personalnummer = ++anzahl;
			
		}
	
		public Personal(String name)
		{
			this.name = name; //Name der Klasse = name Übergabeparameter
			personalnummer = ++anzahl;
		}
	
		public Personal(String name, double gehalt)
		{
			this.name = name;
			this.gehalt = gehalt;
			personalnummer = ++anzahl;
		}
		
		public Personal(double gehalt, String gebDat)
		{
			this.name = name;
			this.gebDat = gebDat;
			personalnummer = ++anzahl;
		}
	
		public Personal(String name, String gebDat, double gehalt)
		{
			this.name = name;
			this.gehalt = gehalt;
			this.gebDat = gebDat;
			personalnummer = ++anzahl;
		}
		
		public Personal(String name, String gebDat, double gehalt, Adresse adresse)
		{
			this.name = name;
			this.gehalt = gehalt;
			this.gebDat = gebDat;
			personalnummer = ++anzahl;
			this.adresse = adresse;
		}
		
		//Setter z.B. für Name
		public void setName(String name)
		{
			this.name = name;
		}
		
		public void setAdresse(Adresse adresse)
		{
			this.adresse = adresse;
		}
	
		public Adresse getAdresse()
		{
			return adresse;
		}
		
		//Getter z.B. für gehalt
		public double getGehalt()
		{
			return gehalt;
		}
		
		public String getName()
		{
			return name;
		}
		
		public String getGebDat()
		{
			return gebDat;
		}
		
		@Override //Wir ersetzen die Default Methode
		public String toString()
		{
			return "Mein Name ist " + name + ". Ich verdiene " + gehalt + " Euro und bin am " + gebDat + " geboren. Meine PersoNummer ist " + personalnummer + ".\nIch wohne hier " + adresse ;
		}
	}
	
	
