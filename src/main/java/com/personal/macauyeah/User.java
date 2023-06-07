package com.personal.macauyeah;

import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(columnDefinition = "DECIMAL(37, 0)")
	private BigInteger bigId;
    @Column(precision = 37)
	private BigInteger bigIdByScaleAndPrecision;
	@Column(columnDefinition = "VARCHAR(512)")
	private String str512;
    @Column(length = 512)
	private String str512ByLength;
	private Date utilDate;
	private java.sql.Date sqlDate;
	private String name;

	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getUtilDate() {
		return utilDate;
	}

	public void setUtilDate(Date utilDate) {
		this.utilDate = utilDate;
	}

	public java.sql.Date getSqlDate() {
		return sqlDate;
	}

	public void setSqlDate(java.sql.Date sqlDate) {
		this.sqlDate = sqlDate;
	}

	public BigInteger getBigId() {
		return bigId;
	}

	public void setBigId(BigInteger bigId) {
		this.bigId = bigId;
	}

	public String getStr512() {
		return str512;
	}

	public void setStr512(String str512) {
		this.str512 = str512;
	}

	
}
