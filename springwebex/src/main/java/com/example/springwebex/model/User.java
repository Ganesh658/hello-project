package com.example.springwebex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="uid")
    private long uid;
	
	@Column(name="username")
    private String username;
	
	@Column(name="password")
    private String password;
	
	@Column(name="email")
    private String email;
	
	@Column(name="purpose")
    private String purpose;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.purpose = purpose;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", email=" + email + ", purpose=" + purpose + "]";
	}
}
