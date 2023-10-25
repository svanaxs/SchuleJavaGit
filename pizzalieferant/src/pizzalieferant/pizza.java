package pizzalieferant;

public class pizza
{
	private pizzatyp pizzatyp;
	private extras extras;
	private groesse groesse;
	private double gesamtpreis;
	
	

	public pizza(pizzalieferant.pizzatyp pizzatyp, pizzalieferant.extras extras, pizzalieferant.groesse groesse, double gesamtpreis)
	{
		super();
		this.pizzatyp = pizzatyp;
		this.extras = extras;
		this.groesse = groesse;
		this.gesamtpreis = gesamtpreis;
	}

	public pizzatyp getPizzatyp()
	{
		return pizzatyp;
	}

	public void setPizzatyp(pizzatyp pizzatyp)
	{
		this.pizzatyp = pizzatyp;
	}

	public extras getExtras()
	{
		return extras;
	}

	public void setExtras(extras extras)
	{
		this.extras = extras;
	}

	public groesse getGroesse()
	{
		return groesse;
	}

	public double getGesamtpreis()
	{
		return gesamtpreis;
	}

	public void setGesamtpreis(double gesamtpreis)
	{
		this.gesamtpreis = gesamtpreis;
	}

	public void setGroesse(groesse groesse)
	{
		this.groesse = groesse;
	}

	@Override
	public String toString()
	{
		return pizzatyp + " " + extras + " " + groesse + " " + gesamtpreis + " Euro";
	}

}
