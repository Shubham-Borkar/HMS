package com.hms.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PatientRegDto {
	//user
//	"email": "string",
//	  "password": "string",
	
	//patient
//	 "name": "string",
//	    "gender": "string",
//	    "dob": "2023-08-17T11:32:41.223Z",
//	    "phone": 0,
//	    "address": "string"
	private String name;
	private String gender;
	private Date dob;
	private long phone;
	private String address;
	
    private String email;
	private String password;
	private String role;

}
