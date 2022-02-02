package sube.interviews.mareoenvios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sube.interviews.mareoenvios.Dto.CustomerDto;
import sube.interviews.mareoenvios.DtoMapper.CustomerMapper;
import sube.interviews.mareoenvios.repository.CustomerRepositoryInterface;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepositoryInterface customerRepository;
	
	@Autowired
	private CustomerMapper cM;
	
	@Transactional(readOnly  = true)
	public CustomerDto getCustomer(Long id) {
		
		return this.cM.customerToCustomerDto(this.customerRepository.findById(id).orElse(null));
	}

}
