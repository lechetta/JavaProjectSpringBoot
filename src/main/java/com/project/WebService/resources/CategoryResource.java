package com.project.WebService.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.WebService.entities.Category;
import com.project.WebService.services.CategoryService;

//controlador Rest

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	//injeção de dependencia.
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){	
		List<Category> user = categoryService.findAll();
		return ResponseEntity.ok().body(user);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = categoryService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
