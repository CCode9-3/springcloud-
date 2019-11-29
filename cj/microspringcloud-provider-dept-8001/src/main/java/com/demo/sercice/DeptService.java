package com.demo.sercice;

import com.demo.entity.Dept;

import java.util.List;


public interface DeptService {

    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();


}
