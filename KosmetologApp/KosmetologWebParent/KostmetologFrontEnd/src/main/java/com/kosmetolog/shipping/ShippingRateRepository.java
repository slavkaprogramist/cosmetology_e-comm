package com.kosmetolog.shipping;

import org.springframework.data.repository.CrudRepository;

import com.kosmetolog.entity.Country;
import com.kosmetolog.entity.ShippingRate;


public interface ShippingRateRepository extends CrudRepository<ShippingRate, Integer> {
	
	public ShippingRate findByCountryAndState(Country country, String state);
}
