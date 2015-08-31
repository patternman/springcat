/**  
 * @Title: IUserService.java
 * @Prject: GlobalDef
 * @Package: io.springcat.service
 * @Description: TODO
 * @author: adampeng  
 * @date: 2015年2月26日 上午11:22:11
 * @version: V1.0  
 */
package io.springcat.service;

import io.springcat.vo.UserView;

import org.springframework.stereotype.Service;

/**
 * @ClassName: IUserService
 * @Description: TODO
 * @author: adampeng
 * @date: 2015年2月26日 上午11:22:11
 */
@Service
public interface IUserService {
	
	/**
	 * 
	* @Title: findUser 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param username
	* @param @return    设定文件 
	* @return UserView    返回类型 
	* @throws
	 */
	UserView findUserByUsername(String username);
	
	/**
	 * 注册用户
	* @Title: regUser 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param user    设定文件 
	* @return void    返回类型 
	* @throws
	 */
	void regUser(UserView user);
	
	/**
	 * 查询是否存在该用户
	* @Title: checkUser 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param user
	* @param @return    设定文件 
	* @return boolean    返回类型 
	* @throws
	 */
	boolean checkUser(UserView user);
	
	/**
	 * 查询手机号是否已注册
	* @Title: checkMobile 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param mobile
	* @param @return    设定文件 
	* @return boolean    返回类型 
	* @throws
	 */
	boolean checkMobile(String mobile);

}
