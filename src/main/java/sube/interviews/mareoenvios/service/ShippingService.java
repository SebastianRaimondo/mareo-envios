package sube.interviews.mareoenvios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sube.interviews.mareoenvios.Dto.ShippingDto;
import sube.interviews.mareoenvios.DtoMapper.ShippingMapper;
import sube.interviews.mareoenvios.model.Status;
import sube.interviews.mareoenvios.repository.ShippingRepositoryInterface;

@Service
public class ShippingService {
	
	@Autowired
	private ShippingRepositoryInterface shippingRepository;
	
	@Autowired
	private ShippingMapper sM;
	
    @Transactional(readOnly  = true)
	public ShippingDto getShipping(Long shippingId) {
	
		return this.sM.shippingToShippingDto(this.shippingRepository.findById(shippingId).orElse(null));
	}
	
    @Transactional
	public ShippingDto sendToMail (Long shippingId) {
		

		ShippingDto shippingDto = this.getShipping(shippingId);
		
		if(shippingDto != null && shippingDto.getState().equals("Inicial")) {
			
			shippingDto.setState(Status.SEND_TO_MAIL);
			
	        this.shippingRepository.saveAndFlush(this.sM.shippingDtoToShipping(shippingDto));
		}
		
		return shippingDto;
		
	}
    
    
    @Transactional
  	public ShippingDto inTravel (Long shippingId) {
  		

    	ShippingDto shippingDto = this.getShipping(shippingId);
  		
  		if(shippingDto != null && shippingDto.getState().equals("Entregado al correo")) {
  			
  			shippingDto.setState(Status.IN_TRAVEL);
  			this.shippingRepository.saveAndFlush(this.sM.shippingDtoToShipping(shippingDto));
  		}
  		
  		return shippingDto;
  		
  	}
      
    @Transactional
  	public ShippingDto delivered (Long shippingId) {
  		

    	ShippingDto shippingDto = this.getShipping(shippingId);
  		
  		if(shippingDto != null && shippingDto.getState().equals("En camino")) {
  			
  			shippingDto.setState(Status.DELIVERED);
  			this.shippingRepository.saveAndFlush(this.sM.shippingDtoToShipping(shippingDto));
  		}
  		
  		return shippingDto;
  		
  	}
    
    @Transactional
  	public ShippingDto cancelled (Long shippingId) {
  		

    	ShippingDto shippingDto = this.getShipping(shippingId);
  		
  		if(shippingDto != null && shippingDto.getState().equals("Inicial")) {
  			
  			shippingDto.setState(Status.CANCELLED);
  			this.shippingRepository.saveAndFlush(this.sM.shippingDtoToShipping(shippingDto));
  		}
  		
  		return shippingDto;
  		
  	}
    
}
