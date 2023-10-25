package schule;

public abstract class Menschen
{
	private String name;
	private int alter;
	private static int id;
	private int counter;


	public Menschen()
	{
		counter= id++;
	}
	
	public  Menschen(String name, int alter)
	{
		this.name = name;
		this.alter = alter;
		counter = id++;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAlter()
	{
		return alter;
	}
	
	public int getId()
	{
		return counter;
	}
	
}

