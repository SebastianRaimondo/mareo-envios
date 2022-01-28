package sube.interviews.mareoenvios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sube.interviews.mareoenvios.model.Customer;

@Repository
public interface CustomerRepositoryInterface extends JpaRepository<Customer, Long> {
	
	

}
