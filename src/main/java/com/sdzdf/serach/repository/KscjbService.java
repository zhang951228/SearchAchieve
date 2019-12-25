package com.sdzdf.serach.repository;

import com.sdzdf.serach.bean.KscjbBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @Auther: z151
 * @Date: 2019/12/25 16:27
 */
@Mapper
public interface KscjbService {
    KscjbBean queryKscjb(Map<String, String> map);

}
