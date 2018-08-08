package com.msc.cloud.controller;

import com.msc.cloud.beans.Dept;
import com.msc.cloud.service.DeptClientFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by JF on 2018/8/8.
 */
@RestController
public class DeptConsumeController {

    @Autowired
    private DeptClientFeignService deptClientFeignService;


    @RequestMapping(value = "/consume/dept/add")
    public boolean add(Dept dept)
    {
        return deptClientFeignService.add(dept);
    }

    @RequestMapping(value = "/consume/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        System.out.println("==============================");
        return deptClientFeignService.get(id);
    }

    @RequestMapping(value = "/consume/dept/list")
    public List<Dept> list()
    {
        return deptClientFeignService.list();
    }

    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/consume/dept/discovery")
    public Object discovery()
    {
        return deptClientFeignService.discovery();
    }

}
