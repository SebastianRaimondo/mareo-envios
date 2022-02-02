package sube.interviews.mareoenvios.Dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import sube.interviews.mareoenvios.model.Customer;
import sube.interviews.mareoenvios.model.ShippingItem;

public class ShippingDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String state;
	private Customer customer;
	private List<ShippingItem> shippingItems;
	private Date sendDate;
	private Date arriveDate;
	private Integer priority;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<ShippingItem> getShippingItems() {
		return shippingItems;
	}
	public void setShippingItems(List<ShippingItem> shippingItems) {
		this.shippingItems = shippingItems;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	public Date getArriveDate() {
		return arriveDate;
	}
	public void setArriveDate(Date arriveDate) {
		this.arriveDate = arriveDate;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

}
