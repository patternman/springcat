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

import io.springcat.repository.mybatis.IUserDao;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.druid.support.http.StatViewServlet;

/**
 * @ClassName: Application
 * @Description: TODO
 * @author: adampeng
 * @date: 2015年3月3日 上午10:07:08
 */
@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class ServiceApplication {

	@Bean
	public ServletRegistrationBean servletRegistrationBean(){
		ServletRegistrationBean servletReg = new ServletRegistrationBean(new StatViewServlet(),"/stat");
//		Map<String,String> paramMap = new HashMap<String,String>();
//		paramMap.put("resetEnable", "true");
//		paramMap.put("loginUsername", "druid");
//		paramMap.put("loginPassword", "druid");
//		servletReg.setInitParameters(paramMap);
	    return servletReg;
	}
	
	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ServiceApplication.class, args);
		IUserDao userDAO = (IUserDao)ctx.getBean("userDAO");
		System.out.println(userDAO.get(1L));
//		try {
//			System.in.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
