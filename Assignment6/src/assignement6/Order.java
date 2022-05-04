package assignement6;

import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> {
	protected int orderNumber;
	protected double orderTime;
	protected DAY dayoftheWeek;
	protected Customer main;
	protected ArrayList<Beverage> Beverages = new ArrayList<>();

	public int randomNum() {
		Random r = new Random();
		int number = r.nextInt(10000, 90001);
		return number;
	}

	public boolean isWeekend() {
		boolean isEqual;
		if (dayoftheWeek == DAY.SATURDAY || dayoftheWeek == DAY.SUNDAY) {
			isEqual = true;
		} else {
			isEqual = false;
		}
		return isEqual;
	}

	public Order(int orderNum, DAY days, Customer a) {
		orderNumber = orderNum;
		dayoftheWeek = days;
		main = new Customer(a.name, a.age);

	}

	public void addNewBeverage(String beverageName, SIZE size, boolean extraShotOfCoffee, boolean extraSyrup) {
		Beverage newBev = new Coffee(beverageName, size, extraShotOfCoffee, extraSyrup);
		Beverages.add(newBev);
	}

	public void addNewBeverage(String bevName, SIZE size) {
		Beverage newBev = new Alcohol(bevName, size, isWeekend());
		Beverages.add(newBev);
	}

	public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addPRotien) {
		Beverage newBev = new Smoothie(bevName, size, numOfFruits, addPRotien);
		Beverages.add(newBev);
	}
	public double calcOrderTotal()
	{
		double total = 0;
		for(int i = 0; i < Beverages.size(); i++)
		{
			total += Beverages.get(i).calcPrice();
		}
		return total;
	}
	public int findNumOfBeveType(TYPE type)
	{
		int total = 0;
		for (int i = 0; i < Beverages.size(); i++)
		{
			if(Beverages.get(i).beverageType == type)
			{
				total++;
			}
		}
		return total;
	}
	public Beverage getBeverage(int itemNo)
	{
		return Beverages.get(itemNo);
	}

	@Override
	public int compareTo(Order o) {
		int number = 0;
		if(o.orderNumber == orderNumber)
		{
			number = 0;
		}
		else if(o.orderNumber < orderNumber)
		{
			number = 1;
		}
		else if(o.orderNumber > orderNumber)
		{
			number = -1;
		}
		return number;
	}
	public String toString()
	{
		String beverages = "";
		for (int i = 0; i < Beverages.size(); i++)
		{
			beverages += Beverages.get(i).toString();
			beverages += System.lineSeparator();
		}
		return "Order number: " + orderNumber + " Order time: " + orderTime + " Order day: " + dayoftheWeek 
				+ "Customer name " + main.name + " Customer age: " + main.age + beverages + "Order total " + calcOrderTotal();
				
	}
	public int getTotalItems()
	{
		return Beverages.size();
	}

	public int getOrderNo() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(double Time) {
		orderTime = Time;
	}

	public DAY getOrderDay() {
		return dayoftheWeek;
	}

	public void setDayoftheWeek(DAY dayoftheWeek) {
		this.dayoftheWeek = dayoftheWeek;
	}

	public Customer getCustomer() {
		return main;
	}

	public void setMain(Customer main) {
		this.main = main;
	}

	public ArrayList<Beverage> getBeverages() {
		return Beverages;
	}

	public void setBeverages(ArrayList<Beverage> beverages) {
		Beverages = beverages;
	}

	

	
	}
	


