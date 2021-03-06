package sube.interviews.mareoenvios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sube.interviews.mareoenvios.Dto.CustomerDto;
import sube.interviews.mareoenvios.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/info/{customerId}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable Long customerId){
		
		CustomerDto customerDto = this.customerService.getCustomer(customerId);
		
		return new ResponseEntity<CustomerDto>(customerDto, HttpStatus.OK);
	}
	

}
