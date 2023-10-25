package vererbung;

	public class Adresse
	{
			private String strasse;
			private int plz;
			private String ort;
			
			
			public Adresse()
			{
			}
			
			public Adresse(String strasse)
			{
				this.strasse = strasse;
			}
			
			public Adresse(String strasse, int plz)
			{
				this.strasse = strasse;
				this.plz = plz;
			}
			
			public Adresse(String strasse, int plz, String ort)
			{
				this.strasse = strasse;
				this.plz = plz;
				this.ort = ort;
			}
			
			public String getStrasse()
			{
				return strasse;
			}
			
			public String getOrt()
			{
				return ort;
			}
			
			public int getPlz()
			{
				return plz;
			}
			
			public void setStrasse(String strasse)
			{
				this.strasse = strasse;
			}
			
			public void setOrt(String ort)
			{
				this.ort = ort;
			}
			
			public void setPlz(int plz)
			{
				this.plz = plz;
			}
			
			public String toString()
		{
			return "Straße: " + strasse + " Plz: " + plz + " Ort: " + ort + "\n";
		}
		
			
	}