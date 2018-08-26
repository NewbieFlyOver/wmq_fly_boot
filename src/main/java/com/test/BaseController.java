package com.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//是 controller 的一个辅助类，最常用的就是作为全局异常处理的切面类,可以指定扫描范围
//约定了几种可行的返回值，如果是直接返回 model 类的话，需要使用 @ResponseBody 进行 json 转换
//返回 String，表示跳到某个 view
//返回 modelAndView
//返回 model + @ResponseBody

@ControllerAdvice
public class BaseController {
	
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody  //返回json格式用@ResponseBody，返回至页面直接返回String不用加@ResponseBody
	public Object exceptionHandler(Exception e){
		Map<String, Object> map =  new HashMap<String, Object>();
		map.put("code", "500");
		map.put("msg","fail");
		System.out.println("######################################");
		e.printStackTrace();
		return map;
	}
	

}
