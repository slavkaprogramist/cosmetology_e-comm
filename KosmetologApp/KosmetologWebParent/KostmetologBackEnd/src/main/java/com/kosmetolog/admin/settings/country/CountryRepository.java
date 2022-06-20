package com.kosmetolog.admin.settings.country;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kosmetolog.entity.Country;


public interface CountryRepository extends CrudRepository<Country, Integer> {
	public List<Country> findAllByOrderByNameAsc();
}
