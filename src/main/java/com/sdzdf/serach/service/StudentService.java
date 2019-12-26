package com.sdzdf.serach.service;

import com.sdzdf.serach.bean.StudentBean;

/**
 * @Auther: z151
 * @Date: 2019/12/26 20:08
 */
public interface StudentService {

    StudentBean getStudentByName(String name);
}
