package com.criss.wang.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "feign-app", fallback = FeignApiServiceFallbackFactory.class)
public interface FeignApi {

	@RequestMapping(value = "/fegin", method = RequestMethod.GET)
	String feginTest(@RequestParam(value = "name", required = false) String name);

	@RequestMapping(value = "/fallback", method = RequestMethod.GET)
	String fallBackTest(@RequestParam(value = "name", required = false) String name);
}
