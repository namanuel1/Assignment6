package assignement6;

public class Smoothie extends Beverage {
	protected int numOfFruits;
	protected boolean isThereProtein;
	
	public Smoothie(String name, SIZE smoothieSize, int numberOfFruits, boolean proteinPowder)
	{
		super(name,smoothieSize);
		numOfFruits = numberOfFruits;
		isThereProtein = proteinPowder;
		beverageType = TYPE.SMOOTHIE;
		
	}
	@Override
	public String toString()
	{
		return "Beverage Name: " + getBevName() + "Beverage Type: " + getType() + 
				"Beverage Size: " + getSize() + " Is protein added: " + String.valueOf(isThereProtein) + 
				" Number of Fruits: " + " " + getNumOfFruits() + "Price: " + calcPrice();
	}
	public boolean equals(Smoothie a)
	{
		boolean isEqual;
		if(getBevName() == a.getBevName() && getSize() == a.getSize() && getType() == a.getType() && a.numOfFruits == numOfFruits 
				&& isThereProtein == a.isThereProtein)
		{
			isEqual = true;
			
		}
		else 
		{
			isEqual = false;
		}
		return isEqual;
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
		if(isThereProtein)
		{
			total += 1.50;
		}
		total += numOfFruits * 0.50;
		return total;
	}
	public int getNumOfFruits()
	{
		return numOfFruits;
	}
	public boolean getAddProtein() {
		boolean isEqual;
		if(isThereProtein == false)
		{
			isEqual = false;
		}
		else 
		{
			isEqual = true;
		}
		return isEqual;
	}

}
