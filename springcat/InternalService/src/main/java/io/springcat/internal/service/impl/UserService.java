/**  
 * @Title: UserService.java
 * @Prject: InternalService
 * @Package: io.springcat.internal.service.impl
 * @Description: TODO
 * @author: adampeng  
 * @date: 2015年2月26日 下午2:35:32
 * @version: V1.0  
 */
package io.springcat.internal.service.impl;

import io.springcat.internal.dao.intf.IUserRepository;
import io.springcat.po.User;
import io.springcat.service.IUserService;
import io.springcat.util.BeanUtil;
import io.springcat.vo.UserView;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author: adampeng
 * @date: 2015年2月26日 下午2:35:32
 */
public class UserService implements IUserService {
	
	@Autowired
	IUserRepository userRepository;

	/*
	 * <p>Title: regUser</p>
	 * <p>Description: </p>
	 * @param user
	 * @see io.springcat.service.IUserService#regUser(io.springcat.bo.User)
	 */
	@Override
	public void regUser(UserView user) {
			
	}

	/*
	 * <p>Title: checkUser</p>
	 * <p>Description: </p>
	 * @param user
	 * @return
	 * @see io.springcat.service.IUserService#checkUser(io.springcat.bo.User)
	 */
	@Override
	public boolean checkUser(UserView user) {
		return false;
	}

	/*
	  * <p>Title: checkMobile</p>
	  * <p>Description: </p>
	  * @param mobile
	  * @return
	  * @see io.springcat.service.IUserService#checkMobile(java.lang.String)
	 */
	@Override
	public boolean checkMobile(String mobile) {
		return userRepository.findByMobile(mobile) != null;
	}

	@Override
	public UserView findUserByUsername(String username) {
		User user =  userRepository.findByUsername(username);
		return BeanUtil.convertBean(user, UserView.class);
	}

}
