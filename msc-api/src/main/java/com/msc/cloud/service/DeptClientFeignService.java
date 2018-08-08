package com.msc.cloud.service;

import com.msc.cloud.beans.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by JF on 2018/8/8.
 */
@FeignClient("MSC-PROVIDE")
@Service
public interface DeptClientFeignService {


    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept);


    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();


    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery();
}
