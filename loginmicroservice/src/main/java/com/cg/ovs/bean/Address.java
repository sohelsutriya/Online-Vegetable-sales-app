package com.cg.ovs.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer addressId;
private String flatNo;
private String buildingName;
private String area;
private String city;
private String state;
private String pincode;


}
