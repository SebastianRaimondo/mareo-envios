package sube.interviews.mareoenvios.Dto;

import java.io.Serializable;
import java.util.List;

import sube.interviews.mareoenvios.model.Shipping;

public class CustomerDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
    private String firstName;
	private String lastName;
	//private String address;
	//private String city;
	private List<Shipping> shippings;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/*public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	*/
	public List<Shipping> getShippings() {
		return shippings;
	}
	public void setShippings(List<Shipping> shippings) {
		this.shippings = shippings;
	}
	
}
