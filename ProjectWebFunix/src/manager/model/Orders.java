/**
 * Copyright(C) [2020]  [Luvina Sotfware Company]
 * [Orders.java], [Jun 12, 2020] [Kiều Văn Quang]
 */
package manager.model;

import java.util.Date;
import java.util.List;

/**
 * @author Kiều Văn Quang
 *
 */
public class Orders {
	private int orderId;
	private float price;
	private int status;
	private Date orderDate;
	private String address;
	private String phoneNumber;
	private List<ProductOrders> lp;
	private String userMail;
	private Date receivedDate;
	private String discount;

	public Orders(int orderId, float price, int status, Date orderDate, String address, String phoneNumber,
			List<ProductOrders> lp, String userMail, Date receivedDate) {

	}

	public Orders(String userMail, int status, String discount, String address, String phoneNumber, Date receivedDate) {

	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<ProductOrders> getLp() {
		return lp;
	}

	public void setLp(List<ProductOrders> lp) {
		this.lp = lp;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
	

}
