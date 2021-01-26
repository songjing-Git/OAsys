package com.songjing.oasys.staff.controller;


import com.baomidou.mybatisplus.extension.api.ApiController;
import com.songjing.oasys.staff.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * (User)表控制层
 *
 * @author songjing
 * @since 2021-01-05 15:23:15
 */
@RestController
@RequestMapping("user")
@Slf4j
@Api(value = "用户信息接口")
public class UserController extends ApiController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "用户登录接口", notes = "用户登录接口")
    @RequestMapping(value = "/login" ,method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public boolean login(@RequestBody Map<String,String> param){

        String password = param.get("password");
        String username = param.get("username");
        boolean login = userService.login(username, password);

        return login;
    }

    @ApiOperation(value = "查询用户信息接口", notes = "查询用户信息接口")
    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Map<String, Object> getStaffInfoById(@PathVariable("id") int id){
        Map<String, Object> staffInfoById = userService.getStaffInfoById(id);
        log.info("================staffInfoById:"+staffInfoById);
        return staffInfoById;
    }

}