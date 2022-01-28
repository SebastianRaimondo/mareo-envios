package sube.interviews.mareoenvios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sube.interviews.mareoenvios.model.Shipping;
import sube.interviews.mareoenvios.service.ShippingService;

@RestController
@RequestMapping("/shipping")
public class ShippingController {
	
	

	@Autowired
	private ShippingService shippingService;
	
	
	@GetMapping("/info/{shippingId}")
	public ResponseEntity<Shipping> getShipping(@PathVariable Long shippingId){
		
		
		Shipping shipping = this.shippingService.getShipping(shippingId);
		
		return new ResponseEntity<Shipping>(shipping, HttpStatus.OK);
	}
	
	@PutMapping("/transition/sendToMail/{shippingId}")
	public ResponseEntity<Shipping> updateStateToSendToMail(@PathVariable Long shippingId){
		
		Shipping updatedShipping = this.shippingService.sendToMail(shippingId);
		
		return new ResponseEntity<Shipping>(updatedShipping, HttpStatus.CREATED);
	}
	
	@PutMapping("/transition/inTravel/{shippingId}")
	public ResponseEntity<Shipping> updateStateToInTravel(@PathVariable Long shippingId){
		
		Shipping updatedShipping = this.shippingService.inTravel(shippingId);
		
		return new ResponseEntity<Shipping>(updatedShipping, HttpStatus.CREATED);
	}
	
	@PutMapping("/transition/delivered/{shippingId}")
	public ResponseEntity<Shipping> updateStateToDelivered(@PathVariable Long shippingId){
		
		Shipping updatedShipping = this.shippingService.delivered(shippingId);
		
		return new ResponseEntity<Shipping>(updatedShipping, HttpStatus.CREATED);
	}
	
	@PutMapping("/transition/cancelled/{shippingId}")
	public ResponseEntity<Shipping> updateStateToCancelled(@PathVariable Long shippingId){
		
		Shipping updatedShipping = this.shippingService.cancelled(shippingId);
		
		return new ResponseEntity<Shipping>(updatedShipping, HttpStatus.CREATED);
	}
	


}
