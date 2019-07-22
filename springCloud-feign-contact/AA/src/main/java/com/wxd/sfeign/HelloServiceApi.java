package com.wxd.sfeign;

import com.wxd.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Author :wxd
 * @Description:
 * @Date: Created in 17:23 2019/7/22
 */
@FeignClient("aa")
public interface HelloServiceApi extends HelloService {
}
