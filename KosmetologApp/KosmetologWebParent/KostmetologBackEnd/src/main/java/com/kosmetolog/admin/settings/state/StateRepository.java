package com.kosmetolog.admin.settings.state;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kosmetolog.entity.Country;
import com.kosmetolog.entity.State;


public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
}
