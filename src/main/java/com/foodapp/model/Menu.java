package com.foodapp.model;

public class Menu {
	private int mid;
	private int rid;
	private String itemName;
	private String desc;
	private float price;
	private int isAvailable;
	private String imgPath;
	
	
	public Menu(int mid, int rid, String itemName, String desc, float price, int isAvailable, String imgPath) {
		super();
		this.mid = mid;
		this.rid = rid;
		this.itemName = itemName;
		this.desc = desc;
		this.price = price;
		this.isAvailable = isAvailable;
		this.imgPath = imgPath;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int isAvailable() {
		return isAvailable;
	}
	public void setAvailable(int isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public String getimgPath() {
	    return imgPath;
	}

	public void setimgPath(String imgPath) {
	    this.imgPath = imgPath;
	}
	@Override
	public String toString() {
		return mid + "   " + rid + "   " + itemName + "   " + desc + "   " + price+ "   " + isAvailable;
	}
	
}

