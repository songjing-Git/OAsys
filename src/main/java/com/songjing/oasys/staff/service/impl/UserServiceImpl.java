package com.songjing.oasys.staff.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.songjing.oasys.person.entity.JobLevel;
import com.songjing.oasys.person.mapper.JobLevelMapper;
import com.songjing.oasys.staff.entity.User;
import com.songjing.oasys.staff.mapper.DepartMapper;
import com.songjing.oasys.staff.mapper.UserMapper;
import com.songjing.oasys.staff.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * (User)表服务实现类
 *
 * @author songjing
 * @since 2021-01-05 15:23:15
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    DepartMapper departMapper;

    @Autowired
    JobLevelMapper jobLevelMapper;

    @Override
    public boolean login(String username, String password) {
        if (username==null||"".equals(username)) {
            return false;
        }

        return userMapper.login(username, password)==1?true:false;
    }

    @Override
    public Map<String ,Object> getStaffInfoById(int id) {
        Map<String, Object> staffInfoById = userMapper.getStaffInfoById(id);
        if (null!=staffInfoById&&!"".equals(staffInfoById)){
            Object deptId = staffInfoById.get("DEPT_ID");
            //获取员工部门信息
            log.info("===============deptId:"+(int)deptId);
            Map<String,Object> depart = departMapper.selectListById((int)deptId);
            log.info("================depart:"+depart);
            staffInfoById.put("DEPT_NAME",depart.get("DEPT_NAME"));
            //获取员工职位信息
            Object jobLevelId = staffInfoById.get("JOB_LEVEL_ID");
            log.info("===============jobLevelId:"+jobLevelId);
            JobLevel jobLevel = jobLevelMapper.selectById((int)jobLevelId);
            staffInfoById.put("JOB_LEVEL_NAME",jobLevel.getJobLevelName());
            //获取员工籍贯信息
            staffInfoById.get("NATIVE_PLACE");
            //员工性别编码转化
            Object gender = staffInfoById.get("GENDER");
            if ((boolean)gender==true){
                staffInfoById.put("GENDER","男");
            }else {
                staffInfoById.put("GENDER","女");
            }
            return staffInfoById;
        }
        return null;
    }
}