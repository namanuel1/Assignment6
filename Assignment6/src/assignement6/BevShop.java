package assignement6;

import java.util.ArrayList;

import org.hamcrest.core.Is;

public class BevShop implements BevShopInterfce {
	protected int numOfAlcoholDrinks;
	ArrayList <Order> orderList = new ArrayList<>();
	protected int currentOrdernumber = 0;
	
	public Order getCurrentOrder() {
		return orderList.get(currentOrdernumber);
	}
	Customer newCustomer;
	
	public boolean validTime(int time)
	{
		boolean isEqual;
		if(time >= MIN_TIME && time <= MAX_TIME)
		{
			isEqual = true;
		}
		else 
		{
			isEqual = false;
		}
		return isEqual;
	}
	public boolean eligibleForMore()
	{
		boolean isEqual;
		if(numOfAlcoholDrinks < MAX_ORDER_FOR_ALCOHOL)
		{
			isEqual = true;
		}
		else 
		{
			isEqual = false;
		}
		return isEqual;
	}
	public  boolean validAge(int age)
	{
		boolean isEqual;
		if(MIN_AGE_FOR_ALCOHOL < age)
		{
			isEqual = true;
		}
		else 
		{
			isEqual = false;
		}
		return isEqual;
	}
	public void startNewOrder(int time,
		 	DAY day,
		 	String customerName,
		 	int customerAge)
	{
		Customer newCustomer = new Customer(customerName, customerAge);
		Order newDay = new Order(time, day, newCustomer);
		orderList.add(newDay);
		currentOrdernumber = orderList.indexOf(newDay);
		numOfAlcoholDrinks = 0;
		newDay.setOrderTime(time);
	}
	public void processCoffeeOrder( String bevName,
			SIZE size,
			boolean extraShot,
			boolean extraSyrup )
	{
		orderList.get(currentOrdernumber).addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	public void  processAlcoholOrder( String bevName,
			SIZE size )
	{
		orderList.get(currentOrdernumber).addNewBeverage(bevName, size);
		numOfAlcoholDrinks++;
	}
	public void processSmoothieOrder( String bevName,
			SIZE size,
			int numOfFruits,
			boolean addProtien)
	{
		orderList.get(currentOrdernumber).addNewBeverage(bevName, size, numOfFruits, addProtien);
	}
	public int findOrder(int orderNo)
	{
		int index = -1;
		for(int i = 0; i < orderList.size(); i++)
		{
			 if(orderNo == orderList.get(i).getOrderNo())
			 {
				 index = i;
			 }
		}
		return index;
	}
	public double totalOrderPrice(int orderNo)
	{
		
		double total = 0;
		for (int i = 0; i < orderList.size(); i++)
		{
			if(orderList.get(i).getOrderNo() == orderNo)
			{
				total += orderList.get(i).calcOrderTotal();
				
			}
		}
		return total;
		
	}
	public double totalMonthlySale()
	{
		double total = 0;
		for(int i = 0; i < orderList.size(); i++)
		{
			total += orderList.get(i).calcOrderTotal();
		}
		return total;
	}
	public  void sortOrders()
	{
		for (int i = 0; i < orderList.size() - 1; i++) 
		{
			int minimumOrderIndex = i;
			for (int k = i + 1; k < orderList.size(); k++)
			{
				if (orderList.get(k).getOrderNo() < orderList.get(minimumOrderIndex).getOrderNo()) {
					minimumOrderIndex = k;
				}
			}

			Order newOrder = orderList.get(minimumOrderIndex);
			orderList.set(minimumOrderIndex, orderList.get(i));
              orderList.set(i, newOrder);
      }
 }
	 public Order getOrderAtIndex(int index) {
         return orderList.get(index);
 }
         boolean isMaxFruit(int fruit)
         {
        	 boolean isEqual;
        	 if(fruit > MAX_FRUIT)
        	 {
        		 isEqual = true;
        	 }
        	 else 
        	 {
        		 isEqual = false;
        	 }
        	 return isEqual;
         }
		public Object totalNumOfMonthlyOrders() {
			
			return orderList.size();
		}
		public int getNumOfAlcoholDrink() {
			// TODO Auto-generated method stub
			return numOfAlcoholDrinks;
		}
		public String toString()
		{
			String order = "";
			String totalMonth = String.valueOf(totalMonthlySale());
			for (int i = 0; i < orderList.size(); i++)
			{
				order += orderList.get(i).toString();
			}
			return "Monthly Orders : " + order + " Total Monthly Orders " + totalMonth;
		}
  
	}
	

