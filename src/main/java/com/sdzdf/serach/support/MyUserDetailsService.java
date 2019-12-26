package com.sdzdf.serach.support;

import com.sdzdf.serach.bean.StudentBean;
import com.sdzdf.serach.bean.UserBean;
import com.sdzdf.serach.dao.StudentMapper;
import com.sdzdf.serach.service.StudentService;
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
    private StudentService studentService;

    /**
     * 授权的时候是对角色授权，而认证的时候应该基于资源，而不是角色，因为资源是不变的，而用户的角色是会变的
     */

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("调用了一下loadUserByUsername");
        StudentBean studentBean = studentService.getStudentByName(username);
        if (null == studentBean) {
            throw new UsernameNotFoundException(username);
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(studentBean.getSlid()));
        authorities.add(new SimpleGrantedAuthority(studentBean.getKsid()));

        return new User("啊哈哈","哈啊哈", authorities);
    }
}