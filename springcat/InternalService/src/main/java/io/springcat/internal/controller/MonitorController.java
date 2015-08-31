/**  
 * @Title: MonitorController.java
 * @Prject: InternalService
 * @Package: io.springcat.internal.controller
 * @Description: TODO
 * @author: adampeng  
 * @date: 2015年3月3日 上午11:29:14
 * @version: V1.0  
 */
package io.springcat.internal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: MonitorController
 * @Description: TODO
 * @author: adampeng
 * @date: 2015年3月3日 上午11:29:14
 */
@Controller
public class MonitorController {

	/**
	 * 暴露接口放服务监控
	* @Title: monitor 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param model
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	@RequestMapping("/")
	public String monitor(Model model){
//		model.addAttribute("serviceCount", "1");
		return "monitor";
	}
	
}
