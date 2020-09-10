package cn.nh.kevin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p> 名称：SimpleController </p>
 * <p> 描述：简易控制器 </p>
 * <p> 版本：v1.0.0 </p>
 * <p> 日期：2020-09-09 16:29 </p>
 *
 * <p> @author：xck </p>
 */
@Controller
@RequestMapping(value = "/test")
public class SimpleController {

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String getIndex(){
		System.out.println("/index");
		return "index";
	}
}
