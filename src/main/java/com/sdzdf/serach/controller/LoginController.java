package com.sdzdf.serach.controller;

import com.sdzdf.serach.base.RestResponse;
import com.sdzdf.serach.base.SystemCode;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Auther: z151
 * @Date: 2019/12/25 13:05
 */
@Controller
public class LoginController {
    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @ResponseBody
    @RequestMapping(value ="/login",method = {RequestMethod.POST,RequestMethod.GET})
    public RestResponse studentLoginForm(@RequestParam("username") String usernname,@RequestParam("password") String password){
    //public RestResponse studentLogin(String usernname,String password){

        SystemCode systemCode = SystemCode.OK;
        logger.info("XXXX 用户使用form表单登录成功.请求狙杀");
        logger.info("传入username:"+usernname);
        logger.info("传入username:"+password);
       RestResponse<Object> objectRestResponse = new RestResponse<>(systemCode.getCode(), systemCode.getMessage());
       objectRestResponse.setMessage("此处可以自定义登录成功message");
       return objectRestResponse;
   }

    @ResponseBody
    @RequestMapping(value ="/loginajax",method = {RequestMethod.POST,RequestMethod.GET})
    public RestResponse studentLoginAjax(@RequestBody Map<String,String> myMap){

        logger.error("myMap"+myMap);
        SystemCode systemCode = SystemCode.OK;
        logger.info("用户使用ajax方式登录成功.请求狙杀");
        RestResponse<Object> objectRestResponse = new RestResponse<>(systemCode.getCode(), systemCode.getMessage());
        objectRestResponse.setMessage("此处可以自定义登录成功message");
        return objectRestResponse;
    }

    @RequestMapping(value ="/getsubject",method = {RequestMethod.POST,RequestMethod.GET})
    public RestResponse testGetSubject(Map<String,Object> myModel){

        myModel.put("name","科目名称1");
        myModel.put("name","科目名称2");
        List<String>  list = new ArrayList<>();
        list.add("第一个");
        list.add("第二个");
        myModel.put("list",list);

        SystemCode systemCode = SystemCode.OK;
        logger.info("WARN:居然有人调用了获取科目列表的方法.好放肆啊");
        RestResponse<Object> objectRestResponse = new RestResponse<>(systemCode.getCode(), systemCode.getMessage());
        objectRestResponse.setMessage("麻烦不要获取科目信息,谢谢.");
        return objectRestResponse;
    }


    // Login form
    @RequestMapping("/login.htm")
    public String login() {
        return "login.html";
    }

    // Login form with error
    @RequestMapping("/login-error.html")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login.html";
    }

}
