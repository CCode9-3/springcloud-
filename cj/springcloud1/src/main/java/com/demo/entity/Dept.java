package com.demo.entity;

import java.io.Serializable;

public class Dept implements Serializable {
    private static final long serialVersionUID = 5540420440157670259L;

    //主键
    private Long deptNo;

    private String deptName;

    //来自哪个数据库，因为一个为服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    private String dbSource;

    public Dept() {
    }

    public Dept(Long deptNo, String deptName, String dbSource) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.dbSource = dbSource;
    }

    public Long getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Long deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}
