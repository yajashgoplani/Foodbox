package com.order.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.order.dto.FoodItemDto;
import com.order.dto.OrderDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="MyOrders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	private Integer userId;
	private Double totalAmount;
	public OrderDto convertFromEntityToDto(Order order,List<FoodItemDto> foods)
	{
		return new OrderDto(order.getOrderId(),order.getUserId(),order.getTotalAmount(),foods);
	}
	
	
}


