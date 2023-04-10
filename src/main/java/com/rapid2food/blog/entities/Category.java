package com.rapid2food.blog.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Block")
@NoArgsConstructor
@Getter
@Setter

public class Category {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer BlockId;

@Column(name="Block Name")
private String BlockTitle;

@Column(name="Location")
private String BlockDesc;
}
