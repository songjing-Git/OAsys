package com.songjing.oasys.staff.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.songjing.oasys.staff.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * (User)表服务接口
 *
 * @author songjing
 * @since 2021-01-05 15:27:02
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @Select("SELECT COUNT(*) FROM USER WHERE 1=1 AND USER_NAME=#{USERNAME} AND PASSWORD =#{PASSWORD}")
    int login(@Param("USERNAME") String username,
                             @Param("PASSWORD") String password);

    /**
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    @Select(" SELECT STAFF_ID,STAFF_NAME ,HEAD_PHOTO,USER_NAME,PASSWORD,GENDER,BIRTHDAY,ID_CARD,WEDLOCK,NATION," +
            " NATIVE_PLACE,POLITIC,EMAIL,PHONE,ADDRESS,DEPT_ID,JOB_LEVEL_ID,WORK_AGE,SALARY_ID,SCHOOL, " +
            " BEGIN_DATE,WORK_STATE,BEGIN_CONTRACT,END_CONTRACT " +
            " FROM USER WHERE 1=1 AND STAFF_ID = #{ID}")
    Map<String,Object> getStaffInfoById(@Param("ID") int id);
}