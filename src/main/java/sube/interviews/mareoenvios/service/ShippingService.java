package sube.interviews.mareoenvios.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sube.interviews.mareoenvios.model.Shipping;
import sube.interviews.mareoenvios.model.Status;
import sube.interviews.mareoenvios.repository.ShippingRepositoryInterface;

@Service
public class ShippingService {
	
	@Autowired
	private ShippingRepositoryInterface shippingRepository;
	
    @Transactional(readOnly  = true)
	public Shipping getShipping(Long shippingId) {
	
		return this.shippingRepository.findById(shippingId).orElse(null);
	}
	
    @Transactional
	public Shipping sendToMail (Long shippingId) {
		

		Shipping shipping = this.getShipping(shippingId);
		
		if(shipping != null && shipping.getState().equals("Inicial")) {
			
			shipping.setState(Status.SEND_TO_MAIL);
			this.shippingRepository.saveAndFlush(shipping);
		}
		
		return shipping;
		
	}
    
    
    @Transactional
  	public Shipping inTravel (Long shippingId) {
  		

  		Shipping shipping = this.getShipping(shippingId);
  		
  		if(shipping != null && shipping.getState().equals("Entregado al correo")) {
  			
  			shipping.setState(Status.IN_TRAVEL);
  			this.shippingRepository.saveAndFlush(shipping);
  		}
  		
  		return shipping;
  		
  	}
      
    @Transactional
  	public Shipping delivered (Long shippingId) {
  		

  		Shipping shipping = this.getShipping(shippingId);
  		
  		if(shipping != null && shipping.getState().equals("En camino")) {
  			
  			shipping.setState(Status.DELIVERED);
  			this.shippingRepository.saveAndFlush(shipping);
  		}
  		
  		return shipping;
  		
  	}
    
    @Transactional
  	public Shipping cancelled (Long shippingId) {
  		

  		Shipping shipping = this.getShipping(shippingId);
  		
  		if(shipping != null && shipping.getState().equals("Inicial")) {
  			
  			shipping.setState(Status.CANCELLED);
  			this.shippingRepository.saveAndFlush(shipping);
  		}
  		
  		return shipping;
  		
  	}
    
}
