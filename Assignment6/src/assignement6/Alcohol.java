package assignement6;

public class Alcohol extends Beverage {

	protected boolean offeredOnWeekend;
	public Alcohol(String name, SIZE sizeOfDrink, boolean OffWeekend)
	{
		super(name, sizeOfDrink);
		offeredOnWeekend = OffWeekend;
		beverageType = TYPE.ALCOHOL;
	}
	public String toString()
	{
		return "Name; " + getBevName() + " Beverage Size: " + getSize() + 
				" Is it offered on the Weekends " + String.valueOf(offeredOnWeekend) +
				" Total price: " + calcPrice();
	}
	public double calcPrice()
	{
		double total = basePrice;
		if(beverageSize == SIZE.MEDIUM)
		{
			total += 1;
		}
		if(beverageSize == SIZE.LARGE)
		{
			total += 2;
		}
		if(offeredOnWeekend)
		{
			total += 0.60;
		}
		return total;
	}

}
