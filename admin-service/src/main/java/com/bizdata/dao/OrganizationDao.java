package com.bizdata.dao;

import com.bizdata.po.Organization;
import com.bizdata.jpa.base.JpaBaseRepository;

/**
 * 组织机构Dao
 * <p>
 * Created by sdevil507 on 2017/5/9.
 */
public interface OrganizationDao extends JpaBaseRepository<Organization, String> {

    /**
     * 根据组织机构名称获取组织机构实体
     *
     * @param name 组织机构名称
     * @return Organization
     */
    Organization findByName(String name);
}
