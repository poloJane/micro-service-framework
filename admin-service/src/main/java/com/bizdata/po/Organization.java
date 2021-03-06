package com.bizdata.po;

import me.sdevil507.base.JpaUUIDBaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 组织机构
 * <p>
 * Created by sdevil507 on 2017/5/9.
 */
@Entity
@Table(name = "admin_organization")
public class Organization extends JpaUUIDBaseEntity {
    /**
     * 组织机构名称
     */
    @Column(nullable = false, unique = true)
    private String name;

    /**
     * 父id
     */
    @Column(nullable = false)
    private String parent = "";

    private Date createTime = new Date();

    /**
     * 是否系统内置
     */
    @Column(nullable = false)
    private boolean builtIn = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Date getCreateTime() {
        return (Date) createTime.clone();
    }

    public void setCreateTime(Date createTime) {
        if(null!=createTime)
        this.createTime = (Date) createTime.clone();
    }

    public boolean isBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(boolean builtIn) {
        this.builtIn = builtIn;
    }
}
