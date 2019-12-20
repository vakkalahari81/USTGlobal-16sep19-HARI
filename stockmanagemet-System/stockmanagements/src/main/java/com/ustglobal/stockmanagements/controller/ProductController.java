package com.ustglobal.stockmanagements.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ustglobal.stockmanagements.dao.StoreManager;
import com.ustglobal.stockmanagements.dto.ProductsInfo;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class ProductController {

	@Autowired
	private StoreManager service;

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean addProduct(@RequestBody ProductsInfo product) {

		if (service.addProduct(product)) {
			return true;
		} else {
			return false;

		}

	}// end of addProduct

	@GetMapping(path = "/search-product/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsInfo> searchByName(@PathVariable("name") String name) {

		List<ProductsInfo> product = service.searchByName(name);

		if (product != null) {
			return product;

		} else {
			return null;
		}
	}// end search By Name

	@GetMapping(path = "/search-company", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsInfo> searchByCompany(@RequestParam("company") String company) {

		List<ProductsInfo> product = service.searchByCompany(company);

		if (product != null) {
			return product;

		} else {
			return null;
		}
	}// end search By company-Name

	@GetMapping(path = "/search-category", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsInfo> searchByCategory(@RequestParam("category") String category) {

		List<ProductsInfo> product = service.searchByCategory(category);

		if (product != null) {
			return product;

		} else {
			return null;
		}
	}// end search By company-category

	@PutMapping(path = "/modify", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean modifyEmployee(@RequestBody ProductsInfo product) {
		if (service.modifyProduct(product)) {
			return true;

		} else {
			return false;
		}
	}// end of update Product
}
