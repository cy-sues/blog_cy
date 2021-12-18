package com.suse.blog_cy;

import com.suse.blog_cy.dao.AdminUserMapper;
import com.suse.blog_cy.entity.AdminUser;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
class BlogCyApplicationTests {
    @Autowired
    private AdminUserMapper adminUserMapper;
    @Test
    public void test1(){
        AdminUser adminUser=new AdminUser(13,"dfa","sadf","sadffda", (byte) 1) ;
        int i = adminUserMapper.updateByPrimaryKey(adminUser);
    }
    @Test
    public  void test2(){
        AdminUser adminUser=new AdminUser(15,"dfa","sadf","sadffda", (byte) 1) ;
        int insert = adminUserMapper.insert(adminUser);
    }

}
