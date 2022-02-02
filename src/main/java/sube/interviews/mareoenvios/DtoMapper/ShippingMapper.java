package sube.interviews.mareoenvios.DtoMapper;

import org.mapstruct.Mapper;

import sube.interviews.mareoenvios.Dto.ShippingDto;
import sube.interviews.mareoenvios.model.Shipping;

@Mapper(componentModel = "spring")
public interface ShippingMapper {
	
	public ShippingDto shippingToShippingDto(Shipping shipping);
	public Shipping shippingDtoToShipping(ShippingDto shippingDto);

}
