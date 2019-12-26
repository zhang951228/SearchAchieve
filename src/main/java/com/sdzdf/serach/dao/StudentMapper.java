package com.sdzdf.serach.dao;

import com.sdzdf.serach.bean.StudentBean;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: z151
 * @Date: 2019/12/26 18:19
 */
@Mapper
public interface  StudentMapper {
    StudentBean studentLogin(StudentBean studentBean);
}
