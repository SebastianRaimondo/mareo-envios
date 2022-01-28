package sube.interviews.mareoenvios.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Shipping")
public class Shipping implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50)
	private String state;
	
	@JsonBackReference
    @ManyToOne
	private Customer customer;
	
	@JsonManagedReference
    @OneToMany(mappedBy = "shipping")
	private List<ShippingItem> shippingItems;
	
	@Column
	private Date sendDate;
	
	
	@Column
	private Date arriveDate;
	
	
	@Column(length = 10)
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
	
	public List<ShippingItem> getShippingItems() {
		return shippingItems;
	}


	public void setShippingItems(List<ShippingItem> shippingItems) {
		this.shippingItems = shippingItems;
	}

}
