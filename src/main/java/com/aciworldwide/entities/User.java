//This class is hibernate pojo class
package com.aciworldwide.entities;

import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
//@Table(name="UserMaster")(For JPA)
@Entity // (For Hibernate)(User class will map to user table)........use this annotation @Entity(name = "<TableName>") if the tablename is not same as class name
public class User {
	
	@Id
	@Column(name="userid")
	private Long userId;
//	@Columnn(name = "user_pwd").... this annotation is used if the table column name is not matching with this variable name then we have to explicitly pass the name of column here else it will map itself if name is same
	private String username;
	private String password;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	
	
	
	
	

}
