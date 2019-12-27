package com.sdzdf.serach.support;

import com.sdzdf.serach.bean.StudentBean;
import com.sdzdf.serach.bean.UserBean;
import com.sdzdf.serach.dao.StudentMapper;
import com.sdzdf.serach.entity.SysPermission;
import com.sdzdf.serach.entity.SysRole;
import com.sdzdf.serach.entity.SysUser;
import com.sdzdf.serach.service.StudentService;
import com.sdzdf.serach.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;;

    /**
     * 授权的时候是对角色授权，而认证的时候应该基于资源，而不是角色，因为资源是不变的，而用户的角色是会变的
     */



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("这里是loadUserByUsername");
        SysUser sysUser = userService.getUserByName(username);
        if (null == sysUser) {
            throw new UsernameNotFoundException(username);
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (SysRole role : sysUser.getRoleList()) {
            for (SysPermission permission : role.getPermissionList()) {
                authorities.add(new SimpleGrantedAuthority(permission.getCode()));
            }
        }

        return new User(sysUser.getUsername(), sysUser.getPassword(), authorities);
    }



}