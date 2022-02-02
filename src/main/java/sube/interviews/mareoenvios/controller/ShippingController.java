package sube.interviews.mareoenvios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sube.interviews.mareoenvios.Dto.ShippingDto;
import sube.interviews.mareoenvios.service.ShippingService;

@RestController
@RequestMapping("/shipping")
public class ShippingController {
	
	

	@Autowired
	private ShippingService shippingService;
	
	
	@GetMapping("/info/{shippingId}")
	public ResponseEntity<ShippingDto> getShipping(@PathVariable Long shippingId){
		
		
		ShippingDto shippingDto = this.shippingService.getShipping(shippingId);
		
		return new ResponseEntity<ShippingDto>(shippingDto, HttpStatus.OK);
	}
	
	@PutMapping("/transition/sendToMail/{shippingId}")
	public ResponseEntity<ShippingDto> updateStateToSendToMail(@PathVariable Long shippingId){
		
		ShippingDto updatedShipping = this.shippingService.sendToMail(shippingId);
		
		return new ResponseEntity<ShippingDto>(updatedShipping, HttpStatus.CREATED);
	}
	
	@PutMapping("/transition/inTravel/{shippingId}")
	public ResponseEntity<ShippingDto> updateStateToInTravel(@PathVariable Long shippingId){
		
		ShippingDto updatedShipping = this.shippingService.inTravel(shippingId);
		
		return new ResponseEntity<ShippingDto>(updatedShipping, HttpStatus.CREATED);
	}
	
	@PutMapping("/transition/delivered/{shippingId}")
	public ResponseEntity<ShippingDto> updateStateToDelivered(@PathVariable Long shippingId){
		
		ShippingDto updatedShipping = this.shippingService.delivered(shippingId);
		
		return new ResponseEntity<ShippingDto>(updatedShipping, HttpStatus.CREATED);
	}
	
	@PutMapping("/transition/cancelled/{shippingId}")
	public ResponseEntity<ShippingDto> updateStateToCancelled(@PathVariable Long shippingId){
		
		ShippingDto updatedShipping = this.shippingService.cancelled(shippingId);
		
		return new ResponseEntity<ShippingDto>(updatedShipping, HttpStatus.CREATED);
	}
	


}
