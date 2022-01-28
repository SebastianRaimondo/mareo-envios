package sube.interviews.mareoenvios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sube.interviews.mareoenvios.model.Customer;
import sube.interviews.mareoenvios.repository.CustomerRepositoryInterface;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepositoryInterface customerRepository;
	
	
	
	public Customer getCustomer(Long id) {
		
		return this.customerRepository.findById(id).orElse(null);
	}

}
