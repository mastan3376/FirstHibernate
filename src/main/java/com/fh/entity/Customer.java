package com.fh.entity;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Customer implements Serializable {

	private static final long serialVersionUID = -6412449600616581227L;

	protected int customerNo;
	protected String customerName;
	protected int age;
	protected String gender;
	protected String mobileNo;
	protected String emailAddress;
}
