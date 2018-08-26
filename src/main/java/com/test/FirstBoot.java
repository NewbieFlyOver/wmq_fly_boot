package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController  //@ResponseBody与@Controller的组合
@Controller
public class FirstBoot {
	
	@RequestMapping(value="/first")
	public String first(){
		int i = 1/0;
		return "first";
	}
	
	@RequestMapping("/freemarkerIndex")
	public String index(Map<String, Object> map) {
	    map.put("name","美丽的天使...");
		return "index";
	}
	

}
