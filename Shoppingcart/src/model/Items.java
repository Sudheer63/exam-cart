package model;

public class Items {
	private int proid;
	private int quantity;
	private float price;

	public Items(int proid, int quantity, float floatValue) {
		this.proid = proid;
		this.quantity = quantity;
		this.price = floatValue;
	}

	public int getProid() {
		return proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product{" + "proid=" + proid + ", quantity=" + quantity + ", price=" + price + '}';
	}
}
