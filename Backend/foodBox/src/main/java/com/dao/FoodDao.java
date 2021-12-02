package com.dao;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.foodbox.bean.FoodItem;

@Repository
public interface FoodDao extends JpaRepository<FoodItem, Integer> {

	@Query("select * from FoodItem f where f.name=:name")
	public FoodItem findByName(@Param("name") String name);
}
