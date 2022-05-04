package assignement6;

public class Coffee extends Beverage {
protected boolean extraShotOfCoffee;
protected boolean extraSyrup;


public Coffee(String bevName, SIZE bevSize, boolean shotCoffee, boolean coffeeSyrup)
{
	super(bevName,bevSize);
	extraShotOfCoffee = shotCoffee;
	extraSyrup = coffeeSyrup;
	beverageType = TYPE.COFFEE;
}
@Override
public String toString()
{
	String shotCoffee;
	String coffeeSyrup;
	if(extraShotOfCoffee)
	{
		shotCoffee = "Yes";
	}
	else 
	{
		shotCoffee = "No";
	}
	if(extraSyrup)
	{
		coffeeSyrup = "Yes";
	}
	else
	{
		coffeeSyrup = "No";
	}
return "Beverage name: " + beverageName + "Beverage type: " + beverageType +" Beverage Size: " + beverageSize + " Extra Shot of Coffee: " + shotCoffee + 
		"Extra Syrup: " + coffeeSyrup + "Total Price: " + calcPrice() ;
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
	if(extraShotOfCoffee)
	{
		total += 0.50;
	}
	if(extraSyrup)
	{
		total += 0.50;
	}
	
	return total;
}
public boolean getExtraShot() {
	boolean isEqual;
	if(extraShotOfCoffee == false)
	{
		isEqual = false;
	}
	else 
	{
		isEqual = true;
	}
	return isEqual;
		
}
public boolean getExtraSyrup() {
	boolean isEqual;
	if(extraSyrup == false)
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
