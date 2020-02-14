package com.criss.wang.api;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Author wangqiubao
 * @Date 2020/2/14 16:34
 * @Version 1.0
 * @Description
 **/
@Component
public class FeignApiServiceFallbackFactory  implements FallbackFactory<FeignApi> {
    @Override
    public FeignApi create(Throwable cause) {
        return new FeignApi() {
            @Override
            public String feginTest(String name) {
                System.out.println("记录一条服务降级信息, name =" + name);
                return "fallback valid";
            }

            @Override
            public String fallBackTest(String name) {
                System.out.println("记录一条服务降级信息, name =" + name);
                return "fallback valid test";
            }
        };
    }
}
