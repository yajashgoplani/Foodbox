package com.order.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.order.bean.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

	private Integer orderId;
	private Integer userId;
	private Double totalAmount;
	private List<FoodItemDto> foods;
	public Order convertFromDtoToEntity() {
		return new Order(this.getOrderId(),this.getUserId(),this.getTotalAmount());
	}
	
}


