import java.util.ArrayList;

public class Item {
	
	
	int sku = 0; int quantity = 0; String description = null; double price = 0;
	
	public Item (int sku, String description, int quantity, double price) {
		this.sku=sku;
		this.description=description;
		this.quantity=quantity;
		this.price=price;
	}
	
	public void setSku(int skunum) {
		this.sku = skunum;
	}
	
	public int getSku() {
		return sku;
	}
	
	public void setDesc (String desc) {
		this.description = desc;
	}
	
	public String getDesc() {
		return description;
	}
	
	public void setQuantity(int quant) {
		this.quantity=quant;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setPrice(double cost) {
		this.price=cost;
	}
	
	public double getPrice() {
		return price;
	}
	

	
}
