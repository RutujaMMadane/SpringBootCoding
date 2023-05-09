package com.example.demo.entity;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pId")
	private int pId;
	@Column(name="pName")
	private String pName;
	@Column(name="productDes")
	private String productDes;
	@Column(name="unitprice")
	private float unitprice;
	public Product()
	{
		
	}
	public Product(int pId, String pName, String productDes, float unitprice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.productDes = productDes;
		this.unitprice = unitprice;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getProductDes() {
		return productDes;
	}
	public void setProductDes(String productDes) {
		this.productDes = productDes;
	}
	public float getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(float unitprice) {
		this.unitprice = unitprice;
	}
	

}
