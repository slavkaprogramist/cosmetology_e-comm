package com.kosmetolog.admin.settings;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kosmetolog.entity.Currency;


public interface CurrencyRepository extends CrudRepository<Currency, Integer> {
	
	public List<Currency> findAllByOrderByNameAsc();
}
