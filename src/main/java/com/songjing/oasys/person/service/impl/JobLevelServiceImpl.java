package com.songjing.oasys.person.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.songjing.oasys.person.entity.JobLevel;
import com.songjing.oasys.person.mapper.JobLevelMapper;
import com.songjing.oasys.person.service.JobLevelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * (JobLevel)表服务实现类
 *
 * @author songjing
 * @since 2021-01-26 16:54:38
 */
@Service
@Slf4j
public class JobLevelServiceImpl extends ServiceImpl<JobLevelMapper, JobLevel> implements JobLevelService {

}