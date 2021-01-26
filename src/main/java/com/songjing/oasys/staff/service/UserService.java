package com.songjing.oasys.staff.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.songjing.oasys.staff.entity.User;

import java.util.Map;

/**
 * (User)表服务接口
 *
 * @author songjing
 * @since 2021-01-05 15:23:14
 */
public interface UserService extends IService<User> {

    boolean login(String username, String password);

    Map<String,Object> getStaffInfoById(int id);
}