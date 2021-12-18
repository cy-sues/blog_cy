package com.suse.blog_cy.dao;

import com.suse.blog_cy.entity.AdminUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserMapper {
    //插入一个新的用户
    int insert(AdminUser record);

    int insertSelective(AdminUser record);
    //https://www.cnblogs.com/zhuhui-site/p/10088369.html  @Param
    /**
     * 登陆方法
     *
     * @param userName
     * @param password
     * @return
     */
    //当传入Mybatis sql参数有多个时，必须使用@Param
    AdminUser  login(@Param("Username")String userName,@Param("password")String password);
    AdminUser  selectByPrimaryKey(Integer adminUserId);
    int updateByPrimaryKeySelective(AdminUser record);
    int updateByPrimaryKey(AdminUser record);

}
