package com.spring.cloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.feign.util.FeignServiceUtil;

@RestController
@RequestMapping("/demo")
public class FeignController {
	
	@Autowired
	private FeignServiceUtil feignServiceUtil;
	
	@GetMapping("/username")
	public String getUserName() {
		return feignServiceUtil.getName();
	}
	@GetMapping("/useraddress")
	public String getUserAddress() {
		return feignServiceUtil.getAddress();
	}
	@GetMapping("/status")
	public String getStatus() {
		return feignServiceUtil.getStatus();
	}

}
