
public class Pizza {
	
	
	String firstTopping;
	String secondTopping;
	boolean extraCheese;
	int size;
	double price;
	
	public Pizza(String firstTopping, String secondTopping, boolean extraCheese, int size, double price) {
		super();
		this.firstTopping = firstTopping;
		this.secondTopping = secondTopping;
		this.extraCheese = extraCheese;
		this.size = size;
		this.price = price;
	}

	public String getFirstTopping() {
		return firstTopping;
	}

	public void setFirstTopping(String firstTopping) {
		this.firstTopping = firstTopping;
	}

	public String getSecondTopping() {
		return secondTopping;
	}

	public void setSecondTopping(String secondTopping) {
		this.secondTopping = secondTopping;
	}

	public boolean isExtraCheese() {
		return extraCheese;
	}

	public void setExtraCheese(boolean extraCheese) {
		this.extraCheese = extraCheese;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [firstTopping=" + firstTopping + ", secondTopping=" + secondTopping + ", extraCheese="
				+ extraCheese + ", size=" + size + ", price=" + price + "]";
	}
	
	
	

}
