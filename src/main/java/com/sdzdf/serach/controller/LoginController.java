package com.sdzdf.serach.controller;

import com.sdzdf.serach.base.RestResponse;
import com.sdzdf.serach.base.SystemCode;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;

/**
 * @Auther: z151
 * @Date: 2019/12/25 13:05
 */
@Controller
public class LoginController {
    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @ResponseBody
    @RequestMapping(value ="/login",method = RequestMethod.POST)
    public RestResponse studentLogin( HttpServletRequest request, HttpServletResponse response){

        System.out.println("调用登录方法");
        SystemCode systemCode = SystemCode.OK;
        logger.info("XXXX 用户登录成功.请求狙击击杀");
       RestResponse<Object> objectRestResponse = new RestResponse<>(systemCode.getCode(), systemCode.getMessage());
       objectRestResponse.setMessage("自定义message");
       return objectRestResponse;
   }


}
