public class InventoryItem {


	private int sku;
	private String disc;
	private double price;
	private int amount;

	public InventoryItem(int sku, String disc, double price, int amount) {
		this.sku = sku;
		this.disc = disc;
		this.price = price;
		this.amount = amount;
	}

	public String toString() {
		return sku + disc + price + amount;
	}

	public int getSku() {
		return this.sku;
	}

	public String getDisc() {
		return this.disc;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}


