package myfirstpackage;

public abstract class Mensch
{
	private String name;
	private String gebDat;
	private Adresse adresse;

	public abstract void machwa();

	public Mensch(String name, String gebDat, Adresse adresse)
	{
		super();
		this.name = name;
		this.gebDat = gebDat;
		this.adresse = adresse;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getGebDat()
	{
		return gebDat;
	}

	public void setGebDat(String gebDat)
	{
		this.gebDat = gebDat;
	}

	public Adresse getAdresse()
	{
		return adresse;
	}

	public void setAdresse(Adresse adresse)
	{
		this.adresse = adresse;
	}

}
