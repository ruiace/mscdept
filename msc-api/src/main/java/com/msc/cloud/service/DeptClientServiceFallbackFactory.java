package com.msc.cloud.service;

import com.msc.cloud.beans.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by JF on 2018/8/9.
 */


/**
 * 服务降级 客户端实现
 */
@Component
public class DeptClientServiceFallbackFactory  implements FallbackFactory<DeptClientFeignService>{
    @Override
    public DeptClientFeignService create(Throwable throwable) {
        return new DeptClientFeignService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDbSource("no this database in MySQL").setDeptno(id).setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public Object discovery() {
                return null;
            }
        };
    }
}
