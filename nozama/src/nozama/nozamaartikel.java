package nozama;

public class nozamaartikel
{
	private String name;
	private int id;
	private float preis;
	
	
	
	public nozamaartikel( int id, String name, float preis)
	{
		this.name = name;
		this.id = id;
		this.preis = preis;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public float getPreis()
	{
		return preis;
	}
	public void setPreis(float preis)
	{
		this.preis = preis;
	}
	
	
	@Override
	public String toString()
	{
		return name + preis;
	}

}
