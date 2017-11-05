package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.service.ITestCustomerService;
import com.vo.Customer;

@RequestMapping("/test")
//@RestController
@Controller
public class TestController {

	@Resource
	private ITestCustomerService custService;
	@RequestMapping("/me")
	public String test(){
		return "indexA";
	}
	
	@RequestMapping("/user/{id}")
	@ResponseBody
	public String findById(@PathVariable("id")String id){
		Customer customer = custService.findById(id);
		return JSON.toJSONString(customer);
	}
}
