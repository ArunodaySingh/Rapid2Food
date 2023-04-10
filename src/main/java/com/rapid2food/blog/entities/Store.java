package com.rapid2food.blog.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stores")
public class Store {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer storeId;
	@Column(name="Store Name")
	private String title;
	private String image;
	private Date addedDate;
	
	

}
