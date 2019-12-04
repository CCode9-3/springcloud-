package com.demo.controller;

import com.demo.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptControllerConsumer
{
//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    /**
     * 因为ribbon的作用是负载均衡，那么你直接使用ip地址，那么就无法起到负载均衡的作用，
     * 因为每次都是调用同一个服务，
     * 当你使用的是服务名称的时候，他会根据自己的算法去选择具有该服务名称的服务。
     */
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
    @Autowired
    private RestTemplate restTemplate;


    /**使用restTemplate远程调用本地的proveder服务
     * @param dept
     * @return
     */
    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);

    }

    //测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value="/consumer/dept/discovery")
    public Object discovery()
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);
    }
}


