package com.sdzdf.serach;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AchieveApplicationTests {
    @Test
    public void test01() {
        // 1.读取 shiro.ini 文件内容
		IniSecurityManagerFactory iniSecurityManagerFactory = new IniSecurityManagerFactory("classpath:shiro.ini");
        //Factory<SecurityManager> iniSecurityManagerFactory = new IniSecurityManagerFactory("classpath:shiro.ini");

        // 2.
        SecurityManager instance = (SecurityManager) iniSecurityManagerFactory.getInstance();

        // 3.
        SecurityUtils.setSecurityManager((org.apache.shiro.mgt.SecurityManager) instance);
    }
}
