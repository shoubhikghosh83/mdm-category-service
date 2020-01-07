package com.tcs.ahold.mdm.categoryservice.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String catId;
	private String catName;
	private String catType;
	private String createdBy;
	private Timestamp createdTs;
	private String updatedBy;
	private Timestamp updatedTs;
}
