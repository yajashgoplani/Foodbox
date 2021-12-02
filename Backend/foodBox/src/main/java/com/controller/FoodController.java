package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodbox.bean.FoodItem;
import com.service.FoodService;

@RestController
@RequestMapping("/foods")
public class FoodController {
		@Autowired
		FoodService service;
		@GetMapping("/{name}")
		public FoodItem check(@PathVariable String name)
		{
			return service.getFoodItemByName(name);
		}
		
		@PostMapping("/AddFood")
		public ResponseEntity<?>  insert(@RequestBody FoodItem item)
		{
			FoodItem food=service.saveFoodItem(item);
			if(food!=null)	 return new ResponseEntity<String>("Saved Successfully", HttpStatus.OK);
			else	return new ResponseEntity<String>("Operation Unsuccessfully", HttpStatus.BAD_REQUEST);
		}
}
