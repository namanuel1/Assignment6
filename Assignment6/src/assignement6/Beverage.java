package assignement6;

public abstract class Beverage {

	protected String beverageName;
	protected TYPE beverageType;
	protected SIZE beverageSize;
	protected final double basePrice = 2.0;
	protected final double sizePrice = 1.0;

	public Beverage(String bevName, SIZE bevSize) {
		beverageName = bevName;
		beverageSize = bevSize;
	}

	public abstract double calcPrice();

	@Override
	public String toString() {
		return "Beverage Name: " + beverageName + " Beverage Size: " + beverageSize;
	}

	public String getBevName() {
		return beverageName;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBeverageName(String beverageName) {
		this.beverageName = beverageName;
	}

	public TYPE getType() {
		return beverageType;
	}

	public void setBeverageType(TYPE beverageType) {
		this.beverageType = beverageType;
	}

	public SIZE getSize() {
		return beverageSize;
	}

	public void setBeverageSize(SIZE beverageSize) {
		this.beverageSize = beverageSize;
	}

	public boolean equals(Beverage a) {
		boolean isEqual;
		if (beverageName == a.beverageName && beverageType == a.beverageType && beverageSize == a.beverageSize) {
			isEqual = true;
		} else {
			isEqual = false;
		}
		return isEqual;
	}

}
