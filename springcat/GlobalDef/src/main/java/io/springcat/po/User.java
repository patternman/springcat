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


/**
 * @ClassName: User
 * @Description: TODO
 * @author: adampeng
 * @date: 2015年3月1日 下午9:51:29
 */
public class User{
	
	private String username;
	
	private String password;
	
	private String mobile;
	
	/*
	 * 账号是否已验证
	 */
	private boolean isValid;
	
	public User() {
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
