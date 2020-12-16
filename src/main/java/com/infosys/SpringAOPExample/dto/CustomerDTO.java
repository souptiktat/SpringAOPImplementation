package com.infosys.SpringAOPExample.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CustomerDTO {

	private String address;
	private String name;
	private String email;
	private Long phoneNo;
}
