/**  
 * @Title: Application.java
 * @Prject: InternalService
 * @Package: io.springcat.internal
 * @Description: TODO
 * @author: adampeng  
 * @date: 2015年3月3日 上午10:07:08
 * @version: V1.0  
 */
package io.springcat;

import io.springcat.internal.dao.intf.IUserRepository;
import io.springcat.po.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName: Application
 * @Description: TODO
 * @author: adampeng
 * @date: 2015年3月3日 上午10:07:08
 */
@SpringBootApplication
@ImportResource("classpath:provider.xml")
public class ServiceApplication {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ServiceApplication.class, args);

		IUserRepository repository = (IUserRepository) ctx
				.getBean(IUserRepository.class);

		// TODO Auto-generated method stub
		// save a couple of customers
		repository.save(new User("Jack2", "13402931222"));
		repository.save(new User("Chloe2", "13402931233"));
		repository.save(new User("Kim2", "13402931244"));
		repository.save(new User("David2", "13402931255"));
		repository.save(new User("Michelle2", "13402931266"));

		// fetch all customers
		System.out.println("User found with findAll():");
		System.out.println("-------------------------------");
		for (User user : repository.findAll()) {
			System.out.println(user);
		}
		System.out.println();

		// fetch an individual customer by ID
		User user = repository.findOne(1L);
		System.out.println("User found with findOne(1L):");
		System.out.println("--------------------------------");
		System.out.println(user);
		System.out.println();

		System.out.println(repository.findByMobile("13302931244"));
		System.out.println(repository.findByMobile("110"));
		
	}

}
