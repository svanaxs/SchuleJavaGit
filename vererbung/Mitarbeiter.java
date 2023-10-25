package vererbung;

	public abstract class Mitarbeiter
	{
		private  String name;
		private Adresse adresse;
		private double bonus;

		public abstract double berechneEntgelt();
		
		public double berechneEntgelt(double bonus)
		{
			return berechneEntgelt() + bonus;
		}
		
		public Mitarbeiter()
		{
		}
		
		public Mitarbeiter(String name)
		{
			this.name = name;
		}
		
		public Mitarbeiter(Adresse adresse)
		{
			this.adresse = adresse;
		}
		
		public Mitarbeiter(String name, Adresse adresse)
		{
			this.name = name;
			this.adresse =adresse;
		}
		
		public String getName()
		{
			return name;
		}
		
		public Adresse getAdresse()
		{ 
			return adresse;
		}
		
	}