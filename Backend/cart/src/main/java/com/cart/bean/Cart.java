package com.cart.bean;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.cart.dto.CartDto;
import com.cart.dto.FoodItemDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
	@Id
	private Integer cid;
	private Integer quantity;
	private Double price;
	private Integer id;
	
	
	
	public CartDto convertEntityToDto()
	{
		RestTemplate restTemplate= new RestTemplate();
		FoodItemDto foodItemDto[]=restTemplate.getForObject("http://localhost:8082/foodbox/getAllFoods",FoodItemDto[].class);
		List<FoodItemDto> foodItemDtos=Arrays.asList(foodItemDto); 
		FoodItemDto foodItem=null;
		for(FoodItemDto food:foodItemDtos)
			if(this.getId()==food.getId())
				foodItem=food;
		return new CartDto(this.getCid(),this.getQuantity(),this.getPrice(),foodItem);
	}
}
