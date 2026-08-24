package comp_entities;

public class Product {
	private String name;
	private Double price;
	private Product product;

	public Product() {
		
	}

	public Product(String name, Double price) {
	    this.name = name;
	    this.price = price;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	


	
	
}