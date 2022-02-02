package sube.interviews.mareoenvios.DtoMapper;

import org.mapstruct.Mapper;

import sube.interviews.mareoenvios.Dto.CustomerDto;
import sube.interviews.mareoenvios.model.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

	public CustomerDto customerToCustomerDto(Customer customer);
}
