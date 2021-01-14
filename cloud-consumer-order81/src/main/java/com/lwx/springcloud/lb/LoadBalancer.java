package com.lwx.springcloud.lb;

/**
 * @author lwxstart
 * @create 2021-01-12 09:55
 */

import org.springframework.cloud.client.ServiceInstance;
import java.util.List;

public interface LoadBalancer {
    //收集服务器总共有多少台能够提供服务的机器，并放到list里面
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}