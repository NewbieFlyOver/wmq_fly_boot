package com.test.mybatis;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MybatisController {
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/findByName")
	public User findByName(String name){
		return userMapper.findByName(name);
	}
	
	@RequestMapping("/insert")
	public int insert(String name,Integer age){
		return userMapper.insert(name, age);
	}
}