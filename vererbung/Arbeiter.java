package vererbung;

	public class Arbeiter extends Mitarbeiter
	{
		private double lohnStd;
		private int anzStd;
		
		public Arbeiter()
		{
		}
		
		public Arbeiter(double lohnStd)
		{
			this.lohnStd = lohnStd;
		}
		
		public Arbeiter(int anzStd)
		{
			this.anzStd = anzStd;
		}
		
		public Arbeiter(double lohnStd, int anzStd)
		{
			this.lohnStd = lohnStd;
			this.anzStd = anzStd;
		}
		
		public Arbeiter(String name, Adresse adresse, double lohnStd, int anzStd)
		{
			super(name,adresse);
			this.lohnStd = lohnStd;
			this.anzStd = anzStd;
		}
		
		public Arbeiter(String name, double lohnStd, int anzStd)
		{
			super(name);
			this.lohnStd = lohnStd;
			this.anzStd = anzStd;
		}
		
		
		@Override
		public double berechneEntgelt()
		{
			return lohnStd * anzStd;
		}
		
		@Override
		public String toString()
		{
			return super.getName() + " " + super.getAdresse() + " " + lohnStd + " " + anzStd; 
		}
	}