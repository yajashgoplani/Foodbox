package com.users.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Integer userId;
	   private String email;
	   private String password;
	   private String name;
	   private String contact;
	   private String address;
}
