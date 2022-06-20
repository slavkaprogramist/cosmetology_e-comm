package com.kosmetolog.admin.setting;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.kosmetolog.admin.settings.CurrencyRepository;
import com.kosmetolog.entity.Currency;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CurrencyRepositoryTests {

	@Autowired
	private CurrencyRepository repo;
	
	@Test
	public void testCreateCurrencies() {
		List<Currency> listCurrencies = Arrays.asList(
				new Currency("Ukrainian hryvnia", "₴", "UAH"),
				new Currency("United States Dollar", "$", "USD"),
				new Currency("Euro", "€", "EUR")
			);
			
			repo.saveAll(listCurrencies);
			
			Iterable<Currency> iterable = repo.findAll();
			
			assertThat(iterable).size().isEqualTo(3);

	}
	@Test
	public void testListAllOrderByNameAsc() {
		List<Currency> currencies = repo.findAllByOrderByNameAsc();
		
		currencies.forEach(System.out::println);
		
		assertThat(currencies.size()).isGreaterThan(0);
	}
}

