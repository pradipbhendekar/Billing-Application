package Model;

public class ProdModel {
	private int prodId;
	private String prodname;
	private double price;
	private int qty;
	
	
	//creat a constructer
	public ProdModel(int prodId, String prodname, double price, int qty) {
		super();
		this.prodId = prodId;
		this.prodname = prodname;
		this.price = price;
		this.qty = qty;
	}
	public ProdModel() {
		
	}
	
	// create the getter and setter method
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	

}
