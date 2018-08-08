package com.msc.cloud.mapper;

import com.msc.cloud.beans.Dept;

import java.util.List;

/**
 * Created by JF on 2018/8/8.
 */
//@Mapper
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
