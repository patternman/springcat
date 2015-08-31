/**  
 * @Title: UserRepository.java
 * @Prject: InternalService
 * @Package: io.springcat.internal.dao.intf
 * @Description: TODO
 * @author: adampeng  
 * @date: 2015年3月1日 下午11:41:09
 * @version: V1.0  
 */
package io.springcat.internal.dao.intf;

import io.springcat.po.User;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @ClassName: UserRepository
 * @Description: TODO
 * @author: adampeng
 * @date: 2015年3月1日 下午11:41:09
 */
public interface IUserRepository extends CrudRepository<User, Long> {

	/**
	 * NameQuery = User.findByTheUsersName
	 * JPQL = from User u where u.username = ?1
	 * @param username
	 * @return
	 */
	User findByUsername(String username);
	
	@Query("select u from User u")
	List<User> findAll();
	
	/**
	 * 用mobile查询记录
	* @Title: findByMobile 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param mobile
	* @param @return    设定文件 
	* @return User    返回类型 
	* @throws
	 */
	User findByMobile(String mobile);
	
}
