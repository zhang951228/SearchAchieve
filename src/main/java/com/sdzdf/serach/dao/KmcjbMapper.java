package com.sdzdf.serach.dao;

import com.sdzdf.serach.bean.KmcjbBean;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: z151
 * @Date: 2019/12/25 16:27
 */
@Mapper
public interface KmcjbMapper {
    KmcjbBean queryKmcjb(KmcjbBean kmcjbBean);
}
