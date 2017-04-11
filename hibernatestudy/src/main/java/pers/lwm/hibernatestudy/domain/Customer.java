package pers.lwm.hibernatestudy.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Customer implements Serializable {

	private int id ;
	private String name;
	private String email;
	private Timestamp registeredTime;
	
	//hibernate 要求必须提供一个public的不带参数的构造方法
	public Customer(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public Timestamp getRegisteredTime() {
		return registeredTime;
	}
	public void setRegisteredTime(Timestamp registeredTime) {
		this.registeredTime = registeredTime;
	}
	
}
