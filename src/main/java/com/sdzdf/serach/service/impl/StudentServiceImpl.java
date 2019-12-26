package com.sdzdf.serach.service.impl;

import com.sdzdf.serach.bean.StudentBean;
import com.sdzdf.serach.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Auther: z151
 * @Date: 2019/12/26 20:08
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentBean studentBean;

    @Cacheable(cacheNames = "authority", key = "#username")
    @Override
    public StudentBean getStudentByName(String name) {
        return studentBean;
    }
}
