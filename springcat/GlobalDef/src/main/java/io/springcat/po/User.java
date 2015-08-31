/**  
 * @Title: User.java
 * @Prject: GlobalDef
 * @Package: io.springcat.po
 * @Description: TODO
 * @author: adampeng  
 * @date: 2015年3月1日 下午9:51:29
 * @version: V1.0  
 */
package io.springcat.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @ClassName: User
 * @Description: TODO
 * @author: adampeng
 * @date: 2015年3月1日 下午9:51:29
 */
@Entity
@NamedQuery(name = "User.findByTheUsersName", query = "from User u where u.username = ?1")
public class User extends AbstractPersistable<Long>{
	
	private static final long serialVersionUID = 1L;

	@Column(unique=true)
	private String username;
	
	private String password;
	
	@Column(unique=true)
	private String mobile;
	
	/*
	 * 账号是否已验证
	 */
	private boolean isValid;
	
	public User() {
		this(null);
	}	
	
	public User(Long id){
		this.setId(id);
	}
	
	public User(String username, String mobile){
		this.setUsername(username);
		this.setMobile(mobile);
	}

	/**
	 * getter method
	 * @return the username
	 */
	
	public String getUsername() {
		return username;
	}

	/**
	 * setter method
	 * @param username the username to set
	 */
	
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * getter method
	 * @return the password
	 */
	
	public String getPassword() {
		return password;
	}

	/**
	 * setter method
	 * @param password the password to set
	 */
	
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * getter method
	 * @return the mobile
	 */
	
	public String getMobile() {
		return mobile;
	}

	/**
	 * setter method
	 * @param mobile the mobile to set
	 */
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * getter method
	 * @return the isValid
	 */
	
	public boolean isValid() {
		return isValid;
	}

	/**
	 * setter method
	 * @param isValid the isValid to set
	 */
	
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	
	
}
