package com.songjing.oasys.person.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.songjing.oasys.person.entity.JobLevel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * (JobLevel)表服务接口
 *
 * @author songjing
 * @since 2021-01-26 16:54:39
 */
@Mapper
@Repository
public interface JobLevelMapper extends BaseMapper<JobLevel> {

    @Select("SELECT * FROM JOB_LEVEL WHERE JOB_LEVEL_ID=#{ID}")
    JobLevel selectById(@Param("ID") int id);
}