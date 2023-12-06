package interfacetests;

import java.util.ArrayList;

public class Driver
{

	public static void main(String[] args)
	{
		
		ArrayList<Tier> tierList = new ArrayList<Tier>();
		ArrayList<Flugmaschinen> maschinenList = new ArrayList<Flugmaschinen>();
		
		Tier a = new Biene("Maya", true);
		Tier b = new Muecke("Bud Spencer", false);
		tierList.add(a);
		tierList.add(b);
		
		Flugmaschinen c = new Jet("Echo", 22000);
		Flugmaschinen d = new Propellermaschine("Dusty", 1);
		maschinenList.add(c);
		maschinenList.add(d);
		
		for(Tier t : tierList)
		{
			abflug((Fliegen) t);
			
		}
		
		for(Flugmaschinen t : maschinenList)
		{
			abflug((Fliegen) t);
			
		}


	}
	
	public static void abflug(Fliegen obj)
	{
		obj.fliegen();
	}

}
