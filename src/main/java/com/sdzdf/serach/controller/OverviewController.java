package com.sdzdf.serach.controller;

import com.sdzdf.serach.base.RestResponse;
import com.sdzdf.serach.base.SystemCode;
import com.sdzdf.serach.bean.KmcjbBean;
import com.sdzdf.serach.dao.KmcjbMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: z151
 * @Date: 2019/12/25 16:55
 */
@Controller
@AllArgsConstructor
public class OverviewController {
    private final KmcjbMapper kmcjbMapper;

    @ResponseBody
    @RequestMapping(value ="/overview/stu",method = RequestMethod.POST)
    public RestResponse studentCheckOverview(HttpServletRequest request, HttpServletResponse response){
        KmcjbBean KmcjbBean2 = kmcjbMapper.queryKmcjb(new KmcjbBean("9004","39","C6","201330093"));
        System.out.println(KmcjbBean2);
        SystemCode systemCode = SystemCode.OK;
        RestResponse<Object> objectRestResponse = new RestResponse<>(systemCode.getCode(), systemCode.getMessage());
        objectRestResponse.setMessage("自定义message222222");

        return objectRestResponse;

    }

}
