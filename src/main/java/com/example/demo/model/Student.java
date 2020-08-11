package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	@Id
	private Integer stdId;
	private String stdName;
	
	@Temporal(TemporalType.DATE)
	private Date stddate;
	
	@Temporal(TemporalType.TIME)
	private Date stddatetime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date stddatetimestamp;
	
	@Lob
	private byte[] img;
	
	@Lob
	private char[] address;
	
	

}
