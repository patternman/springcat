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

import java.util.concurrent.Callable;

import javax.websocket.server.PathParam;

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
@RequestMapping("/user")
public class UserController {
	
//	@Autowired
//	IUserService userService;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String getUser(@PathParam(value="username") String username){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "test:" + username;
	}
	
	@RequestMapping(value="/async", method=RequestMethod.GET)
	public Callable<String> findUser(@PathParam(value="username") String username){
		return new Callable<String>() {
			@Override
			public String call() throws Exception {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return "test:" + username;
			}
		};
	}
	
}
