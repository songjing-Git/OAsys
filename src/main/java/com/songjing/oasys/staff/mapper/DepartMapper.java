package com.songjing.oasys.staff.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.songjing.oasys.staff.entity.Depart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 部门表(Depart)表服务接口
 *
 * @author songjing
 * @since 2021-01-26 16:06:48
 */
@Mapper
@Repository
public interface DepartMapper extends BaseMapper<Depart> {

    @Select("SELECT DEPT_ID,DEPT_NAME,DEPT_MGR,DEPT_STAFF_COUNT,DEPT_STAFF_MAX " +
            " FROM DEPART WHERE  DEPT_ID=#{ID} ")
    Map<String,Object> selectListById(@Param("ID") int Id);

}