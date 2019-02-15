package com.criss.wang.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("feign-app")
public interface FeignApi {

	@RequestMapping(value = "/fegin", method = RequestMethod.GET)
	public String feginTest(@RequestParam(value = "name", required = false) String name);
}
