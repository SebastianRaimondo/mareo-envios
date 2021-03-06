package sube.interviews.mareoenvios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sube.interviews.mareoenvios.model.Shipping;

@Repository
public interface ShippingRepositoryInterface extends JpaRepository<Shipping, Long>{

}
