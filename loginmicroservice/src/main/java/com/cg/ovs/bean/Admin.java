package com.cg.ovs.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Admin {


public Admin(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer adminId;

private String username;
private String password;
}
