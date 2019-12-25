package com.sdzdf.serach.controller;

import com.sdzdf.serach.base.RestResponse;
import com.sdzdf.serach.base.SystemCode;
import com.sdzdf.serach.bean.KmcjbBean;
import com.sdzdf.serach.bean.KscjbBean;
import com.sdzdf.serach.repository.KmcjbService;
import com.sdzdf.serach.repository.KscjbService;
import lombok.AllArgsConstructor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: z151
 * @Date: 2019/12/25 16:55
 */
@Controller
@AllArgsConstructor
public class OverviewController {
    private final KmcjbService kmcjbService;

    @ResponseBody
    @RequestMapping(value ="/overview/stu",method = RequestMethod.POST)
    public RestResponse studentCheckOverview(HttpServletRequest request, HttpServletResponse response){
        KmcjbBean KmcjbBean2 = kmcjbService.queryKmcjb(new KmcjbBean("9004","39","C6","201330093"));
        System.out.println(KmcjbBean2);
        SystemCode systemCode = SystemCode.OK;
        RestResponse<Object> objectRestResponse = new RestResponse<>(systemCode.getCode(), systemCode.getMessage());
        objectRestResponse.setMessage("自定义message222222");

        return objectRestResponse;

    }

}
