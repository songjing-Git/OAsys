package com.songjing.oasys.finance.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.songjing.oasys.finance.entity.Salary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * (Salary)表服务接口
 *
 * @author songjing
 * @since 2021-01-26 19:13:26
 */
@Mapper
@Repository
public interface SalaryMapper extends BaseMapper<Salary> {

}