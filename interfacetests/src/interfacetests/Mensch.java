package interfacetests;

public class Mensch extends Tier
{
	private boolean kannJava;

	public Mensch(String name, boolean kannJava)
	{
		super(name);
		this.kannJava = kannJava;
	}

	public boolean isKannJava()
	{
		return kannJava;
	}

	public void setKannJava(boolean kannJava)
	{
		this.kannJava = kannJava;
	}

}
