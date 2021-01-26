package com.songjing.oasys.finance.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.songjing.oasys.finance.entity.Salary;
import com.songjing.oasys.finance.mapper.SalaryMapper;
import com.songjing.oasys.finance.service.SalaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * (Salary)表服务实现类
 *
 * @author songjing
 * @since 2021-01-26 19:13:25
 */
@Service
@Slf4j
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements SalaryService {

}