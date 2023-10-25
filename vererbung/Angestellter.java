package vererbung;

	public class Angestellter extends Mitarbeiter
	{
		private double gehalt;
		private double zulage;
		
		
		public Angestellter()
		{
		}
		
	
		public Angestellter(double gehalt, double zulage)
		{
			this.gehalt = gehalt;
			this.zulage = zulage;
		}
		
		public Angestellter(String name, Adresse adresse, double gehalt, double zulage)
		{
			super(name,adresse);
			this.gehalt = gehalt;
			this.zulage = zulage;
		}
		
		public Angestellter(String name, double gehalt, double zulage)
		{
			super(name);
			this.gehalt = gehalt;
			this.zulage = zulage;
		}
		
		@Override
		public double berechneEntgelt()
		{
			return gehalt + zulage;
		}
		
	
	}