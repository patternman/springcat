/**  
 * @Title: UserController.java
 * @Prject: ExternalService
 * @Package: io.spring.external.service
 * @Description: TODO
 * @author: adampeng  
 * @date: 2015年2月27日 下午3:50:46
 * @version: V1.0  
 */
package io.springcat.external.controller;

import io.springcat.service.IUserService;
import io.springcat.vo.DefaultView;
import io.springcat.vo.UserView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author: adampeng
 * @date: 2015年2月27日 下午3:50:46
 */
@RestController
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@RequestMapping(value="/user/{username}", method=RequestMethod.GET)
	public UserView getUser(@PathVariable(value="username") String username){
		return userService.findUserByUsername(username);
	}
	
	@RequestMapping("/checkMobile/{mobile}")
	public DefaultView checkMobile(@PathVariable(value="mobile") String mobile){
		boolean isExists = userService.checkMobile(mobile);
		DefaultView view = new DefaultView();
		view.setResult(String.valueOf(isExists));
		view.setMsg(isExists?"该号码已被注册":"该号码可以使用");
		return view;
	}
}
