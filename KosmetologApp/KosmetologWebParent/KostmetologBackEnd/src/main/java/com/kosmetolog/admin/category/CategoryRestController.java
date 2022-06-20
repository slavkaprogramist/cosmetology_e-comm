package com.kosmetolog.admin.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryRestController {

	@Autowired
	private CategoryService service;
	
	@PostMapping("/categories/check_unique")
	public String checkUnique(@RequestParam("id") Integer id, @RequestParam("name") String name,
			@RequestParam("alias") String alias) {
		return service.checkUnique(id, name, alias);
	}
}
