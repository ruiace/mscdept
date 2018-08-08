package com.msc.cloud.service;

import com.msc.cloud.beans.Dept;

import java.util.List;



public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
