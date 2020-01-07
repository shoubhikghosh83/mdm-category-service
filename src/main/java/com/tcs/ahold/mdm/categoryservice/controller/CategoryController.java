package com.tcs.ahold.mdm.categoryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.ahold.mdm.categoryservice.model.Category;
import com.tcs.ahold.mdm.categoryservice.model.Response;
import com.tcs.ahold.mdm.categoryservice.service.CategoryService;

@RestController
@RequestMapping(value="/mdm/api/category-service")
public class CategoryController {
	
	private final CategoryService catsrv;
	
	@Autowired
	public CategoryController(final CategoryService catsrv)
	{
		this.catsrv = catsrv;
	}
	@RequestMapping(value = "/getCategoryById")
	public ResponseEntity<Response> getCategoryById(@RequestParam String id)
	{
		return ResponseEntity.ok(Response.builder().statusCode("200")
				.errorDec("").Result(catsrv.getCategoryById(id)).build() );
	}
	
	@RequestMapping(value = "/getCategoryByName")
	public ResponseEntity<Response> getByCategoryName(@RequestParam String name)
	{
		return ResponseEntity.ok(Response.builder().statusCode("200")
				.errorDec("").Result(catsrv.getByCategoryName(name)).build() );
	}
	
	@RequestMapping(value = "/addModifyCategory", method = RequestMethod.POST)
	public ResponseEntity<Response> addModifyCategory(@RequestBody Category cat, @RequestParam String activity)
	{
		return ResponseEntity.ok(Response.builder().statusCode("200")
				.errorDec("").Result("Updated").build() );
	}

}
